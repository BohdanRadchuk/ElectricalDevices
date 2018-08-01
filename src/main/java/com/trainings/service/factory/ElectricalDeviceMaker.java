package com.trainings.service.factory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

public interface ElectricalDeviceMaker {
    ElectricalDevice createElectricalDevice(Devices device);
}
