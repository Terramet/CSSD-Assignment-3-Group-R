/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class EmployeeRegistry implements Serializable{
    /*
    I made this class into a singleton because it didn't make sense to ever have more than one registry in a system.
    It also made managing the class easier so why not.
    
    Now serializes the class so that it keeps the data between runs.
    */
    
    private static EmployeeRegistry Registry = null;
    private List<Employee> employees = null;
    
    protected EmployeeRegistry(List<Employee> list){    //protected so the user cannot instanciate this class
        employees = list;
    }
    
    public static EmployeeRegistry getRegistry() {      //this is a singleton so get the data from file or create a new one if it doesn't exist
        if(Registry == null) {
            try {
                ObjectInputStream inRegistry = new ObjectInputStream(new FileInputStream("EmployeeRegistry.ser"));
                Registry = (EmployeeRegistry) inRegistry.readObject(); 
            } catch(ClassNotFoundException c) {
                System.out.println("Error:" + c);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }   
                if(Registry == null) {                  //if the registry file was empty, make an object
                    List<Employee> list =  new ArrayList<>();
                    list.add(new Employee("Admin", "Admin", 7));
                    list.add(new Employee("Bob", "UselessBob", 0));
                    Registry = new EmployeeRegistry(list);
                }
        }
        return Registry;
    }

    public void saveRegistry() {    //save the data back to file
        try {
            ObjectOutputStream outRegistry = new ObjectOutputStream(new FileOutputStream("EmployeeRegistry.ser"));
            outRegistry.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void add(Employee e) {       //add aa new employee to the list
        employees.add(e);
    }
    
    public List<Employee> getAccountList() {        //return all employees so that the names can be displayed
        return employees;
    }
    
    public Employee getEmployee(String name) {          //return the employee object with the given username
        Iterator<Employee> itr = employees.iterator();
        while(itr.hasNext()) {
            Employee e = itr.next();
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }
}
