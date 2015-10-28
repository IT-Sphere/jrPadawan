package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

public class ClassTest {

    public static final boolean INITIALIZE = false;
    public static final String USER_CLASS = "ru.itsphere.jrpadawan.clazz.User";
    public static final String FIELD_ID = "id";
    public static final String FIELD_AGE = "age";
    public static final int TEST_USER_ID = 1000;
    public static final int TEST_USER_AGE = 25;

    @Test
    public void test1() {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(USER_CLASS, INITIALIZE, ClassLoader.getSystemClassLoader());
            Assert.assertNotNull(clazz);
            Object newInstance = clazz.newInstance();
            checkValueField(clazz, newInstance, FIELD_ID, 0);
            checkValueField(clazz, newInstance, FIELD_AGE, 0);
            checkClassConstructor(clazz);
        } catch (ClassNotFoundException e) {
            Assert.fail("Class " + USER_CLASS + " was not created");
        } catch (InstantiationException e) {
            Assert.fail("Class " + USER_CLASS + " was not created");
        } catch (IllegalAccessException e) {
            Assert.fail("Class " + USER_CLASS + " was not created");
        }
    }

    private void checkClassConstructor(Class<?> clazz) {
        try {
            Object userInstanceWithValues = getUserWithTwoTestParams(clazz);
        } catch (NoSuchMethodException e) {
            Assert.fail("Constructor with two parameters was not found");
        }
        checkValueField(clazz, userInstanceWithValues, FIELD_ID, TEST_USER_ID);
        checkValueField(clazz, userInstanceWithValues, FIELD_AGE, TEST_USER_AGE);
    }

    private Object getUserWithTwoTestParams(Class<?> clazz) throws NoSuchMethodException {
        Constructor<?> twoParamsConstructor = clazz.getConstructor(Integer.class, Integer.class);
        Object userInstanceWithValues = null;
        try {
            userInstanceWithValues = twoParamsConstructor.newInstance(TEST_USER_ID, TEST_USER_AGE);
        } catch (Exception e) {
            Assert.fail("Constructor with two parameters is incorrect");
        }
        return userInstanceWithValues;
    }

    private void checkValueField(Class<?> clazz, Object newInstance, String fieldName, Object value) {
        Field fieldId = getField(clazz, fieldName);
        try {
            Object valueActual = fieldId.get(newInstance);
            if (!value.equals(valueActual)) {
                Assert.fail("Field " + fieldName + " has incorrect value");
            }
        } catch (IllegalAccessException e) {
            Assert.fail("Field " + fieldName + " can't be accessed");
        }
    }

    private Field getField(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Assert.fail("Field " + fieldName + " was not created");
        }
        return null;
    }
}
