package com.trainings.entity;

import com.trainings.service.electroFactory.AllDevicesMaker;

import java.util.ArrayList;

public class DevicesInHouse {
    private static volatile DevicesInHouse instance = null;
    private ArrayList<ElectricalDevice> allDevicesInHouse = new ArrayList<>();

    private DevicesInHouse() {
    }

    public static DevicesInHouse getInstance() {
        if (instance == null) {
            synchronized (DevicesInHouse.class) {
                if (instance == null) {
                    instance = new DevicesInHouse();
                }
            }
        }
        return instance;
    }

    public void addDevice(ElectricalDevice electricalDevice) {
        if (electricalDevice != null) {
            allDevicesInHouse.add(electricalDevice);
        }
    }

    public ArrayList<ElectricalDevice> getAllDevicesInHouse() {
        return allDevicesInHouse;
    }


    private void createDevice(Devices device) {
        if (device != null) {
            addDevice(AllDevicesMaker.getMakerByEnum(device).createElectricalDevice(device));
        }
    }

    public ArrayList<ElectricalDevice> buyAllDevices() {
        for (Devices d : Devices.values()) {
            createDevice(d);
        }
        return allDevicesInHouse;
    }

    public ArrayList<ElectricalDevice> matchedDevicesInRange(String start, String end) {
        /*DevicesInHouse devicesInHouse = DevicesInHouse.getInstance();
        ArrayList<ElectricalDevice> devices = devicesInHouse.getAllDevicesInHouse();
        */
        ArrayList<ElectricalDevice> matchedDevices = new ArrayList<>();
        for (ElectricalDevice device : this.allDevicesInHouse) {

            if (device.getEnergyConsuming() >= Integer.parseInt(start) &&
                    device.getEnergyConsuming() <= Integer.parseInt(end)) {
                matchedDevices.add(device);
            }
        }
        return matchedDevices;
    }
}
