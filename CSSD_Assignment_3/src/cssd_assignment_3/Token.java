/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.Date;

public class Token {

    
    Token(int type, int id, int accID, TimeBandList validBands, Date expires) {
        tokenType = type;
        tokenID = id;
        accountID = accID;
        validTimeBands = validBands;
        expiryDate = expires;
    }
    
    // Getters in here are an expanded extractTokenDetails implementation.
    public int GetTokenType() {
        return tokenType;
    }
    
    public int GetTokenID() {
        return tokenID;
    }
    
    public int GetAccountID() {
        return accountID;
    }
    
    public TimeBandList GetValidTime() {
        return validTimeBands;
    }
    
    public Date GetExpiryDate() {
        return expiryDate;
    }
    // End of expanded getters implementation.
    
    private int tokenType;
    private int tokenID;
    private int accountID;
    private TimeBandList validTimeBands;
    private Date expiryDate;
}
