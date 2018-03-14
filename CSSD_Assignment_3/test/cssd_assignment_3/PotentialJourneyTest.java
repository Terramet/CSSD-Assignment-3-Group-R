/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
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
public class PotentialJourneyTest {
    
    PotentialJourney instance = null;
    
    public PotentialJourneyTest() {
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

        TimeBand time1 = new TimeBand(0,LocalTime.of(8, 0),LocalTime.of(9, 0),true); // peak is between 8 and 9
        TimeBand time2 = new TimeBand(1,LocalTime.of(9, 0),LocalTime.of(22, 0),false);

        List<TimeBand> times = new ArrayList();
        times.add(time1);
        times.add(time2);
        TimeBandList timeBands = new TimeBandList(times);

        Route route1 = new Route(timeBands, r1Locs,"1",10000,1500,5000); // nottingham to leeds
        
        instance = new PotentialJourney(route1, loc4, loc5, new Date(), new Date());
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
     * Test of CalculateDistance method, of class PotentialJourney.
     */
    @Test
    public void testCalculateDistance() {
        System.out.println("CalculateDistance");
        boolean expResult = true;
        boolean result = instance.CalculateDistance();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetDistance method, of class PotentialJourney.
     */
    @Test
    public void testGetDistance() {
        System.out.println("GetDistance");
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
        boolean temp = instance.CalculateDistance();
        double result = instance.GetDistance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of GetBeginLocation method, of class PotentialJourney.
     */
    @Test
    public void testGetBeginLocation() {
        System.out.println("GetBeginLocation");
        Location expResult = new Location("Nottingham","4",0,0);
        Location result = instance.GetBeginLocation();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of GetEndLocation method, of class PotentialJourney.
     */
    @Test
    public void testGetEndLocation() {
        System.out.println("GetEndLocation");
        Location expResult = new Location("Leeds","5",-3,10);
        Location result = instance.GetEndLocation();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of GetStartDate method, of class PotentialJourney.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("GetStartDate");
        Date expResult = new Date();
        Date result = instance.GetStartDate();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of GetEndDate method, of class PotentialJourney.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("GetEndDate");
        Date expResult = new Date();
        Date result = instance.GetEndDate();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of GetRoute method, of class PotentialJourney.
     */
    @Test
    public void testGetRoute() {
        System.out.println("GetRoute");
        
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

        TimeBand time1 = new TimeBand(0,LocalTime.of(8, 0),LocalTime.of(9, 0),true); // peak is between 8 and 9
        TimeBand time2 = new TimeBand(1,LocalTime.of(9, 0),LocalTime.of(22, 0),false);

        List<TimeBand> times = new ArrayList();
        times.add(time1);
        times.add(time2);
        TimeBandList timeBands = new TimeBandList(times);

        Route route1 = new Route(timeBands, r1Locs,"1",10000,1500,5000); // nottingham to leeds
        
        Route expResult = route1;
        Route result = instance.GetRoute();
        assertEquals(expResult.toString(), result.toString());
    }
    
}
