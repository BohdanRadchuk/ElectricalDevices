package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.kitchen.CookStove;
import com.trainings.service.ElectricalDeviceMaker;

public class CookStoveMaker implements ElectricalDeviceMaker{
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new CookStove(device);
    }
}
