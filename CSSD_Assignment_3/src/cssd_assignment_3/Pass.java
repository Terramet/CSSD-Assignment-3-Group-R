
package cssd_assignment_3;

import java.util.Date;

class Pass {
	
    public Pass(int passType, boolean valid, Date expiresAt) {
        validPass = valid;
        dateExpires = expiresAt;
    }

    public boolean isCovered() {        
        return validPass && (new Date().before(dateExpires));
    }

    private boolean validPass;
    private Date dateExpires;
}