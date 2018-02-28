
package cssd_assignment_3;

import java.time.LocalTime;
import java.util.Date;

class Pass {
	
	public Pass(int passType, boolean valid, Date expiresAt) {
		validPass = valid;
		dateExpires = expiresAt;
	}
	
	public Pass(ConsumerAccount account, Date dateExp, int pType) {
		this.account = account;
		dateExpires = dateExp;
		passType = pType;
	}
	
	public boolean IsCoveredJourney(Journey journey) {
		return true;
	}
	
	private boolean validPass;
        private LocalTime timeExpires;
	private Date dateExpires;
	private int passType;
	private ConsumerAccount account; // ?? ??
}