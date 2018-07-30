package com.trainings.service;

import com.trainings.entity.ElectricalDevice;

import java.util.List;

public class EnergyCalculator {

    public static int totalEnergyConsuming(List<ElectricalDevice> deviceList) {
        int totalEnergy = 0;
        for (ElectricalDevice device : deviceList) {
            totalEnergy += getDeviceEnergyIfTurnedOn(device);
        }
        return totalEnergy;
    }

    private static int getDeviceEnergyIfTurnedOn(ElectricalDevice device) {
        if (device != null && device.isTurnedOn()) {
            return device.getEnergyConsuming();
        } else {
            return 0;
        }
    }
}
