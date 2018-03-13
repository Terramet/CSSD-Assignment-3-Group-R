
package cssd_assignment_3;

import java.util.ArrayList;

class ConsumerRegistry extends ArrayList<ConsumerAccount> {
	
	public ArrayList<ConsumerAccount> GetAccount(String accountID) {
		return accounts;
	}
		
	private ArrayList<ConsumerAccount> accounts;
}