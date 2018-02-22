/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ascendant
 */
public class VehicleRegistry implements Serializable {
    private static VehicleRegistry Registry = null;
    private List<Vehicle> vehicles = null;
    
    protected VehicleRegistry(List<Vehicle> list){
        vehicles = list;
    }
    
    public static VehicleRegistry getRegistry() {
        if(Registry == null) {
            try {
                ObjectInputStream inRegistry = new ObjectInputStream(new FileInputStream("VehicleRegistry.ser"));
                Registry = (VehicleRegistry) inRegistry.readObject(); 
            } catch(ClassNotFoundException c) {
                System.out.println("Error:" + c);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
                if(Registry == null) {
                    List<Vehicle> list =  new ArrayList<>();
                    list.add(new Vehicle("FDV 547T", 52));
                    list.add(new Vehicle("SIG 4508", 43));
                    Registry = new VehicleRegistry(list);
                }
        }
        return Registry;
    }

    public void saveRegistry() {
        try {
            ObjectOutputStream outRegistry = new ObjectOutputStream(new FileOutputStream("VehicleRegistry.ser"));
            outRegistry.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void add(Vehicle v) {
        vehicles.add(v);
    }
    
    public List<Vehicle> getVehicleList() {
        return vehicles;
    }
    
    public Vehicle getVehicle(String ID) {
        Iterator<Vehicle> itr = vehicles.iterator();
        while(itr.hasNext()) {
            Vehicle v = itr.next();
            if(v.getID().equals(ID)){
                return v;
            }
        }
        return null;
    }
}
