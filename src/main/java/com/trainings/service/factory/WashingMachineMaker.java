package com.trainings.service.factory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.cleaning.WashingMachine;

public class WashingMachineMaker implements ElectricalDeviceMaker {
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new WashingMachine(device);
    }
}
