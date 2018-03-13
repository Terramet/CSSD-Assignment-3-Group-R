/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ascendant
 */
public class TimeBandList implements Serializable {
    /*
    Renamed this class for consistancies sake, let me know if you want to change it back to TimeBands.
    
    Change from being a singleton to being jsut a list
    */
    private List<TimeBand> timeBands = null;
    
    public TimeBandList(List<TimeBand> list){
        timeBands = list;
    }
    
    public void add(TimeBand t) { // TIME BANDS MUST BE ADDED IN CHRONOLOGICAL ORDER
        timeBands.add(t);
    }
    
    public List<TimeBand> getTimeBandList() {
        return timeBands;
    }
    
    public TimeBand getTimeBand(int ID) {
        Iterator<TimeBand> itr = timeBands.iterator();
        while(itr.hasNext()) {
            TimeBand t = itr.next();
            if(t.getID() == ID){
                return t;
            }
        }
        return null;
    }
}
