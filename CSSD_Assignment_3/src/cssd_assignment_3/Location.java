/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.lang.Math;

/**
 *
 * @author Ascendant
 */
public class Location implements Serializable  {
    
    // Adding a name to this class so that we can identify where it is based on a report
    private final String name;
    private final String locID;
    
    // longtitude and latitude.
    private final double x;
    private final double y;
    
    public Location(String name, String ID, double x, double y){
        this.name = name;
        this.locID = ID;
        this.x = x;
        this.y = y;
    }
    
    // added to enable basic calculation of fares.
    public double DistanceTo(Location to) {
        double diffX = to.x - x;
        double diffY = to.y - y;
        double diffX2 = Math.pow(diffX, 2);
        double diffY2 = Math.pow(diffY, 2);
        double distance = Math.sqrt(diffX2 + diffY2);
        return distance;
    }
    
    public String getID(){
        return this.locID;
    }
}
