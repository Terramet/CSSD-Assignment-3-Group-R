
package cssd_assignment_3;

import java.util.Date;
import java.time.LocalTime;

class Journey {
	
    Journey(Location loc, Date startDate, LocalTime startTime) {
        this.startDate = startDate;
        this.open = true;
    }

    public void Close(Location loc) {
        endLocation = loc;
        endDate = new Date();
        distanceTravelledKM = startLocation.DistanceTo(endLocation);
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
    
    public Date GetStartDate() {
        return startDate;
    }
    
    public Date GetEndDate() {
        return endDate;
    }

    public double Distance() {
        return distanceTravelledKM;
    }
    
    private boolean open;
    final private Date startDate;
    private Date endDate;
    private double distanceTravelledKM;
    private Location startLocation;
    private Location endLocation;
}