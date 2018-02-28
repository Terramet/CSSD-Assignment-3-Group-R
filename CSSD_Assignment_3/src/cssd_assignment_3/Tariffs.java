package cssd_assignment_3;

import java.util.Date;

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
    
    public abstract double calculateRouteCost(Route route, Date start, Date ret);
    
    public abstract double calculateJourneyCost(Journey journey);
    
    public abstract boolean getTariffAvailablility(Journey journey);
    
    public abstract double getTariffCost(double daySpend);
    
    private int type;
    private double cost;
    private Date startDate;
    private Date endDate;
    private TimeBandList timePeriods;
    private TimeBandList peakPeriods;
    private boolean peakAllowed;
}

class DurationPass extends Tariffs {
    DurationPass(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak, int days) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        this.days = days;
        this.cost = cost;
    }
    
    @Override
    public double calculateRouteCost(Route route, Date start, Date ret) {
        return 0;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        return 0;
    }
    
    @Override
    public boolean getTariffAvailablility(Journey journey) {
        return false;
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0;
    }
    private int days;
    private double cost;
}

class OAPPass extends Tariffs {
    OAPPass(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak, boolean isUsable) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        this.isUsable = isUsable;
    }
    
    @Override
    public double calculateRouteCost(Route route, Date start, Date ret) {
        return 0;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        return 0;
    }
    
    @Override
    public boolean getTariffAvailablility(Journey journey) {
        return false;
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0;
    }
    
    private boolean isUsable;
}

class OffPeakFare extends Tariffs {
    OffPeakFare(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak, boolean peakAllowed) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        this.peakAllowed = peakAllowed;
    }   
    
    @Override
    public double calculateRouteCost(Route route, Date start, Date ret) {
        return 0;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        return 0;
    }
    
    @Override
    public boolean getTariffAvailablility(Journey journey) {
        return false;
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0;
    }
    
    private boolean peakAllowed;
}

class CreditBlock extends Tariffs {
    CreditBlock(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak, int noCredits, double discountRatio) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        this.noCredits = noCredits;
        this.discountRatio = discountRatio;
    }
    
    @Override
    public double calculateRouteCost(Route route, Date start, Date ret) {
        return 0;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        return 0;
    }
    
    @Override
    public boolean getTariffAvailablility(Journey journey) {
        return false;
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0;
    }
    
    // DOUBLE CHECK THIS SHIT.
    private int getNoFreeCredits() {
        return noCredits;
    }
    
    private int noCredits;
    private double discountRatio;
}

class DistanceFare extends Tariffs {
    DistanceFare(int type, double cost, Date start, Date expires, TimeBandList periods, TimeBandList peak, boolean hasPeak, double priceKM) {
        super(type, cost, start, expires, periods, peak, hasPeak);
        pricePerKM = priceKM;
    }
    
    @Override
    public double calculateRouteCost(Route route, Date start, Date ret) {
        return 0;
    }
    
    @Override
    public double calculateJourneyCost(Journey journey) {
        return 0;
    }
    
    @Override
    public boolean getTariffAvailablility(Journey journey) {
        return false;
    }
    
    @Override
    public double getTariffCost(double daySpend) {
        return 0;
    }
    
    private double pricePerKM;
}
