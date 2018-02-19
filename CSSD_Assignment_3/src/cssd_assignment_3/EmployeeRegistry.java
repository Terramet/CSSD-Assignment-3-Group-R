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
public class EmployeeRegistry {
    /*
    I made this class into a singleton because it didn't make sense to ever have more than one registry in a system.
    It also made managing the class easier so why not
    */
    
    private static EmployeeRegistry Registry = null;
    private List<Employee> employees = null;
    
    protected EmployeeRegistry(List<Employee> list){
        employees = list;
    }
    
    public static EmployeeRegistry getRegistry() {
        if (Registry == null) {
            List<Employee> list =  new ArrayList<>();
            list.add(new Employee("Admin", "Admin", 7));
            Registry = new EmployeeRegistry(list);
            
        }
        return Registry;
    }
    
    public void add(Employee e) {
        employees.add(e);
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
