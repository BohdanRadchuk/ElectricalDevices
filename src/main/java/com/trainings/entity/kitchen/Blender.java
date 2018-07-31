package com.trainings.entity.kitchen;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;


/**
 * Basic entity for blender
 *
 * @author Bohdan Radchuk
 */
public class Blender extends ElectricalDevice {
    public Blender(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "wgggggg";
    }
}
