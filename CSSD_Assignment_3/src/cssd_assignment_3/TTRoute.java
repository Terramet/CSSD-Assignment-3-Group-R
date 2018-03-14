package cssd_assignment_3;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Mark
 */
public class TTRoute {
    public int timeDue;
    List<String> stops;
    String terminus;
    
    public TTRoute(int timeDue, List<String> stops, String terminus)
    {
        this.timeDue = timeDue;
        this.stops = stops;
        this.terminus = terminus;
    }
    
    public List getStops()
    {
        return stops;
    }
    
    public String getTerminus()
    {
        return terminus;
    }
}
