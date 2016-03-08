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
public class UserTest {

    @Test
    public void testInterface() {
        Class<?> observer = ObserverTest.getObserverInterface();
        Class<User> userClass = User.class;
        List<Class<?>> interfaces = Arrays.asList(userClass.getInterfaces());
        Assert.assertTrue("Class User doesn't implements interface Observer", interfaces.contains(observer));
        ObserverTest.getUpdateMethodFromObserverInterface(userClass);
    }
}
