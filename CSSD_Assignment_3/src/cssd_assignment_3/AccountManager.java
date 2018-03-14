/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import cssd_assignment_3.Reports.ReportRegistry;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class AccountManager {
    /* 
    I was wrting down the changes that each class needed however I couldn't actually write this class and make it work without changing it
    It has a connection to the EmployeeRegistry class but didn't actually have a variable to access it, so I added a funciton to get the
    registry, when the class is created, and a variable to store it
    
    There is also no way to add new accounts so there will only ever be the Admin account with the current setup.
    
    Why does this have access to the RouteController but does nothing with it?
    
    Why does this have an assignVehicle, when it has no access to vehicle?
    I also have no idea what assignVehicle does? What does it change? What class does it change? 
    
    Does it only affect a report? 
    Why does the report have to assign a vehicle, if so?
    */
    private String userName;
    private String password;
    private Employee activeUser;
    private final EmployeeRegistry eReg;
    private final VehicleRegistry vReg;
    private final ReportRegistry rReg;
    
    public AccountManager() {   //set up registries
       this.eReg = EmployeeRegistry.getRegistry();         
       this.vReg = VehicleRegistry.getRegistry();       
       this.rReg = ReportRegistry.getRegistry();       
    }
    
    private void setActiveUser(Employee e) {    //set the active user
        this.activeUser = e;
    }
    
    public boolean login(String username, String password){
        Employee e = eReg.getEmployee(username);    //get the employee with said username
        if (e != null){
            if (e.passwordMatch(password)) {        //check provided password against stored
                setActiveUser(e);
                return true;
            } 
        }
        return false;
    }
    
    public boolean logout() {   //log the user out, return if they successfully logged out
        activeUser = null;
        return (activeUser == null);
    }
    
    public List<Employee> getAccountList() {    //get the list of accounts in order to display them
        return eReg.getAccountList();
    }
    
    public boolean getActiveIsAdmin() {         //check if active user is an admin
        return activeUser.isEmployeeAdmin();
    }
    
    public void saveRegistries() {      //save any changes to the registries
        eReg.saveRegistry();        
        vReg.saveRegistry();
        rReg.saveRegistry();
    }
    
    public void addUser(Employee e) {       //add a new user
        eReg.add(e);
    }
}
