/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ascendant
 */
public class ReportRegistry {
    private static ReportRegistry Registry = null;
    private List<Report> reports = null;
    
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
                    list.add(new Report());
                    list.add(new Report());
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
    
    public Report getReport() {
        return null;
    }
}
