package com.trainings.service;

import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.service.electroFactory.AllDevicesMaker;

import java.util.ArrayList;

public class House {
    private ArrayList<ElectricalDevice> allDevicesInHouse = new ArrayList<>();

    public void addDevice(ElectricalDevice electricalDevice) {
        electricalDevice.turnOff();
        //electricalDevice.turnedOn;
        System.out.println(electricalDevice.isTurnedOn());
        allDevicesInHouse.add(electricalDevice);

    }

    private void allTurnedOnAct() {
        for (ElectricalDevice ed : allDevicesInHouse) {
            System.out.println(ed.interact());
            System.out.println(ed.energyConsuming);
            if (ed.isTurnedOn()) {
                ed.interact();
            }
        }
    }

    private void createDevice(Devices device) {

    }

    public void buyAllDevices() {
        for (Devices d : Devices.values()) {
            addDevice(AllDevicesMaker.getMakerByEnum(d).createElectricalDevice(d));
        }
        System.out.println(allDevicesInHouse);
    }

    public ArrayList<ElectricalDevice> getAllDevicesInHouse() {
        return allDevicesInHouse;
    }

    public static void main(String[] args) {
        House house = new House();
        house.buyAllDevices();
        house.allTurnedOnAct();
    }

    @Override
    public String toString() {
        return "House{" +
                "allDevicesInHouse=" + allDevicesInHouse +
                '}';
    }
}
