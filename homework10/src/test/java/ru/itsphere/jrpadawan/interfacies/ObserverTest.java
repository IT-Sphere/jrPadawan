package ru.itsphere.jrpadawan.interfacies;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ObserverTest {
    public static final String OBSERVER_INTERFACE = "ru.itsphere.jrpadawan.interfacies.Observer";
    public static final String UPDATE_METHOD = "update";

    public static Class<?> getObserverInterface() {
        String observerInterface = OBSERVER_INTERFACE;
        Class<?> observer;
        try {
            observer = Class.forName(observerInterface);
        } catch (ClassNotFoundException e) {
            Assert.fail("Interface " + observerInterface + " was not created or has wrong signature.");
            return null;
        }
        return observer;
    }

    public static Method getUpdateMethodFromObserverInterface(Class<?> observer) {
        Method method;
        try {
            method = observer.getDeclaredMethod(UPDATE_METHOD, Object.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Interface " + observer + " doesn't have method 'update'.");
            return null;
        }
        return method;
    }

    @Test
    public void testInterface() {
        Class<?> observerInterface = getObserverInterface();
        if (observerInterface == null) {
            return;
        }

        Method method = getUpdateMethodFromObserverInterface(observerInterface);
        if (method == null) {
            return;
        }
    }
}
