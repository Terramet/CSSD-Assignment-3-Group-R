/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

public class Gate {

    public Gate(int ID, boolean entry, Location loc) {
        gateID = ID;
        this.entry = entry;
        open = false;
        location = loc;
    }
    
    public boolean isOpen() {
        return open;
    }
    
    public void open() {
        open = true;
    }
    
    public void close() {
        open = false;
    }
    
    public Location getLocation() {
        return location;
    }
    
    private int gateID;
    private boolean entry;
    private boolean open;
    private Location location;
}
