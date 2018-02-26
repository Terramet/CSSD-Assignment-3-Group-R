/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

interface ConsumerAccount{};
/**
 *
 * @author Sam
 */
public class Purchase {
    ConsumerAccount account;
    boolean paymentResult;
    
    public boolean makePurchase(String accountID, int amount){
        return false;
    }
    
    public boolean makePurchase(int amount){
        return false;
    }
    public boolean makePurchase(String name, int accNo, int sortCode, int amount){
        return false;
    }
}
