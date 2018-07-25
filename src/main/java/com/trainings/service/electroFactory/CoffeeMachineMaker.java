package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.kitchen.CoffeeMachine;
import com.trainings.service.ElectricalDeviceMaker;

public class CoffeeMachineMaker implements ElectricalDeviceMaker{
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new CoffeeMachine(device);
    }
}
