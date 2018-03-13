/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import cssd_assignment_3.Route;
import cssd_assignment_3.Vehicle;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Ascendant
 */
public class FareEvasion extends Report {
    private final int howManyCaught;
    private final float fine = 10.00f;
    
    public FareEvasion( int hMC, String name, int type, Date sD, Date eD, LocalTime sT, LocalTime eT, Route route, Vehicle v) {
        super(name, type, sD, eD, sT, eT, route, v);
        this.howManyCaught = hMC;
    }
    
    public float revenueRecovered(){
        return fine * this.howManyCaught;
    }
    
    public int getHMC(){
        return howManyCaught;
    }
    //shouldn't this always work out to 0 because if they didnt catch them they dont know they lost anything
    //And if they did catch them then they were probably made to pay and fined?
    public float revenueLost(){ 
        return 0.00f;
    }
    
    @Override
    public String toString(){
        return "ID: " + super.getName() 
                + "\nType: Fare Evasion" 
                + "\nStart Date: " + super.getStartDate() 
                + "\nEnd Date: " + super.getEndDate() 
                + "\nRoute: " + super.getRoute().toString() 
                + "\nVehicle: " + super.getVehicle().toString()
                + "\nNumber Caught: " + howManyCaught;
    }
}
