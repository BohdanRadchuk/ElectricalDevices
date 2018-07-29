package com.trainings.entity.bathroom;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

public class WashingMachine extends ElectricalDevice {
    public WashingMachine(Devices devices) {
        super(devices);
    }

    @Override
    public String interact() {
        return "wshhh";
    }
}
