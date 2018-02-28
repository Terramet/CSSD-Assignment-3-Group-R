
package cssd_assignment_3;

import java.util.ArrayList;

class JourneyHistory {
	
    public Journey FindOpenJourney() {
        for(int ix = 0; ix != journeys.size(); ++ix) {
            if (journeys.get(ix).isOpen())
                return journeys.get(ix);
        }
        return null;
    }
    private ArrayList<Journey> journeys; 
}