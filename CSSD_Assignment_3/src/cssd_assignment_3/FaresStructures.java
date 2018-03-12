package cssd_assignment_3;

import java.util.ArrayList;
import java.util.Date;

class FaresStructures {
    
    FaresStructures() {
        calculatedJourneyCost = 0;
        spentToday = 0;
    }
 
    public void tallyEstSpentToday(double journeyCost) {
     spentToday += journeyCost;   
    }
    
    public double findCheapestTarrif(ConsumerAccount transportAccount,double estSpent, double journeyCost, JourneyHistory journeyHistory) {
        return 0.0;
    }
    
    public ArrayList<Double> getRouteCosts(ArrayList<PotentialJourney> journeys) {
        ArrayList<Double> costs = null;
        return costs;
    }
    
    public double calcCostOfJourney(Journey journey) {
        return 0.0;
    }
    
    public boolean willPassCoverIt(Pass pass, double estSpent) {
        return false;
    }
    
    private double calculatedJourneyCost;
    
    private double spentToday;
}