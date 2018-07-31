package com.trainings.entity.kitchen;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;


/**
 * Basic entity for cook stove
 *
 * @author Bohdan Radchuk
 */
public class CookStove extends ElectricalDevice {

    public CookStove(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "Pshhshshsh";
    }
}
