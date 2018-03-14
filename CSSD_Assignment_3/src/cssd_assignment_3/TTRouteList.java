/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mark
 */
public class TTRouteList implements Serializable{
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
    
    public List<String> getTermini()
    {
        List<String> times = new ArrayList();
        for(TTRoute route : routes)
        {
            times.add(route.terminus);
        }
        return times;
    }
    
    public List<String> getStopsByTime(String time)
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
    
    public void removeRouteByTime(String time)
    {
        int temp = Integer.parseInt(time);
        for(int i = 0; i < routes.size(); i++)
        {
            if(temp == routes.get(i).timeDue)
                routes.remove(routes.get(i));
        }
    }
    
    public void sort()
    {
        Collections.sort(routes, (TTRoute r1, TTRoute r2) -> r1.timeDue-r2.timeDue);
    }
}
