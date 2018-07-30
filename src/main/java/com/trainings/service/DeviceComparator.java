package com.trainings.service;

import com.trainings.entity.ElectricalDevice;

import java.util.Comparator;

public class DeviceComparator implements Comparator<ElectricalDevice> {
    @Override
    public int compare(ElectricalDevice o1, ElectricalDevice o2) {
        return o1.getEnergyConsuming() - o2.getEnergyConsuming();
    }
}
