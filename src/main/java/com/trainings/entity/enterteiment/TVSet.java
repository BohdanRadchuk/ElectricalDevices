package com.trainings.entity.enterteiment;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;


/**
 * Basic entity for TV set
 *
 * @author Bohdan Radchuk
 */
public class TVSet extends ElectricalDevice {
    public TVSet(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "Blah-Blah-Blah";
    }
}
