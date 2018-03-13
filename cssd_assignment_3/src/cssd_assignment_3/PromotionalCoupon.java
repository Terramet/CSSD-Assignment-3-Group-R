/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.List;
import java.util.Date;

/**
 *
 * @author Sam
 */
public class PromotionalCoupon {
    String couponID;
    Date expiryDate;
    boolean used;
    boolean expired;
    double value;
    List<Route> validRoutes;
    
    PromotionalCoupon(String ID, Date expiry, double newValue, List<Route> routes){
    this.used = false;
    this.expired = false;
    
    this.couponID = ID;
    this.expiryDate = expiry;
    this.value = newValue;
    this.validRoutes = routes;
    }
    
    private void markCouponExpired(){
    expired = true;
    }
    
    private void markCouponUsed(){
    used = true;
    }
    
    public String getID(){
        return couponID;
    }
        
    private boolean validateCoupon(Date useDate){
        Date todayDate = new Date();
        if (useDate.after(expiryDate)){ // if the coupon is to be used after the expiry date
            return false;
        }
        if (todayDate.after(expiryDate)){// if it's already expired
        markCouponExpired();
        return false;
        }
        if (used == true){
            return false;
        }
        return true; // the coupon is valid
    }
    
    public double useCoupon(Date useDate, Route route){ // added date argument - the date the coupon is to be "used" on may not be today
        if (validateCoupon(useDate)){
            if(validRoutes.contains(route)){
                markCouponUsed();
                return value;
            }
            return -2; // invalid route
        }
    return -1; // coupon expired/will expire
    }
}
