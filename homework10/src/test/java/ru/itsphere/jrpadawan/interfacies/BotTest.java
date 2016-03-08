package ru.itsphere.jrpadawan.interfacies;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class BotTest {

    @Test
    public void testClass() {
        Class<?> observer = ObserverTest.getObserverInterface();
        Class<Bot> botClass = Bot.class;
        List<Class<?>> interfaces = Arrays.asList(botClass.getInterfaces());
        Assert.assertTrue("Class Bot doesn't implements interface Observer", interfaces.contains(observer));
        ObserverTest.getUpdateMethodFromObserverInterface(botClass);
    }
}
