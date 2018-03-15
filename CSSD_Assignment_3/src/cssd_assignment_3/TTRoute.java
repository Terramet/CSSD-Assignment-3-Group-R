/*
*  Class for a timetabled route
*  Features some getters and a collection for the parameters of a route.
*/
package cssd_assignment_3;

import java.io.Serializable;
import java.util.List;

/*
 * @author Mark
 */
public class TTRoute implements Serializable{
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
