package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.cleaning.VacuumCleaner;

public class VacuumCleanerMaker implements ElectricalDeviceMaker {
    @Override
    public ElectricalDevice createElectricalDevice(Devices device) {
        return new VacuumCleaner(device);
    }
}
