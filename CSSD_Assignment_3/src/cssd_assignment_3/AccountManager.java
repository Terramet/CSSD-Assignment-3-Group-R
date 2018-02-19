/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

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
    
    There is also no way to add new accounts so there will only ever be the Admin account with the current setup
    */
    private String userName;
    private String password;
    private Employee activeUser;
    private final EmployeeRegistry Registry;
    
    public AccountManager() {
       this.Registry = EmployeeRegistry.getRegistry();       
    }
    
    private void setActiveUser(Employee e) {
        this.activeUser = e;
    }
    
    public boolean login(String username, String password){
        Employee e = Registry.getEmployee(username);
        if (e != null){
            if (e.passwordMatch(password)) {
                setActiveUser(e);
                return true;
            } 
        }
        return false;
    }
    
    public List<Employee> getAccountList() {
        return Registry.getAccountList();
    }
    
    public boolean getActiveIsAdmin() {
        return activeUser.isEmployeeAdmin(activeUser);
    }
    
    public void saveAccounts() {
        Registry.saveRegistry();
    }
}
