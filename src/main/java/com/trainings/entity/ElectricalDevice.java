package com.trainings.entity;

/**
 * Basic entity for all devices
 *
 * @author Bohdan Radchuk
 */
public abstract class ElectricalDevice {

    private String type;
    private String imgUrl;
    private String manufacturer;
    private int energyConsuming;
    private boolean turnedOn;


    public ElectricalDevice(Devices devices) {
        this.type = devices.type();
        this.imgUrl = devices.imgUrl();
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

    public int getEnergyConsuming() {
        return energyConsuming;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public abstract String interact();

    /*
    Do not delete getters they are used in frontend
     */
    public String getType() {
        return type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "type='" + type + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", energyConsuming=" + energyConsuming +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
