
package cssd_assignment_3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import org.jdesktop.swingx.calendar.DateUtils;

public class ConsumerAccount {
    
    ConsumerAccount(String name, String accountID, LocalDate DOB) {
        this.name = name;
        this.accountID = accountID;
        credits = 0;
        loyaltyBonus = 0;
        journeyHistory = new JourneyHistory();
        openJourney = null;
        passes = new PassRegistry();
        spentToday = 0;
        checkSecurity = false;
        this.DOB = DOB;
    }
    
    public double GetRemainingCredt() {
        return credits;
    }

    public boolean AddCredits(double amount) {
        return false;
    }

    public boolean TakePayment() {
        return false;
    }

    public boolean ProcessPassengerExit(Location exit) {
        
        if (openJourney == null)
            return false;

        if (!openJourney.isOpen())
            return false;

        openJourney.Close(exit);
        
        // if the journey is covered by a valid pass,
        // no problem close it and indicate success.
        if (passes.isCovered()) {
            return true;
        }

        Tariffs tariff = fares.findCheapestTarriff(this, openJourney);
       
        double costOfJourney = tariff.calculateJourneyCost(openJourney);
        double potentialSpend = costOfJourney + spentToday;
        
        if (potentialSpend > 20.0) {
            costOfJourney = -(20.0 - potentialSpend);
            
            Date endOfDay = new Date(openJourney.GetEndDate().getTime());
            endOfDay.setHours(23);
            endOfDay.setMinutes(59);
            endOfDay.setSeconds(59);
            
            passes.add(new Pass(0, true, openJourney.GetEndDate()));
        }
        
        reduceAccountCredit(costOfJourney);
       
        return true;
    }

    public boolean hasAccountID(String key) {
        return accountID.compareTo(key) == 0;
    }

    public boolean hasOpenJourney() {
        return openJourney.isOpen();
    }

    // returns the date of birth for this customer.
    public LocalDate DOB() {
        return DOB;
    }
    
    private void reduceAccountCredit(double cost) {
        credits -= cost;
    }
    
    // reference to the fares structure so we can calculate the cost of a journey.
    private FaresStructures fares;
    
    private String name;
    private String accountID;
    private double credits;
    private double loyaltyBonus;
    private JourneyHistory journeyHistory;
    private Journey openJourney;
    private PassRegistry passes;
    private double spentToday;
    private boolean checkSecurity;
    private LocalDate DOB;
}
