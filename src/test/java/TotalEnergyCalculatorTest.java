import com.trainings.entity.Devices;
import com.trainings.entity.ElectricalDevice;
import com.trainings.entity.cleaning.VacuumCleaner;
import com.trainings.entity.enterteiment.Computer;
import com.trainings.entity.kitchen.CookStove;
import com.trainings.service.EnergyCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TotalEnergyCalculatorTest {

    @Test
    public void calculatorTest() {

        List<ElectricalDevice> eldev = new ArrayList<>();
        eldev.add(new VacuumCleaner(Devices.VACUUM));
        eldev.add(new CookStove(Devices.STOVE));
        eldev.add(new VacuumCleaner(Devices.VACUUM));

        for (ElectricalDevice e : eldev) {
            e.turnOn();
        }

        eldev.add(new Computer(Devices.COMPUTER));

        int sumActual = Devices.VACUUM.energyConsuming() + Devices.STOVE.energyConsuming()
                + Devices.VACUUM.energyConsuming();
        Assert.assertEquals(EnergyCalculator.totalEnergyConsuming(eldev), sumActual);
    }
}
