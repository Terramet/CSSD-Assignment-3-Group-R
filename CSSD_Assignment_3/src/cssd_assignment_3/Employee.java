/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;

/**
 *
 * @author Ascendant
 */
public class Employee implements Serializable {
    /*
    Rather than just changing to classes I thought I would write the changes down so that we can add this to the report
    This class has no unique identifier and the collection class is trying to find an employee class by name
    if 2 employees have the same name then it will always return the first one in the list so it will probably
    need changing to use a unique ID
    */
    private final String name;
    private final String password;
    private final int securityLevel;
    private final String salt;
    
    public Employee (String n, String p, int sL, String salt) {
        this.name = n;
        this.password = p;
        this.securityLevel = sL;
        this.salt = salt;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getSalt() {
        return this.salt;
    }
    
    public boolean passwordMatch(String password) {
        return this.password.equals(password);
    }
    
    public boolean isEmployeeAdmin(Employee e) {
        return e.securityLevel >= 7;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
