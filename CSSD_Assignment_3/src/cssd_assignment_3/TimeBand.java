/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.time.*;

public class TimeBand implements Serializable {
    private final int timeBandID;
    private final LocalTime timeStart;
    private final LocalTime timeEnd;
    private final boolean peak;
    
    public TimeBand(int ID, LocalTime start, LocalTime end, boolean peak) {
        this.timeBandID = ID;
        this.timeStart = start;
        this.timeEnd = end;
        this.peak = peak;
    }
    
    public int getID() {
        return this.timeBandID;
    }
    
    public LocalTime getStart(){
        return timeStart;
    }
    
    public LocalTime getEnd(){
        return timeEnd;
    }
    
    public int GetStartTimeInSeconds() {
        int StartHour = getStart().getHour();
        int StartMin = getStart().getMinute();
        int StartSeconds =  getStart().getSecond();
        
        return StartHour * 60 * 60 + StartMin * 60 + StartSeconds;
    }
    
    public int GetEndTimeInSeconds() {
        int EndHour = getEnd().getHour();
        int EndMin = getEnd().getMinute();
        int EndSeconds =  getEnd().getSecond();
        
        return EndHour * 60 * 60 + EndMin * 60 + EndSeconds;
      
    }
}
