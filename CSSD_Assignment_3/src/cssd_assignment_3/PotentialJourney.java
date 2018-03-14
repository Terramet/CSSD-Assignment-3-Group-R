/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.Date;
import java.util.List;

public class PotentialJourney {
    
    public PotentialJourney(Route route, Location beginLoc, Location endLoc, Date startDate, Date endDate) {
        this.route = route;
        this.beginLoc = beginLoc;
        this.endLoc = endLoc;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    private int seekBeginLocation() {
        List<Location> locations = GetRoute().getDestinations().getLocationList();
        for(int ix = 0; ix != locations.size(); ++ix) {
            if (locations.get(ix) == beginLoc)
                return ix;
        }
        return locations.size();
    }
    
    private int seekEndLocation() {
        List<Location> locations = GetRoute().getDestinations().getLocationList();
        for(int ix = 0; ix != locations.size(); ++ix) {
            if (locations.get(ix) == endLoc)
                return ix;
        }
        return locations.size();
    }
    
    public boolean CalculateDistance() {
       
        int begin = seekBeginLocation();
        int end = seekEndLocation();
        
        List<Location> locations = GetRoute().getDestinations().getLocationList();
        
        if (begin == locations.size() || end == locations.size() || begin > end)          
            return false;
        
        while(begin != end) {
            Location at = locations.get(begin);
            Location to = locations.get(begin+1);
            journeyDistance += at.DistanceTo(to);
            begin++;
        }
        
        return true;
    }
    
    public double GetDistance() {
        return journeyDistance;
    }
        
    public Location GetBeginLocation() {
        return beginLoc;
    }
    
    public Location GetEndLocation() {
        return endLoc;
    }
    
    public Date GetStartDate(){
        return startDate;
    }

    public Date GetEndDate(){
        return startDate;
    }
 
    public Route GetRoute() {
        return route;
    }
    
    public double GetDistanceTravelled;
    
    private Route route;
    private Location beginLoc;
    private Location endLoc;
    private Date startDate;
    private Date endDate;
    private double journeyDistance;
}
