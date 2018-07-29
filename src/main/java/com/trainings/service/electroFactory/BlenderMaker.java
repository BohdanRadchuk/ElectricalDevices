package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.kitchen.Blender;

public class BlenderMaker implements ElectricalDeviceMaker {
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new Blender(device);
    }
}
