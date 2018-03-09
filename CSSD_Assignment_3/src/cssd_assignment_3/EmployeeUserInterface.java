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
public class EmployeeUserInterface {
    /*
    
    */
    private String password;
    private String encrpytedPassword;
    private String name;
    private AccountManager manager = null;
    
    public EmployeeUserInterface() {
        manager = new AccountManager();
    }
    
    public boolean login(String name, String password) {
        return manager.login(name, password);
    }
    
    public List<Employee> getAccountList() {
        return manager.getAccountList();
    }
    
    public boolean getActiveIsAdmin() {
        return manager.getActiveIsAdmin();
    }
    
    public void saveAccounts() {
        manager.saveAccounts();
    }
    
    public void addUser(Employee e) {
        manager.addUser(e);
    }
    
    public Report viewReport(){
        return null;
    }
}
