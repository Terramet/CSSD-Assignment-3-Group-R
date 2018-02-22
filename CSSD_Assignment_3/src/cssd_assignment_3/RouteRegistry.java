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
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sam
 */
public class RouteRegistry {
       /*
    Renamed this class for consistancies sake, let me know if you want to change it back to TimeBands
    */
    
    private static RouteRegistry Registry = null;
    private List<Route> routes = null;
    
    protected RouteRegistry(List<Route> list){
        routes = list;
    }
    
    public static RouteRegistry getRegistry() {
        if(Registry == null) {
            try {
                ObjectInputStream inRegistry = new ObjectInputStream(new FileInputStream("RouteRegistry.ser"));
                Registry = (RouteRegistry) inRegistry.readObject(); 
            } catch(ClassNotFoundException c) {
                System.out.println("Error:" + c);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
                if(Registry == null) {
                    List<Route> list =  new ArrayList<>();
                    //****
                    // add some sample routes here
                    //****
                    Registry = new RouteRegistry(list);
                }
        }
        return Registry;
    }

    public void saveRegistry() {
        try {
            ObjectOutputStream outRegistry = new ObjectOutputStream(new FileOutputStream("RouteRegistry.ser"));
            outRegistry.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void add(Route t) {
        routes.add(t);
    }
    
    public List<Route> getRouteList() {
        return routes;
    }
    
    public Route getRoute(String ID) {
        Iterator<Route> itr = routes.iterator();
        while(itr.hasNext()) {
            Route t = itr.next();
            if(t.getRouteID().equals(ID)){
                return t;
            }
        }
        return null;
    } 
}
