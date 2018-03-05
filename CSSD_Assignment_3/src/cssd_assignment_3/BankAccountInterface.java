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
    protected String cardNo;
    protected int securityNo;
    protected String name;
    
    public BankAccountInterface(int sort, String acc, int sec, String newName){
        this.sortCode = sort;
        this.cardNo = acc;
        this.securityNo = sec;
        this.name = newName;
    }
    
    public boolean takePayment(String Name, String acc, int sort, int sec, int amount){
        //Actual checking of whether the details are correct are not would no take part in this system, that's the banks job
        return true;
    }
}

class CorporateAccountInterface extends BankAccountInterface{
    private String VATno;
    private float corporateDiscountValue;
    
    public CorporateAccountInterface(int sort, String acc, int sec, String newName, float corpDisc, String VAT){
        super(sort, acc, sec, newName);
        this.corporateDiscountValue = corpDisc;
        this.VATno = VAT;
    }
    
    private void allocateVAT(float newVAT){
        corporateDiscountValue = newVAT;
    } // no idea what this is supposed to do
    
    private double discountVAT(double price){
        return (price * corporateDiscountValue);
    }
    
    @Override
    public boolean takePayment(String Name, String acc, int sort, int sec, int amount){
        //Actual checking of whether the details are correct are not would no take part in this system, that's the banks job
        double newAmount = discountVAT(amount);
        return true;
    }
}
