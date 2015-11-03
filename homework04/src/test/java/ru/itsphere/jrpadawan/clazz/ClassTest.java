package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {

    public static final boolean INITIALIZE = false;
    public static final String USER_CLASS = "ru.itsphere.jrpadawan.clazz.User";
    public static final String FIELD_HEIGHT = "height";
    public static final String FIELD_AGE = "age";
    public static final String METHOD_IS_KID = "isKid";
    public static final String METHOD_IS_OLDER = "isOlder";
    public static final String METHOD_IS_HIGHER = "isHigher";
    public static final int OLDER_THEN_IT = 50;
    public static final int HIGHER_THEN_IT = 200;
    public static final int TEST_USER_HEIGHT = 178;
    public static final int TEST_USER_AGE = 25;

    @Test
    public void test1() {
        Class<?> userClass = checkClassExistence();

        Object newInstance = checkInstanceCreationWithDefaultConstructor(userClass);
        Field heightField = checkFieldExistance(userClass, FIELD_HEIGHT);
        Field ageField = checkFieldExistance(userClass, FIELD_AGE);

        checkValueField(userClass, newInstance, heightField, 0);
        checkValueField(userClass, newInstance, ageField, 0);

        Constructor<?> twoArgumentConstructor = checkTwoArgumentConstructor(userClass);
        Object notDefaultInstance = checkCreationInstanceWithTwoTestParams(userClass, twoArgumentConstructor);

        checkValueField(userClass, notDefaultInstance, heightField, TEST_USER_HEIGHT);
        checkValueField(userClass, notDefaultInstance, ageField, TEST_USER_AGE);

        Method isKidMethod = checkMethodExistence(userClass, METHOD_IS_KID);
        checkIsKidMethod(userClass, notDefaultInstance, isKidMethod);

        Method isOlderMethod = checkMethodExistence(userClass, METHOD_IS_OLDER);
        checkIsOlderMethod(userClass, notDefaultInstance, isOlderMethod);

        Method isHigherMethod = checkMethodExistence(userClass, METHOD_IS_HIGHER);
        checkIsHigherMethod(userClass, notDefaultInstance, isHigherMethod);
    }

    private void checkIsOlderMethod(Class<?> userClass, Object instance, Method method) {
        method.setAccessible(true);
        try {
            if ((Boolean) method.invoke(instance, OLDER_THEN_IT)) {
                Assert.fail(getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            Assert.fail(getMethodAccessErrorMessage(method));
        }
    }

    private void checkIsHigherMethod(Class<?> userClass, Object instance, Method method) {
        method.setAccessible(true);
        try {
            if ((Boolean) method.invoke(instance, HIGHER_THEN_IT)) {
                Assert.fail(getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            Assert.fail(getMethodAccessErrorMessage(method));
        }
    }

    private String getMethodAccessErrorMessage(Method method) {
        return "Method " + method.getName() + " access error.";
    }

    private void checkIsKidMethod(Class<?> userClass, Object instance, Method method) {
        method.setAccessible(true);
        try {
            if ((Boolean) method.invoke(instance)) {
                Assert.fail(getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            Assert.fail(getMethodAccessErrorMessage(method));
        }
    }

    private String getMethodLogicIsIncorrectMessage(Method method) {
        return "Logic of method " + method.getName() + " is incorrect.";
    }

    private Method checkMethodExistence(Class<?> clazz, String methodName) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getName().equals(methodName)) {
                return method;
            }
        }
        Assert.fail("Method " + methodName + " was not found");
        return null;
    }

    private Constructor<?> checkTwoArgumentConstructor(Class<?> clazz) {
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            if (constructor.getParameterCount() == 2) {
                for (Class paramClass : constructor.getParameterTypes()) {
                    if (!paramClass.equals(int.class)) {
                        Assert.fail("Two parameters constructor has incorrect parameters types.");
                    }
                }
                return constructor;
            }
        }
        Assert.fail("Two parameters constructor was not found.");
        return null;
    }

    private Object checkInstanceCreationWithDefaultConstructor(Class<?> clazz) {
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            if (constructor.getParameterCount() == 0) {
                constructor.setAccessible(true);
                try {
                    return constructor.newInstance();
                } catch (InstantiationException e) {
                    Assert.fail("Object of class " + USER_CLASS + " was not created");
                } catch (IllegalAccessException e) {
                    Assert.fail("Object of class " + USER_CLASS + ". Default constructor access error.");
                } catch (InvocationTargetException e) {
                    Assert.fail("Object of class " + USER_CLASS + ". Default constructor is incorrect.");
                }
            }
        }
        Assert.fail("Default constructor was not found.");
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
            constructor.setAccessible(true);
            instance = constructor.newInstance(TEST_USER_HEIGHT, TEST_USER_AGE);
        } catch (Exception e) {
            Assert.fail("Constructor with two parameters is incorrect");
        }
        return instance;
    }

    private void checkValueField(Class<?> clazz, Object newInstance, Field field, Object value) {
        try {
            field.setAccessible(true);
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
