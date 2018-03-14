/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark
 */
public class TTRouteList {
    private List<TTRoute> routes;
    
    public TTRouteList()
    {
        routes = new ArrayList();
    }
    
    public void add(TTRoute toAdd)
    {
        routes.add(toAdd);
    }
    
    public List<Integer> getTimes()
    {
        List<Integer> times = new ArrayList();
        for(TTRoute route : routes)
        {
            times.add(route.timeDue);
        }
        return times;
    }
    
    public List<String> getRoutesByTime(String time)
    {
        int temp = Integer.parseInt(time);
        TTRoute tempRoute = null;
        for(int i = 0; i < routes.size(); i++)
        {
            if(temp == routes.get(i).timeDue)
                tempRoute = routes.get(i);
        }
        return tempRoute.getStops();
    }
    
    public String getTerminusByTime(String time)
    {
        int temp = Integer.parseInt(time);
        String terminus = null;
        for(int i = 0; i < routes.size(); i++)
        {
            if(temp == routes.get(i).timeDue)
                return routes.get(i).getTerminus();
        }
        return "";
    }
}
