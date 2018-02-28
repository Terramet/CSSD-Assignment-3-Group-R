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
                    
                    Location loc1 = new Location("Sheffield","1",6,-10);
                    Location loc2 = new Location("Chesterfield","2",1,-4);
                    Location loc3 = new Location("Dronfield","3",0,-2);
                    Location loc4 = new Location("Nottingham","4",0,0);
                    Location loc5 = new Location("Leeds","5",-3,10);
                    
                    List<Location> newLocs = new ArrayList();
                    newLocs.add(loc4);
                    newLocs.add(loc1);
                    newLocs.add(loc2);
                    newLocs.add(loc3);
                    newLocs.add(loc5);
                    LocationList r1Locs = new LocationList(newLocs);
                    
                    List<Location> newLocs2 = new ArrayList();
                    newLocs2.add(loc5);
                    newLocs2.add(loc3);
                    newLocs2.add(loc1);
                    newLocs2.add(loc4);
                    LocationList r2Locs = new LocationList(newLocs2);
                    
                    TimeBand time1 = new TimeBand(0,LocalTime.of(8, 0),LocalTime.of(9, 0),true); // peak is between 8 and 9
                    TimeBand time2 = new TimeBand(1,LocalTime.of(9, 0),LocalTime.of(22, 0),false);
                    
                    List<TimeBand> times = new ArrayList();
                    times.add(time1);
                    times.add(time2);
                    TimeBandList timeBands = new TimeBandList(times);
                    
                    Route route1 = new Route(timeBands, r1Locs,"1",10000,1500,5000); // nottingham to leeds
                    Route route2 = new Route(timeBands, r2Locs,"2",15000,4000,3000); // leeds to nottingham
                    list.add(route1);
                    list.add(route2);

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
