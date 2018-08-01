package com.trainings.entity;

import com.trainings.service.factory.AllDevicesMaker;

import java.util.ArrayList;


/**
 * Singleton entity that contains ArrayList
 * of used devices
 *
 * @author Bohdan Radchuk
 */

public class DevicesInHouse {
    private static volatile DevicesInHouse instance = null;
    private ArrayList<ElectricalDevice> allDevicesInHouse = new ArrayList<>();

    /**
     * private constructor for singleton realization
     */
    private DevicesInHouse() {
    }


    /**
     * Singleton realization for multithreaded systems.
     * Creates new entity of this class or send link for
     * existing one
     *
     * @return new instance if it has not been created yet
     * otherwise the existing one
     */
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


    public void createDevice(Devices device) {
        if (device != null) {
            addDevice(AllDevicesMaker.getMakerByEnum(device).createElectricalDevice(device));
        }
    }

    public ArrayList<ElectricalDevice> getAllDevicesInHouse() {
        return allDevicesInHouse;
    }


    /**
     * Creates all types of devices that {@link Devices}
     * contains
     *
     * @return ArrayList of all possible devices
     */
    public ArrayList<ElectricalDevice> buyAllDevices() {
        for (Devices d : Devices.values()) {
            createDevice(d);
        }
        return allDevicesInHouse;
    }


    /**
     * Select devices from allDevicesInHouse that consumes
     * energy in range
     *
     * @param start beginning of range
     * @param end   end of range
     * @return ArrayList of all devices that satisfies conditions
     */
    public ArrayList<ElectricalDevice> matchedDevicesInRange(String start, String end) {
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
