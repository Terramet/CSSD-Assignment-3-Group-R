/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;

/**
 *
 * @author Ascendant
 */
public class Location implements Serializable  {
    /*
        Adding a name to this class so that we can identify where it is based on a report
    */
    private final String name;
    private final String locID;
    private final double x;
    private final double y;
    
    public Location(String name, String ID, double x, double y){
        this.name = name;
        this.locID = ID;
        this.x = x;
        this.y = y;
    }
    
    public double DistanceTo(Location to) {
        double x2 = Math.pow(x, 2);
        double y2 = Math.pow(y, 2);
        double distance = Math.sqrt(x2 + y2);
        return distance;
    }
    
    public String getID(){
        return this.locID;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
