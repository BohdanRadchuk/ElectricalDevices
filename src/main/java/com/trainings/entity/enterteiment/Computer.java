package com.trainings.entity.enterteiment;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;


/**
 * Basic entity for computer
 *
 * @author Bohdan Radchuk
 */
public class Computer extends ElectricalDevice {
    public Computer(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "Doo-dooro-todo";
    }
}
