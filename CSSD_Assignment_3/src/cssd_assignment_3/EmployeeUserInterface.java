/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import cssd_assignment_3.Reports.Report;
import cssd_assignment_3.Reports.ReportRegistry;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class EmployeeUserInterface {
    /*
    
    */
    private String password;
    private String encrpytedPassword;
    private String name;
    private AccountManager manager = null;
    private ReportRegistry rReg = ReportRegistry.getRegistry();
    private Report currentOpenReport = null;

    public EmployeeUserInterface() {
        manager = new AccountManager();
    }
    
    public boolean login(String name, String password) {    //pass login details to the manager
        return manager.login(name, password);
    }
    
    public List<Employee> getAccountList() {    //get the account list so the they can be displayed on the GUI
        return manager.getAccountList();
    }
    
    public boolean getActiveIsAdmin() {     //Check active user is admin
        return manager.getActiveIsAdmin();
    }
    
    public void saveRegistries() {      //send save signal to accountmanager
        manager.saveRegistries();
    }
    
    public void addUser(Employee e) {   //add a new employee
        manager.addUser(e);
    }
    
    public boolean logout(){        //signal to log out
        return manager.logout();
    }
    
    public Report getOpenReport(){      //return the current open report
        return currentOpenReport;
    }
    
    public void getReport(int type, Date from, Date to){        //open new report
        currentOpenReport = rReg.getReport(type, from, to);
    }
}
