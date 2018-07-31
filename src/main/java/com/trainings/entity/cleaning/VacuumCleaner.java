package com.trainings.entity.cleaning;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;


/**
 * Basic entity for vacuum cleaner
 *
 * @author Bohdan Radchuk
 */
public class VacuumCleaner extends ElectricalDevice {
    public VacuumCleaner(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "WOOOOO";
    }
}
