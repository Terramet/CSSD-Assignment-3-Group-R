/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;
/**
 *
 * @author Sam
 */

public class Purchase {
    ConsumerAccount account;
    ConsumerRegistry accountReg;
    boolean paymentResult = false;
    BankAccountInterface bankInt = new BankAccountInterface(123456, "1111333355557777", 999, "B F Rawson");
    
    public boolean makePurchase(String accountID, int amount){
        paymentResult = true;
        //make a dialog for reciept
        return paymentResult;
    }
    
    public boolean makePurchase(int amount){
        paymentResult = true;
        //make a dialog for reciept
        return paymentResult;
    }
    public boolean makePurchase(String name, String accNo, int sortCode, int amount){
        paymentResult = bankInt.takePayment(name, accNo, amount, sortCode, amount);
        //make a dialog for reciept
        return paymentResult;
    }
}
