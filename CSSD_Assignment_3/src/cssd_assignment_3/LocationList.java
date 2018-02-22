/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ascendant
 */
public class LocationList implements Serializable  {
    /*
        Changed from a singleton to being jsut a list 
    */
    private List<Location> locations = null;
    
    public LocationList(List<Location> list){
        locations = list;
    }
    
    public void add(Location l) {
        locations.add(l);
    }
    
    public List<Location> getLocationList() {
        return locations;
    }
    
    public Location getVehicle(String ID) {
        Iterator<Location> itr = locations.iterator();
        while(itr.hasNext()) {
            Location l = itr.next();
            if(l.getID().equals(ID)){
                return l;
            }
        }
        return null;
    }
}
