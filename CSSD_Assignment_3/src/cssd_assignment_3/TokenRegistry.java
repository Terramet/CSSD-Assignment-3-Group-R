
package cssd_assignment_3;

import java.util.ArrayList;

class TokenRegistry {
    
    public void AddToken(Token token) {
        m_tokens.add(token);
    }
    
    private ArrayList<Token> m_tokens;
}