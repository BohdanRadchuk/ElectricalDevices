package com.trainings.entity.cleaning;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

/**
 * Basic entity for washing machine
 *
 * @author Bohdan Radchuk
 */
public class WashingMachine extends ElectricalDevice {
    public WashingMachine(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "wshhh";
    }
}
