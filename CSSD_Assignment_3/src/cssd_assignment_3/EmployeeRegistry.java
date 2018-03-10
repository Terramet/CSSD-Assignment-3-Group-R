/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import com.berry.BCrypt;
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
    
    protected EmployeeRegistry(List<Employee> list){
        employees = list;
    }
    
    public static EmployeeRegistry getRegistry() {
        if(Registry == null) {
            try {
                ObjectInputStream inRegistry = new ObjectInputStream(new FileInputStream("EmployeeRegistry.ser"));
                Registry = (EmployeeRegistry) inRegistry.readObject(); 
            } catch(ClassNotFoundException c) {
                System.out.println("Error:" + c);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
                if(Registry == null) {
                    List<Employee> list =  new ArrayList<>();
                    String salt1 = BCrypt.gensalt();
                    list.add(new Employee("Admin", BCrypt.hashpw("Admin", salt1), 7, salt1));
                    String salt2 = BCrypt.gensalt();
                    list.add(new Employee("Bob", BCrypt.hashpw("UselessBob", salt2), 0, salt2));
                    Registry = new EmployeeRegistry(list);
                }
        }
        return Registry;
    }

    public void saveRegistry() {
        try {
            ObjectOutputStream outRegistry = new ObjectOutputStream(new FileOutputStream("Registry.ser"));
            outRegistry.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void add(Employee e) {
        employees.add(e);
    }
    
    public List<Employee> getAccountList() {
        return employees;
    }
    
    public Employee getEmployee(String name) {
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
