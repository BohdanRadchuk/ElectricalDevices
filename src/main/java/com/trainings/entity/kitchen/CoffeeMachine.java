package com.trainings.entity.kitchen;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;


/**
 * Basic entity for coffee machine
 *
 * @author Bohdan Radchuk
 */
public class CoffeeMachine extends ElectricalDevice {

    public CoffeeMachine(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "BulBulbull";
    }
}
