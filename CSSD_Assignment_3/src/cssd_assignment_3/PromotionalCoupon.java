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
    private String couponID;
    private Date expiryDate;
    private boolean used;
    private boolean expired;
    private float value;
    private List<Route> validRoutes;
    
    PromotionalCoupon(String ID, Date expiry, float newValue, List<Route> routes){
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
        
    private boolean validateCoupon(Date useDate){
        Date todayDate = new Date();
        if (useDate.after(expiryDate)){
            return false;
        } else 
        if (todayDate.after(expiryDate)){
        markCouponExpired();
        return false;
        } else
        if (used == true){
            return false;
        }
        return true;
    }
    
    public double useCoupon(Date useDate, Route route){ // added date argument - the date the coupon is to be "used" on may not be today
        if (validateCoupon(useDate)){
            if(validRoutes.contains(route)){
                markCouponUsed();
                return value;
            }
            return -2;
        }
    return -1;
    }
}
