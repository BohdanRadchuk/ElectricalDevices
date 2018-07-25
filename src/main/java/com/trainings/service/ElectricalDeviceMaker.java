package com.trainings.service;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;

public interface ElectricalDeviceMaker {
    ElectricalDevice createElectricalDevice (Devices device);
}
