
package cssd_assignment_3;

import java.util.ArrayList;

class ConsumerRegistry {

    public ConsumerAccount GetAccount(String accountID) {

        for (int ix = 0; ix != accounts.size(); ++ix) {
            if (accounts.get(ix).hasAccountID(accountID))
                return accounts.get(ix);
        }
        return null;
    }
    
    public void Add(ConsumerAccount account) {
        accounts.add(account);
    }
		
    private ArrayList<ConsumerAccount> accounts;
}