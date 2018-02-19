/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

/**
 *
 * @author Ascendant
 */
public class EmployeeUserInterface {
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
}
