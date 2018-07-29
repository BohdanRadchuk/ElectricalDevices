package com.trainings.service;

import com.trainings.entity.ElectricalDevice;

import java.util.List;

public class DevicesSorter {

    private void allTurnedOnAct(List<ElectricalDevice> deviceList) {
        if (deviceList != null) {
            for (ElectricalDevice ed : deviceList) {
                if (ed.isTurnedOn()) {
                    ed.interact();
                }
            }
        }
    }

    public List<ElectricalDevice> sortElectricalDevicesByPower(List<ElectricalDevice> deviceList) {
        if (deviceList != null) {
            deviceList.sort(new DeviceComparator());
        }
        return deviceList;
    }


}
