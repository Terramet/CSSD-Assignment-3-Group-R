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
public class BankAccountInterface {
    protected int sortCode;
    protected int accountNo;
    protected int securityNo;
    protected String name;
    
    public BankAccountInterface(int sort, int acc, int sec, String newName){
        this.sortCode = sort;
        this.accountNo = acc;
        this.securityNo = sec;
        this.name = newName;
    }
    
    public boolean takePayment(String Name, int acc, int sort, int sec, int ammount){
        return true;
    }
}

class CorporateAccountInterface extends BankAccountInterface{
    private String VATno;
    private float corporateDiscountValue;
    
    public CorporateAccountInterface(int sort, int acc, int sec, String newName, float corpDisc, String VAT){
        super(sort, acc, sec, newName);
        this.corporateDiscountValue = corpDisc;
        this.VATno = VAT;
    }
    
    private void allocateVAT(){} // no idea what this is supposed to do
    
    private double discountVAT(double price){
        return (price * corporateDiscountValue);
    }
}