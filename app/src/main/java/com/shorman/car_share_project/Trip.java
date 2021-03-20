package com.shorman.car_share_project;

public class Trip {
    private String driverName;
    private String tripTime;
    private String carType;
    private String carColor;

    public Trip(String driverName, String tripTime, String carType, String carColor) {
        this.driverName = driverName;
        this.tripTime = tripTime;
        this.carType = carType;
        this.carColor = carColor;
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

    public String getCarColor() {
        return carColor;
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

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
