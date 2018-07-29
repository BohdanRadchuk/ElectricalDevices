package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.enterteiment.Computer;

public class ComputerMaker implements ElectricalDeviceMaker {
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new Computer(device);
    }
}
