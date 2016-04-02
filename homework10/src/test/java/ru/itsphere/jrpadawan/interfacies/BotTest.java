package ru.itsphere.jrpadawan.interfacies;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.util.Arrays;
import java.util.List;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class BotTest {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Bot");

    @Test
    public void testClass() {
        Class<?> observer = ObserverTest.getObserverInterface();
        Class<Bot> botClass = Bot.class;
        List<Class<?>> interfaces = Arrays.asList(botClass.getInterfaces());
        AssertWrapper.assertTrue(status, "Class Bot doesn't implements interface Observer", interfaces.contains(observer));
        ObserverTest.getUpdateMethodFromObserverInterface(botClass);
    }
}
