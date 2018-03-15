package cssd_assignment_3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

class FaresStructures {
    
    private TariffRegistry m_tariffs;
    private OffPeakFare opFareTariff;
    private OAPFare oapFareTariff;
    
    FaresStructures() {
        calculatedJourneyCost = 0;
        spentToday = 0;
        
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(1999, 1, 1);
        Date startDate = new Date(cal.getTimeInMillis());
        cal.set(2020, 12, 30);
        Date endDate = new Date(cal.getTimeInMillis());
        
        TimeBand morningPeak = new TimeBand(0, LocalTime.of(0, 0, 0), LocalTime.of(8, 0, 0), true);
        TimeBand eveningPeak = new TimeBand(0, LocalTime.of(18, 0, 0), LocalTime.of(23, 59, 59), true);
                
        TimeBandList onPeakBands = new TimeBandList();
        onPeakBands.add(morningPeak);
        onPeakBands.add(eveningPeak);
        
        TimeBand morningOffPeak = new TimeBand(0, LocalTime.of(0, 0, 0), LocalTime.of(8, 0, 0), false);
        TimeBand midDayOffPeak  = new TimeBand(0, LocalTime.of(9, 30, 0), LocalTime.of(16, 30, 0), false);
        TimeBand eveningOffPeak = new TimeBand(0, LocalTime.of(18, 0, 0), LocalTime.of(23, 59, 59), false);
        
        TimeBandList offPeakBands = new TimeBandList();
        offPeakBands.add(morningOffPeak);
        offPeakBands.add(eveningOffPeak);
        
        opFareTariff = new OffPeakFare(0, 0.125, startDate, endDate, onPeakBands, offPeakBands, false, true);
        
        m_tariffs = new TariffRegistry(); 
        m_tariffs.add(opFareTariff);
        
        oapFareTariff = new OAPFare(1, 0.075, startDate, endDate, onPeakBands, offPeakBands, true);
        
        m_tariffs.add(oapFareTariff);
    }
 
    public void tallyEstSpentToday(double journeyCost) {
     spentToday += journeyCost;   
    }
    
    public Tariffs findCheapestTarriff(ConsumerAccount account, Journey journey ) {
        Tariffs cheapest = m_tariffs.findCheapestPrice(account, journey);
        if (cheapest == null)
            cheapest = opFareTariff;
        
        return cheapest;
    }
    
    public List<Double> getRouteCosts(ArrayList<PotentialJourney> potentialJourneys) {
        List<Double> results = new ArrayList<>();
        for (int ix = 0; ix != potentialJourneys.size(); ++ix) {
            results.add(opFareTariff.calculateRouteCost(potentialJourneys.get(ix)));    
        }
        return results;
    }
    
    public double calculateCostOfJourney(Journey journey) {
        return opFareTariff.calculateJourneyCost(journey);
    }
    
    public boolean willPassCoverIt(Pass pass, double estSpent) {
        return true;
    }
    
    private double calculatedJourneyCost;
    
    private double spentToday;
}