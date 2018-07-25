package com.trainings.service.electroFactory;

import com.trainings.entity.Devices;
import com.trainings.service.ElectricalDeviceMaker;

public class AllDevicesMaker {
    public static ElectricalDeviceMaker getMakerByEnum (Devices deviceToMake){
        if (deviceToMake.equals(Devices.STOVE)){
            return new CookStoveMaker();
        }
        if (deviceToMake.equals(Devices.COFFE_MACHINE)){
            return new CoffeeMachineMaker();
        }
        else throw new RuntimeException("There is no such device prototype" + deviceToMake);
    }
}
