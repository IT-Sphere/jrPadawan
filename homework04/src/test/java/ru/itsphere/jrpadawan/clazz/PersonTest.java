package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonTest {
    public static final int OLDER_THEN_IT = 50;
    public static final int HIGHER_THEN_IT = 200;
    public static final int TEST_PERSON_HEIGHT = 178;
    public static final int TEST_PERSON_AGE = 25;

    @Test
    public void test1() {
        Class<?> personClass = checkClassExistence();

        Object newInstance = checkInstanceCreationWithDefaultConstructor(personClass);
        Field heightField = checkFieldExistance(personClass, TestConstants.FIELD_HEIGHT);
        Field ageField = checkFieldExistance(personClass, TestConstants.FIELD_AGE);

        checkValueField(personClass, newInstance, heightField, 0);
        checkValueField(personClass, newInstance, ageField, 0);

        Constructor<?> twoArgumentConstructor = checkTwoArgumentConstructor(personClass);
        Object notDefaultInstance = checkCreationInstanceWithTwoTestParams(personClass, twoArgumentConstructor);

        checkValueField(personClass, notDefaultInstance, heightField, TEST_PERSON_HEIGHT);
        checkValueField(personClass, notDefaultInstance, ageField, TEST_PERSON_AGE);

        Method isKidMethod = checkMethodExistence(personClass, TestConstants.METHOD_IS_KID);
        checkIsKidMethod(personClass, notDefaultInstance, isKidMethod);

        Method isOlderMethod = checkMethodExistence(personClass, TestConstants.METHOD_IS_OLDER);
        checkIsOlderMethod(personClass, notDefaultInstance, isOlderMethod);

        Method isHigherMethod = checkMethodExistence(personClass, TestConstants.METHOD_IS_HIGHER);
        checkIsHigherMethod(personClass, notDefaultInstance, isHigherMethod);
    }

    private void checkIsOlderMethod(Class<?> personClass, Object instance, Method method) {
        try {
            method.setAccessible(true);
            if ((Boolean) method.invoke(instance, OLDER_THEN_IT)) {
                Assert.fail(getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            Assert.fail(getMethodAccessErrorMessage(method));
        } finally {
            method.setAccessible(false);
        }
    }

    private void checkIsHigherMethod(Class<?> personClass, Object instance, Method method) {
        try {
            method.setAccessible(true);
            if ((Boolean) method.invoke(instance, HIGHER_THEN_IT)) {
                Assert.fail(getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            Assert.fail(getMethodAccessErrorMessage(method));
        } finally {
            method.setAccessible(false);
        }
    }

    private String getMethodAccessErrorMessage(Method method) {
        return "Method " + method.getName() + " access error.";
    }

    private void checkIsKidMethod(Class<?> personClass, Object instance, Method method) {
        try {
            method.setAccessible(true);
            if ((Boolean) method.invoke(instance)) {
                Assert.fail(getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            Assert.fail(getMethodAccessErrorMessage(method));
        } finally {
            method.setAccessible(false);
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

    private Constructor<?> checkTwoArgumentConstructor(Class<?> personClass) {
        for (Constructor constructor : personClass.getDeclaredConstructors()) {
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

    private Object checkInstanceCreationWithDefaultConstructor(Class<?> personClass) {
        for (Constructor constructor : personClass.getDeclaredConstructors()) {
            if (constructor.getParameterCount() == 0) {
                try {
                    constructor.setAccessible(true);
                    return constructor.newInstance();
                } catch (InstantiationException e) {
                    Assert.fail("Object of class " + TestConstants.PERSON_CLASS + " was not created");
                } catch (IllegalAccessException e) {
                    Assert.fail("Object of class " + TestConstants.PERSON_CLASS + ". Default constructor access error.");
                } catch (InvocationTargetException e) {
                    Assert.fail("Object of class " + TestConstants.PERSON_CLASS + ". Default constructor is incorrect.");
                } finally {
                    constructor.setAccessible(false);
                }
            }
        }
        Assert.fail("Default constructor was not found.");
        return null;
    }

    private Class<?> checkClassExistence() {
        try {
            Class<?> personClass = TestUtils.getPersonClass();
            Assert.assertNotNull(personClass);
            return personClass;
        } catch (ClassNotFoundException e) {
            Assert.fail("Class " + TestConstants.PERSON_CLASS + " was not created");
        }
        return null;
    }

    private Object checkCreationInstanceWithTwoTestParams(Class<?> clazz, Constructor<?> constructor) {
        Object instance = null;
        try {
            constructor.setAccessible(true);
            instance = constructor.newInstance(TEST_PERSON_HEIGHT, TEST_PERSON_AGE);
        } catch (Exception e) {
            Assert.fail("Constructor with two parameters is incorrect");
        } finally {
            constructor.setAccessible(false);
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
        } finally {
            field.setAccessible(false);
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
