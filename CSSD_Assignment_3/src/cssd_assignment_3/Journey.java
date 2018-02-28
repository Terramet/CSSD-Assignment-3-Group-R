
package cssd_assignment_3;

import java.util.Date;
import java.time.LocalTime;

class Journey {
	
	Journey(Location loc, Date startDate, LocalTime startTime) {
		this.startDate = startDate;
		this.startTime = startTime;
                this.open = true;
	}
	
	public void CloseJourney(Location loc, Date date) {
		endLocation = loc;
		endDate = date;
		distanceTravelledKM = startLocation.DistanceTo(endLocation);
                open = false;
	}
	
        public boolean isOpen() {
            return open;
        }
        
        private boolean open;
        private LocalTime startTime;
	private Date startDate;
        private LocalTime endTime;
	private Date endDate;
	private double distanceTravelledKM;
	private Location startLocation;
	private Location endLocation;
}