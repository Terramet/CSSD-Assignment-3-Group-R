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
public class Vehicle implements Serializable {
    /*
        Already had to add getID.
        There is absolutely no reason for Vehicle and TimeBand to be associated.
    */
    private final boolean active = false;
    private final boolean broken = false;
    //private enumeratedVehicleType type; //what is this?
    private final String vehicleID;
    //private loc currentLoc; //what is a loc? I know its a location but theres no Loc class and theres no connection to the Location class either
    private boolean full;
    private final int capacity;
    
    public Vehicle(String vID, int c) {
        this.vehicleID = vID;
        this.capacity = c;
    }
    
    public String getID() {
        return vehicleID;
    }
    
    @Override
    public String toString(){
        return vehicleID;
    }
}
