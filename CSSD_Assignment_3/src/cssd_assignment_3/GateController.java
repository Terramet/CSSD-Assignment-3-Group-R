
package cssd_assignment_3;

class GateController {
	
        GateController(TokenReader reader, ConsumerRegistry accounts, TokenRegistry registry, TimeBandList validTimeBands, Gate gate) {
            this.tokenReader = reader;
            this.accounts = accounts;
            this.validTimeBands = validTimeBands;
            this.gate = gate;
            message = "Please Present A \nValid Ticket Or Card";
            tokenRegistry = registry;
        }
    
	public void sendUnlockGate(Gate gate) {
            gate.open();
	}
	
	public void passTokenID(int TokenID) {
            token = tokenRegistry.GetToken(TokenID);
            
            if (token == null) {
                message = "Please present a valid token";
                return;
            }
            
            ConsumerAccount account = accounts.GetAccount(token.GetAccountID());
            if (!account.hasOpenJourney()) {
                message = "No Open Journey Found, Please Seek a Conductor";
                gate.close();
                return;
            }
             
            if (!account.ProcessPassengerExit(gate.getLocation())) {
                message = "Alternative Tender Required";
                gate.close();
                return;
            }
	}
	
	public void sendValidStatus(boolean paid) {
            
	}
	
        
        // references to neccesary collections.
        private TokenRegistry tokenRegistry;
        
        private String message;
	private TokenReader tokenReader;
	private ConsumerRegistry accounts;
	private Token token;
	private String accountID;
	private TimeBandList validTimeBands;
	private Gate gate;
}