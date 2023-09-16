package com.driver;

public class Boat implements  WaterVehicle{
    public Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    public String getName(){
        return name;
    }

    public int getCapacity(){
        return capacity;
    }
}
