package com.trainings.entity.kitchen;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

public class CookStove extends ElectricalDevice{

    public CookStove(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "Pshhshshsh";
    }

    @Override
    public String toString() {
        return "CookStove{" +
                "manufacturer='" + manufacturer + '\'' +
                ", energyConsuming=" + energyConsuming +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
