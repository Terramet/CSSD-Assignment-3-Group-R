package cssd_assignment_3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

abstract class Tariffs {
    
    Tariffs(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak) {
        this.type = type;
        this.cost = cost;
        startDate = start;
        endDate = expires;
        timePeriods = periods;
        peakPeriods = peak;
        peakAllowed = hasPeak;
    }
    
    public abstract double calculateRouteCost(PotentialJourney journey);
    
    public abstract double calculateJourneyCost(Journey journey);
    
    public abstract boolean getTariffAvailability(PotentialJourney journey);
    
    public abstract double getTariffCost(double daySpend);
    
    public abstract boolean getTariffAvailability(ConsumerAccount account, Journey journey);
    
    protected int type;
    protected double cost;
    private Date startDate;
    private Date endDate;
    private TimeBandList timePeriods;
    protected TimeBandList peakPeriods;
    private boolean peakAllowed;
}

class OffPeakFare extends Tariffs {
    OffPeakFare(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak, boolean peakAllowed) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        this.peakAllowed = peakAllowed;
        peakDiscount = 0.75;
    }   
   
    
    @Override
    public double calculateRouteCost(PotentialJourney journey) {
        double journeyCost = 0.0;
        
        if(!journey.CalculateDistance())
            return journeyCost;
        
        journeyCost = journey.GetDistance() * super.cost;
        
        if (getTariffAvailability(journey))
            journeyCost *= peakDiscount;
        
        return journeyCost;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        
        double discount = 1.0;
        if(getTariffAvailability(new PotentialJourney(null, null, null, journey.GetStartDate(), journey.GetEndDate())));
            discount = 0.75;
            
        return super.cost * journey.Distance() * discount;
    }
    
    @Override
    public boolean getTariffAvailability(PotentialJourney journey) {
        
        return isTimeOffPeak(journey.GetStartDate());
    }
 
    private boolean isTimeOffPeak(Date startDate) {
        Calendar cal = Calendar.getInstance();
        
        // get time values of startDate
        cal.setTime(startDate);
        
        int startHour = cal.get(Calendar.HOUR_OF_DAY);
        int startMinute = cal.get(Calendar.MINUTE);
        
        int startSeconds = startHour * 60 * 60 + startMinute * 60;
        
        List<TimeBand> times = super.peakPeriods.getTimeBandList();
        
        for (int ix = 0; ix != times.size(); ++ix) {
            TimeBand offpeakTime = times.get(ix);

            int opStartSeconds = offpeakTime.GetStartTimeInSeconds();
            int opEndSeconds = offpeakTime.GetEndTimeInSeconds();          
            
            if ((startSeconds >= opStartSeconds) && (startSeconds <= opEndSeconds)) {
                    return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean getTariffAvailability(ConsumerAccount account, Journey journey) {
        return getTariffAvailability(new PotentialJourney(null, null, null, journey.GetStartDate(), journey.GetEndDate()));
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0;
    }
    
    private TimeBandList offpeakTimes;
    
    private boolean peakAllowed;
    private double peakDiscount;
}

class OAPFare extends Tariffs {
        
    OAPFare(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        discount = 0.5;
        requiredAge = 65;
    }
    
    @Override
    public double calculateRouteCost(PotentialJourney journey) {
        return 0.0;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        double discount = 0.5;
            
        return super.cost * journey.Distance() * discount;
    }
    
    @Override
    public boolean getTariffAvailability(PotentialJourney journey) {
        return false;
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0.0;
    }
    
    @Override
    public boolean getTariffAvailability(ConsumerAccount account, Journey journey) {
        return calculateAge(account.DOB()) >= requiredAge;
    }
    
    private int calculateAge(LocalDate DOB) {
        LocalDate now = LocalDate.now();
        if(DOB != null) {
            return Period.between(DOB, now).getYears();
        }
        return 0;
    }
    
    double discount;
    double requiredAge;
    
}
