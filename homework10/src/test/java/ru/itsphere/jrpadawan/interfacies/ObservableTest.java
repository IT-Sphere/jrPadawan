package ru.itsphere.jrpadawan.interfacies;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ObservableTest {

    public static final String SUBSCRIBERS = "subscribers";
    public static final String ADD_SUBSCRIBER_METHOD = "addSubscriber";
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Observable");

    @Test
    public void testClass() {
        Class<?> observerInterface = ObserverTest.getObserverInterface();
        Field fieldSubscribersFromObservableClass = getFieldSubscribersFromObservableClass();
        fieldSubscribersFromObservableClass.setAccessible(true);
        Class<?> type = fieldSubscribersFromObservableClass.getType();
        List<Bot> bots = new ArrayList<>();
        AssertWrapper.assertNotEquals(status, "Field subscribers has wrong type 'List<Bot>' in Observable class", type, bots.getClass());
        AssertWrapper.assertNotEquals(status, "Field subscribers has wrong type 'List<User>' in Observable class", type, bots.getClass());
        getMethodFromObservableClass(observerInterface);
    }

    private Method getMethodFromObservableClass(Class<?> observerInterface) {
        try {
            return Observable.class.getDeclaredMethod(ADD_SUBSCRIBER_METHOD, observerInterface);
        } catch (NoSuchMethodException e) {
            AssertWrapper.fail(status, "Observable has to have addSubscriber method with observer argument");
        }
        return null;
    }

    private Field getFieldSubscribersFromObservableClass() {
        Class<Observable> observableClass = Observable.class;
        try {
            return observableClass.getDeclaredField(SUBSCRIBERS);
        } catch (NoSuchFieldException e) {
            AssertWrapper.fail(status, "There is no field 'subscribers' in abstract class 'Observable'.");
        }
        return null;
    }
}
