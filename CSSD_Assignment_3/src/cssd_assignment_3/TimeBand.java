/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.io.Serializable;
import java.time.*;

/**
 *
 * @author Ascendant
 */
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
}
