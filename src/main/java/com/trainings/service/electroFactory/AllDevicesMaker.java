package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;

/**
 * Component of Factory design pattern.
 *
 * Performs functions of receiving required entity
 * depending {@link com.trainings.entity.Devices} type
 * @author Bohdan Radchuk
 */
public class AllDevicesMaker {
    public static ElectricalDeviceMaker getMakerByEnum (Devices deviceToMake){
        if (deviceToMake.equals(Devices.STOVE)){
            return new CookStoveMaker();
        }
        if (deviceToMake.equals(Devices.COFFEE_MACHINE)){
            return new CoffeeMachineMaker();
        }
        if (deviceToMake.equals(Devices.BLENDER)){
            return new BlenderMaker();
        }
        if (deviceToMake.equals(Devices.WASHING_MACHINE)){
            return new WashingMachineMaker();
        }
        if (deviceToMake.equals(Devices.VACUUM)){
            return new VacuumCleanerMaker();
        }
        if (deviceToMake.equals(Devices.TV)){
            return new TVSetMaker();
        }
        if (deviceToMake.equals(Devices.COMPUTER)){
            return new ComputerMaker();
        }
        else throw new RuntimeException("There is no such device prototype" + deviceToMake);
    }
}
