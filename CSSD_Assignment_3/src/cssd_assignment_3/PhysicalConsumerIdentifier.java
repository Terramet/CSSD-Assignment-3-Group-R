/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

/**
 *
 * @author cHackz18
 */
public class PhysicalConsumerIdentifier {
 
    public PhysicalConsumerIdentifier(String id) {
        accountID = id;
    }
    
    public boolean MatchesPhysicalID(String physicalID) {
        return this.physicalID.compareTo(physicalID) == 0;
    }
    
    public String GetAccount() {
        return accountID;
    }
    
    // the accountID this Phsysical identifier is linked with.
    // maps to a consumer account.
    String accountID;
    String physicalID;
}
