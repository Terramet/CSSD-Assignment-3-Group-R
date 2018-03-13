/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sam
 */
public class Route implements Serializable{
    
    
    private TimeBandList timeBands;
    private LocationList destinations;
    private String routeID;
    private double routeIncome;
    private double routeRunningCosts;
    private double routeMaintenanceCosts;
    
    Route(TimeBandList timeBands, LocationList destinations, String ID, double income, double runCost, double maintCost){
        this.timeBands = timeBands;
        this.destinations = destinations;
        this.routeID = ID;
        this.routeIncome = income;
        this.routeMaintenanceCosts = maintCost;
        this.routeRunningCosts = runCost;
    }
    
    public String getRouteID(){
        return routeID;
    }
    
    public double getCostOfRunning(){
       return routeRunningCosts;
    }
    
    public double getCostOfMaintenance(){
       return routeMaintenanceCosts;
    }
    
    public LocationList getDestinations(){
       return destinations;
    }
    
    public TimeBandList getTimeBands(){
        return timeBands;
    }
    
    public double calcDistBetweenStops(){
       //assumes that the locations it contains are in the order visited
       List<Location> locs = destinations.getLocationList();
       double totalDist = 0;
       for (int i = 0; i < (locs.size() - 1); i++){
           double distance = locs.get(i).DistanceTo(locs.get(i+1));
           totalDist += distance;
       }
       return totalDist;
    }
    
    @Override
    public String toString(){
        List<Location> locs = destinations.getLocationList();
        String lastStop = locs.get(locs.size()-1).getName();
        return lastStop;
    }
}
