/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ascendant
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new Employee("John", "Hello", 7);
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of passwordMatch method, of class Employee.
     */
    @Test
    public void testPasswordMatch() {
        System.out.println("passwordMatch - Matching");
        String password = "Hello";
        Employee instance = new Employee("John", "Hello", 7);
        boolean expResult = true;
        boolean result = instance.passwordMatch(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPasswordMatchCaseSensetive() {
        System.out.println("passwordMatch - Case sensitivity");
        String password = "hello";
        Employee instance = new Employee("John", "Hello", 7);
        boolean expResult = false;
        boolean result = instance.passwordMatch(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPasswordMatchDoesntMatch() {
        System.out.println("passwordMatch - Doesnt match");
        String password = "Good morning";
        Employee instance = new Employee("John", "Hello", 7);
        boolean expResult = false;
        boolean result = instance.passwordMatch(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmployeeAdmin method, of class Employee.
     */
    @Test
    public void testIsEmployeeAdminFalse() {
        System.out.println("isEmployeeAdmin - Below minimum for Admin rights");
        Employee instance = new Employee("John", "Hello", 0);
        boolean expResult = false;
        boolean result = instance.isEmployeeAdmin();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEmployeeAdminTrue() {
        System.out.println("isEmployeeAdmin - At minimum for Admin rights");
        Employee instance = new Employee("John", "Hello", 7);
        boolean expResult = true;
        boolean result = instance.isEmployeeAdmin();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEmployeeAdminAboveTrue() {
        System.out.println("isEmployeeAdmin - Above minimum for Admin rights");
        Employee instance = new Employee("John", "Hello", 99);
        boolean expResult = true;
        boolean result = instance.isEmployeeAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString - Same output as getName");
        Employee instance = new Employee("John", "Hello", 7);
        String expResult = instance.getName();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
