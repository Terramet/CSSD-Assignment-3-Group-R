package cssd_assignment_3;

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
    
    public double getRouteCosts(RouteRegistry routeRegistry, Date start, Date ret) {
        return 0.0;
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