package com.trainings.entity;

public enum Devices {
    STOVE ("Electrolux", 20),
    COFFE_MACHINE ("Delonghi", 7)
    ;
    private final String manufacturer;
    private final int energyConsuming;

    Devices(String manufacturer, int energyConsuming) {
        this.manufacturer = manufacturer;
        this.energyConsuming = energyConsuming;
    }

    public String manufacturer(){
        return manufacturer;
    }
    public int energyConsuming(){
        return energyConsuming;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "manufacturer='" + manufacturer + '\'' +
                ", energyConsuming=" + energyConsuming +
                '}';
    }
}
