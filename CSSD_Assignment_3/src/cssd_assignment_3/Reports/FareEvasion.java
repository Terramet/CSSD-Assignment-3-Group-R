/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

/**
 *
 * @author Ascendant
 */
public class FareEvasion extends Report {
    private int howManyCaught;
    
    public FareEvasion(int hMC) {
        super();
        this.howManyCaught = hMC;
    }
    
    public double revenueRecovered(){
        return -1;
    }
    
    //shouldn't this always work out to 0 because if they didnt catch them they dont know they lost anything
    //And if they did catch them then they were probably made to pay and fined?
    public double revenueLost(){ 
        return -1;
    }
}
