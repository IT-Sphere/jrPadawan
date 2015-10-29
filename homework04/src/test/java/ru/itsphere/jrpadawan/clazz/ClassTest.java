package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassTest {

    public static final boolean INITIALIZE = false;
    public static final String USER_CLASS = "ru.itsphere.jrpadawan.clazz.User";
    public static final String FIELD_ID = "id";
    public static final String FIELD_AGE = "age";
    public static final int TEST_USER_ID = 1000;
    public static final int TEST_USER_AGE = 25;

    @Test
    public void test1() {
        Class<?> userClass = checkClassExistence();

        Object newInstance = checkInstanceCreationWithDefaultConstructor(userClass);
        Field idField = checkFieldExistance(userClass, FIELD_ID);
        Field ageField = checkFieldExistance(userClass, FIELD_AGE);

        checkValueField(userClass, newInstance, idField, 0);
        checkValueField(userClass, newInstance, ageField, 0);

        Constructor<?> twoArgumentConstructor = checkTwoArgumentConstructor(userClass);
        Object initializedInstance = checkCreationInstanceWithTwoTestParams(userClass, twoArgumentConstructor);
        checkValueField(userClass, initializedInstance, idField, TEST_USER_ID);
        checkValueField(userClass, initializedInstance, ageField, TEST_USER_AGE);
    }

    private Constructor<?> checkTwoArgumentConstructor(Class<?> clazz) {
        try {
            return clazz.getConstructor(Integer.class, Integer.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Object of class " + USER_CLASS + ". Two Argument constructor access error.");
        }
        return null;
    }

    private Object checkInstanceCreationWithDefaultConstructor(Class<?> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            Assert.fail("Object of class " + USER_CLASS + " was not created");
        } catch (IllegalAccessException e) {
            Assert.fail("Object of class " + USER_CLASS + ". Default constructor access error.");
        }
        return null;
    }

    private Class<?> checkClassExistence() {
        try {
            Class<?> userClass = Class.forName(USER_CLASS, INITIALIZE, ClassLoader.getSystemClassLoader());
            Assert.assertNotNull(userClass);
            return userClass;
        } catch (ClassNotFoundException e) {
            Assert.fail("Class " + USER_CLASS + " was not created");
        }
        return null;
    }

    private Object checkCreationInstanceWithTwoTestParams(Class<?> clazz, Constructor<?> constructor) {
        Object instance = null;
        try {
            instance = constructor.newInstance(TEST_USER_ID, TEST_USER_AGE);
        } catch (Exception e) {
            Assert.fail("Constructor with two parameters is incorrect");
        }
        return instance;
    }

    private void checkValueField(Class<?> clazz, Object newInstance, Field field, Object value) {
        try {
            Object valueActual = field.get(newInstance);
            if (!value.equals(valueActual)) {
                Assert.fail("Field " + field.getName() + " has incorrect value");
            }
        } catch (IllegalAccessException e) {
            Assert.fail("Field " + field.getName() + " can't be accessed");
        }
    }

    private Field checkFieldExistance(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Assert.fail("Field " + fieldName + " was not created");
        }
        return null;
    }
}
