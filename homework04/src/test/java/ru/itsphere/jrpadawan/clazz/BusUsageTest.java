package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class BusUsageTest {

    @Test
    public void changeBusSpeedAndPassengersTest() {
        BusUsage busUsage = new BusUsage();
        Bus bus = busUsage.changeBusSpeedAndPassengers(new Bus());
        Assert.assertNotNull(bus);
        Assert.assertEquals(bus.getSpeed(), 220);
        Assert.assertEquals(bus.passengers, 25);
    }
}
