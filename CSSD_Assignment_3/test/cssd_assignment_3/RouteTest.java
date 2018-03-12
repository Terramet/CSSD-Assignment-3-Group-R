/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ascendant
 */
public class RouteTest {
    
    Route instance = null;
    
    public RouteTest() {
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
        
        TimeBand time1 = new TimeBand(0,LocalTime.of(8, 0),LocalTime.of(9, 0),true); // peak is between 8 and 9
        TimeBand time2 = new TimeBand(1,LocalTime.of(9, 0),LocalTime.of(22, 0),false);

        List<TimeBand> times = new ArrayList();
        times.add(time1);
        times.add(time2);
        TimeBandList timeBands = new TimeBandList(times);
        
        Route route1 = new Route(timeBands, r1Locs,"1",10000,1500,5000); // nottingham to leeds
        instance = route1;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRouteID method, of class Route.
     */
    @Test
    public void testGetRouteID() {
        System.out.println("getRouteID");
        String expResult = "1";
        String result = instance.getRouteID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCostOfRunning method, of class Route.
     */
    @Test
    public void testGetCostOfRunning() {
        System.out.println("getCostOfRunning");
        double expResult = 1500;
        double result = instance.getCostOfRunning();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getCostOfMaintenance method, of class Route.
     */
    @Test
    public void testGetCostOfMaintenance() {
        System.out.println("getCostOfMaintenance");
        double expResult = 5000;
        double result = instance.getCostOfMaintenance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDestinations method, of class Route.
     */
    @Test
    public void testGetDestinations() {
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
        
        System.out.println("getDestinations");
        LocationList expResult = r1Locs;
        LocationList result = instance.getDestinations();
        assertEquals(expResult.getLocationList().size(), result.getLocationList().size());
    }

    /**
     * Test of getTimeBands method, of class Route.
     */
    @Test
    public void testGetTimeBands() {
        TimeBand time1 = new TimeBand(0,LocalTime.of(8, 0),LocalTime.of(9, 0),true); // peak is between 8 and 9
        TimeBand time2 = new TimeBand(1,LocalTime.of(9, 0),LocalTime.of(22, 0),false);

        List<TimeBand> times = new ArrayList();
        times.add(time1);
        times.add(time2);
        TimeBandList timeBands = new TimeBandList(times);
        
        System.out.println("getTimeBands");
        TimeBandList expResult = timeBands;
        TimeBandList result = instance.getTimeBands();
        assertEquals(expResult.getTimeBandList().size(), result.getTimeBandList().size());
    }

    /**
     * Test of calcDistBetweenStops method, of class Route.
     */
    @Test
    public void testCalcDistBetweenStops() {
        Location loc4 = new Location("Nottingham","4",0,0);
        Location loc1 = new Location("Sheffield","1",6,-10);
        Location loc2 = new Location("Chesterfield","2",1,-4);
        Location loc3 = new Location("Dronfield","3",0,-2);
        Location loc5 = new Location("Leeds","5",-3,10);
        
        System.out.println("calcDistBetweenStops");
        double expResult = Math.sqrt(Math.pow((loc4.getX() - loc1.getX()), 2) + Math.pow((loc4.getY() - loc1.getY()), 2)) 
                + Math.sqrt(Math.pow((loc1.getX() - loc2.getX()), 2) + Math.pow((loc1.getY() - loc2.getY()), 2))
                + Math.sqrt(Math.pow((loc2.getX() - loc3.getX()), 2) + Math.pow((loc2.getY() - loc3.getY()), 2))
                + Math.sqrt(Math.pow((loc3.getX() - loc5.getX()), 2) + Math.pow((loc3.getY() - loc5.getY()), 2));
        double result = instance.calcDistBetweenStops();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Route.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Leeds";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
