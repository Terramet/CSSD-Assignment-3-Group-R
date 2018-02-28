/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sam
 */
public class RouteController {
    private RouteRegistry routes;
    
    RouteController(){
        this.routes = RouteRegistry.getRegistry();
    }
    
    public List<Route> getRoutes(Location start, Location end, Date dateS, Date dateR, LocalTime timeS, LocalTime timeR){
        List<Route> locs = null;
        Iterator<Route> itr = routes.getRouteList().iterator();
        while(itr.hasNext()) {
            
            Route t = itr.next();
            List<Location> l = t.getDestinations().getLocationList();
            Iterator<TimeBand> time = t.getTimeBands().getTimeBandList().iterator();
            boolean tStart = false;
            boolean inTime = false;
            
            while(itr.hasNext()) {
                TimeBand ti = time.next();
                if (ti.getStart().isBefore(timeS)){
                    tStart = true;
                }
                if (tStart){
                    if(timeS != timeR)
                    {
                        if (ti.getEnd().isAfter(timeR)){
                            inTime = true;
                        }
                        //routes are directional so this doesn't make sense?
                    } else {inTime = true;}
                }
            }
            
            if (inTime){
                if(start == end) { // if only one location is passed
                    if (l.contains(start)){ //only check for that one
                        locs.add(t);
                    }
                } else if(l.contains(start) & l.contains(end)){ //if this route contains both start and end
                    for (int i = l.indexOf(start); i < l.size(); i++){
                        if (l.get(i) == end){ // if end is after start
                            locs.add(t);
                        }
                    }

                }
            }
        }
        return locs;
    }
    
    public List<Route> getRoutes(Location start, Location end){
        List<Route> locs = new ArrayList();
        Iterator<Route> itr = routes.getRouteList().iterator();
        boolean startFound = false;
        while(itr.hasNext()) {
            
            Route t = itr.next();
            Iterator<Location> li = t.getDestinations().getLocationList().iterator();
            
            while (li.hasNext()){
                Location l = li.next();
                if(start == end) { // if only one location is passed
                    if (l.getID().equals(start.getID())){ //only check for that one
                        locs.add(t);
                    }
                } else if(l.getID().equals(start.getID())){ //if this route contains the start
                    startFound = true;
                } else if(startFound & l.getID().equals(end.getID())){ // if start is found & the route contains end
                    locs.add(t);
                }
            }
            startFound = false;

        }
        return locs;
    }
    
    public List<Route> getRoutes(Location start, Location end, Date dateS, Date dateR){ // acts the same as getRoutes(start, end)
        List<Route> locs = null;
        Iterator<Route> itr = routes.getRouteList().iterator();
        while(itr.hasNext()) {
            
            Route t = itr.next();
            List<Location> l = t.getDestinations().getLocationList();
            
            if(start == end) { // if only one location is passed
                if (l.contains(start)){ //only check for that one
                    locs.add(t);
                }
            } else if(l.contains(start) & l.contains(end)){ //if this route contains both start and end
                for (int i = l.indexOf(start); i < l.size(); i++){
                    if (l.get(i) == end){ // if end is after start
                        locs.add(t);
                    }
                }

            }
        }
        return locs;
    }
}
