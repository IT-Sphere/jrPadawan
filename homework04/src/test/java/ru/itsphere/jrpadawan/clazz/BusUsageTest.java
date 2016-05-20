package ru.itsphere.jrpadawan.clazz;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class BusUsageTest {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in method changeBusSpeedAndPassengers of class BusUsage (task 5)");

    @Test
    public void changeBusSpeedAndPassengersTest() {
        BusUsage busUsage = new BusUsage();
        Bus bus = busUsage.changeBusSpeedAndPassengers(new Bus());
        AssertWrapper.assertNotNull(status, bus);
        AssertWrapper.assertEquals(status, bus.getSpeed(220), 220);
        AssertWrapper.assertEquals(status, bus.passengers, 25);
    }
}
