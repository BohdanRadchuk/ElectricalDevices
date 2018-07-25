package com.trainings.entity;

public abstract class ElectricalDevice {
    protected String manufacturer;
    public int energyConsuming;
    protected boolean turnedOn;


    public ElectricalDevice(Devices devices) {
        this.manufacturer = devices.manufacturer();
        this.energyConsuming = devices.energyConsuming();
        this.turnedOn = false;
    }

    public int consumedEnergy() {
        if (turnedOn) {
            return energyConsuming;
        } else {
            return 0;
        }
    }

    public void turnOn() {
        this.turnedOn = true;
    }

    public void turnOff() {
        this.turnedOn = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getEnergyConsuming() {
        return energyConsuming;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public abstract String interact();
}
