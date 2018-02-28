/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.ArrayList;


public class PhysicalConsumerIdentifierRegistry {
    
    PhysicalConsumerIdentifierRegistry() {
        registry = new ArrayList<>();
    }
    
    void Add(PhysicalConsumerIdentifier phyiscalID) {
       registry.add(phyiscalID); 
    }
    
    String GetAccountID(String phyiscalID) {
        for(int ix = 0; ix != registry.size(); ++ix) {
            if (registry.get(ix).MatchesPhysicalID(phyiscalID))
                return registry.get(ix).GetAccount();
        }
        return null;
    }
    
    ArrayList<PhysicalConsumerIdentifier> registry;
}
