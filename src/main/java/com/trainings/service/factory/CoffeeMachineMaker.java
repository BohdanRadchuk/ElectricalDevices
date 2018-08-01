package com.trainings.service.factory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.kitchen.CoffeeMachine;

public class CoffeeMachineMaker implements ElectricalDeviceMaker {
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new CoffeeMachine(device);
    }
}
