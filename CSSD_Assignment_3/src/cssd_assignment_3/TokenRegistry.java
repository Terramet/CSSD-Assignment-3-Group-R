
package cssd_assignment_3;

import java.util.ArrayList;

class TokenRegistry {
    
    public void AddToken(Token token) {
        m_tokens.add(token);
    }
    
    public Token GetToken(int tokenID) {
        for (int ix = 0; ix != m_tokens.size(); ++ix) {
            if (tokenID == m_tokens.get(ix).GetTokenID()) {
                return m_tokens.get(ix);
            }
        }
        return null;
    }
    
    private ArrayList<Token> m_tokens;
}