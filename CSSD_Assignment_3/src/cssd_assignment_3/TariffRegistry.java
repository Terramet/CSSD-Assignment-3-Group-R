/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.ArrayList;

public class TariffRegistry {

    TariffRegistry() {
        m_tariffs = new ArrayList<>();
    }
    
    void add(Tariffs tariff) {
        m_tariffs.add(tariff);
    }
    
    int size() {
        return m_tariffs.size();
    }
    
    Tariffs findCheapestPrice(ConsumerAccount account, Journey journey) {
        if(m_tariffs.isEmpty())
            return null;
        
        double cheapest = Double.MAX_VALUE;
        Tariffs cheapestTariff = null;
        for (int ix = 0; ix != m_tariffs.size(); ++ix) {
            Tariffs next = m_tariffs.get(ix);
            if (next.getTariffAvailability(account, journey)) {
                double nextTariffCost = next.calculateJourneyCost(journey);
                if (nextTariffCost < cheapest) {
                    cheapest = nextTariffCost;
                    cheapestTariff = next;
                }
            }
        }
        return cheapestTariff;
    }
    
    ArrayList<Tariffs> m_tariffs; 
}
