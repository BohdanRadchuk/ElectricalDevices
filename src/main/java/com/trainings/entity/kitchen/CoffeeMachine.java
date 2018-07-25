package com.trainings.entity.kitchen;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

public class CoffeeMachine extends ElectricalDevice implements CookingDevice {

    public CoffeeMachine(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "BulBulbull";
    }

    @Override
    public void cook() {
        System.out.println("making coffee");
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", energyConsuming=" + energyConsuming +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
