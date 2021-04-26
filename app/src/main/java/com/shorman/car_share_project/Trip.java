package com.shorman.car_share_project;

public class Trip {
    private String driverName;
    private String tripTime;
    private String carType;

    public Trip(String driverName, String tripTime, String carType) {
        this.driverName = driverName;
        this.tripTime = tripTime;
        this.carType = carType;
    }

    public Trip() {

    }

    public String getDriverName() {
        return driverName;
    }

    public String getTripTime() {
        return tripTime;
    }

    public String getCarType() {
        return carType;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

}
