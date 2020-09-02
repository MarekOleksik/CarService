package Classes;

import java.util.Date;

public class Refuel {
    Date date;
    String fuelType;
    boolean isFull;
    short liters;
    float pricePerLiter;
    int counter;
    String station;
    double totalCost;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public short getLiters() {
        return liters;
    }

    public void setLiters(short liters) {
        this.liters = liters;
    }

    public float getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(float pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}


