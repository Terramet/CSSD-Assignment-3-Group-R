
package cssd_assignment_3;

import java.util.Date;
import java.time.LocalTime;

public class ConsumerAccount {
	
	public double GetRemainingCredt() {
            return credits;
	}
	
	public boolean AddCredits(double amount) {
            return false;
	}
	
	public boolean TakePayment() {
            return false;
	}
	
	public void ProcessPassengerExit(Location exit, Date date, LocalTime time, Gate gate) {
            
	}
	
	private String name;
	private String accountID;
	private double credits;
	private double loyaltyBonus;
	private JourneyHistory journeyHistory;
	private Journey openJounry;
	private PassRegistry passes;
	private double spentToday;
	private double calcSpendToday;
	private boolean checkSecurity;
	private double reduceAccountCredit;
	private boolean outOfCredits;
}
