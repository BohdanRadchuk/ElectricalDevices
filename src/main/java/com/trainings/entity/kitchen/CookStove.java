package com.trainings.entity.kitchen;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

public class CookStove extends ElectricalDevice implements CookingDevice{

    public CookStove(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "Pshhshshsh";
    }

    @Override
    public void cook() {
        System.out.println("cooking");
    }
/*
    public boolean getTurnedOn(){
        return turnedOn;
    }*/

    @Override
    public String toString() {
        return "CookStove{" +
                "manufacturer='" + manufacturer + '\'' +
                ", energyConsuming=" + energyConsuming +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
