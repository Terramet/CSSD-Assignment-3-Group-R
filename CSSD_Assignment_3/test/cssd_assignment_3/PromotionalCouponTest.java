/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
public class PromotionalCouponTest {
    
    public PromotionalCouponTest() {
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
     * Test of getID method, of class PromotionalCoupon.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        
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
        
        Date sD = new GregorianCalendar(2018, Calendar.JANUARY, 1).getTime();

        PromotionalCoupon instance = new PromotionalCoupon("00003487", sD, 6, list);
        String expResult = "00003487";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of useCoupon method, of class PromotionalCoupon.
     */
    @Test
    public void testUseCoupon() {
        System.out.println("useCoupon - Valid");
        
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
        Date sD = new GregorianCalendar(2018, Calendar.OCTOBER, 1).getTime();
        Date useDate = new GregorianCalendar(2017, Calendar.JANUARY, 1).getTime();

        PromotionalCoupon instance = new PromotionalCoupon("00003487", sD, 6.50, list);
        
        Route route = route1;
        double expResult = 6.50;
        double result = instance.useCoupon(useDate, route);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testUseCouponExpired() {
        System.out.println("useCoupon - Expired");
        
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
        Date sD = new GregorianCalendar(2018, Calendar.JANUARY, 1).getTime();
        Date useDate = new GregorianCalendar(2017, Calendar.JANUARY, 1).getTime();

        PromotionalCoupon instance = new PromotionalCoupon("00003487", sD, 6.50, list);
        
        Route route = route1;
        double expResult = -1.0;
        double result = instance.useCoupon(useDate, route);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testUseCouponInvalidRoute() {
        System.out.println("useCoupon - Invalid Route");
        
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
        
        List<Location> newLocs3 = new ArrayList();
        newLocs2.add(loc5);
        newLocs2.add(loc3);
        newLocs2.add(loc4);
        LocationList r3Locs = new LocationList(newLocs3);

        TimeBand time1 = new TimeBand(0,LocalTime.of(8, 0),LocalTime.of(9, 0),true); // peak is between 8 and 9
        TimeBand time2 = new TimeBand(1,LocalTime.of(9, 0),LocalTime.of(22, 0),false);

        List<TimeBand> times = new ArrayList();
        times.add(time1);
        times.add(time2);
        TimeBandList timeBands = new TimeBandList(times);

        Route route1 = new Route(timeBands, r1Locs,"1",10000,1500,5000); // nottingham to leeds
        Route route2 = new Route(timeBands, r2Locs,"2",15000,4000,3000); // leeds to nottingham
        Route route3 = new Route(timeBands, r3Locs,"3",15000,4000,3000); // random route for invalid route
        
        list.add(route1);
        list.add(route2);
        Date sD = new GregorianCalendar(2018, Calendar.OCTOBER, 1).getTime();
        Date useDate = new GregorianCalendar(2017, Calendar.JANUARY, 1).getTime();

        PromotionalCoupon instance = new PromotionalCoupon("00003487", sD, 6.50, list);
        
        Route route = route3;
        double expResult = -2.0;
        double result = instance.useCoupon(useDate, route);
        assertEquals(expResult, result, 0.0);
    }
    
}
