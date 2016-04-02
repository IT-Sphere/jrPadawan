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
public class UserTest {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class User");

    @Test
    public void testInterface() {
        Class<?> observer = ObserverTest.getObserverInterface();
        Class<User> userClass = User.class;
        List<Class<?>> interfaces = Arrays.asList(userClass.getInterfaces());
        AssertWrapper.assertTrue(status, "Class User doesn't implements interface Observer", interfaces.contains(observer));
        ObserverTest.getUpdateMethodFromObserverInterface(userClass);
    }
}
