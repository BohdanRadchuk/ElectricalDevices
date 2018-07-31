package com.trainings.service;

import com.trainings.entity.ElectricalDevice;

import java.util.List;


/**
 * Service for sorting List of devices
 * and check can be String converted to int
 *
 * @author Bohdan Radchuk
 */
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

    /**
     * Sorts List of Electrical Devices by energy consuming
     *
     * @param deviceList
     * @return sorted by energy consuming List
     */
    public List<ElectricalDevice> sortElectricalDevicesByPower(List<ElectricalDevice> deviceList) {
        if (deviceList != null) {
            deviceList.sort(new DeviceComparator());
        }
        return deviceList;
    }


    /**
     * checking can be String converted to int
     *
     * @param property_value
     * @return {@code false} if income is not a number or null
     *          {@code true} if income can be converted to int
     */
    public static boolean checkForInt(String property_value) {
        try {
            Integer.parseInt(property_value);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}
