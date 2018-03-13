/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import cssd_assignment_3.Route;
import cssd_assignment_3.RouteRegistry;
import cssd_assignment_3.Vehicle;
import cssd_assignment_3.VehicleRegistry;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class ReportRegistry implements Serializable{
    private static ReportRegistry Registry = null;
    private List<Report> reports = null;
    
    private static FareEvasion createReport(int dodged, String name, int type, int y, int m, int d, int y2, int m2, int d2, Route r, Vehicle v){
        Date sD = new GregorianCalendar(y, m, d).getTime();
        Date eD = new GregorianCalendar(y2, m2, d2).getTime();
        LocalTime sT = null;
        LocalTime eT = null;
        return new FareEvasion(dodged,name, type, sD, eD, sT, eT, r, v);
    }
    
    protected ReportRegistry(List<Report> list){
        reports = list;
    }
    
    public static ReportRegistry getRegistry() {
        if(Registry == null) {
            try {
                ObjectInputStream inRegistry = new ObjectInputStream(new FileInputStream("ReportRegistry.ser"));
                Registry = (ReportRegistry) inRegistry.readObject(); 
            } catch(ClassNotFoundException c) {
                System.out.println("Error:" + c);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
                if(Registry == null) {
                    List<Report> list =  new ArrayList<>();
                    RouteRegistry rReg = RouteRegistry.getRegistry();
                    Route route1 = rReg.getRoute("1");
                    Route route2 = rReg.getRoute("2");
                    VehicleRegistry vReg = VehicleRegistry.getRegistry();
                    Vehicle v1 = vReg.getVehicle("FDV 547T");
                    Vehicle v2 = vReg.getVehicle("SIG 4508");
                    list.add(createReport(37, "0001", 2, 2018, Calendar.JANUARY, 1, 2018, Calendar.JANUARY, 7, route1, v1));
                    list.add(createReport(63, "0002", 2, 2018, Calendar.JANUARY, 8, 2018, Calendar.JANUARY, 14, route2, v2));
                    Registry = new ReportRegistry(list);
                }
        }
        return Registry;
    }

    public void saveRegistry() {
        try {
            ObjectOutputStream outRegistry = new ObjectOutputStream(new FileOutputStream("ReportRegistry.ser"));
            outRegistry.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void add(Report r) {
        reports.add(r);
    }
    
    public List<Report> getReportList() {
        return reports;
    }
    
    public Report getReport(int type, Date from, Date to) {
        Iterator<Report> itr = reports.iterator();
        while(itr.hasNext()) {
            Report r = itr.next();
            if((from.compareTo(r.getStartDate()) == 0) && (to.compareTo(r.getEndDate()) == 0) && r.getType() == type){
                return r;
            }
        }
        return null;
    }
}
