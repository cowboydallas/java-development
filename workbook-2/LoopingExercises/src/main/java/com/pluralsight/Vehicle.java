package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private long odometerReading;
    private int price;

    public Vehicle(long vehicleId, String makeModel, String color, long odometerReading, int price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
}
