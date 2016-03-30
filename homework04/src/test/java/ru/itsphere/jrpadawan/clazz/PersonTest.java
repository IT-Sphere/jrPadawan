package ru.itsphere.jrpadawan.clazz;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class PersonTest {
    public static final int OLDER_THEN_IT = 50;
    public static final int HIGHER_THEN_IT = 200;
    public static final int TEST_PERSON_HEIGHT = 178;
    public static final int TEST_PERSON_AGE = 25;

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Person (task 1)");

    @Test
    public void test1() {
        Class<?> personClass = checkClassExistence();

        Object newInstance = checkInstanceCreationWithDefaultConstructor(personClass);
        Field heightField = checkFieldExistance(personClass, TestConstants.FIELD_HEIGHT);
        Field ageField = checkFieldExistance(personClass, TestConstants.FIELD_AGE);

        checkValueField(newInstance, heightField, 0);
        checkValueField(newInstance, ageField, 0);

        Constructor<?> twoArgumentConstructor = checkTwoArgumentConstructor(personClass);
        Object notDefaultInstance = checkCreationInstanceWithTwoTestParams(twoArgumentConstructor);

        checkValueField(notDefaultInstance, heightField, TEST_PERSON_HEIGHT);
        checkValueField(notDefaultInstance, ageField, TEST_PERSON_AGE);

        Method isKidMethod = checkMethodExistence(personClass, TestConstants.METHOD_IS_KID);
        checkIsKidMethod(notDefaultInstance, isKidMethod);

        Method isOlderMethod = checkMethodExistence(personClass, TestConstants.METHOD_IS_OLDER);
        checkIsOlderMethod(notDefaultInstance, isOlderMethod);

        Method isHigherMethod = checkMethodExistence(personClass, TestConstants.METHOD_IS_HIGHER);
        checkIsHigherMethod(notDefaultInstance, isHigherMethod);
    }

    private void checkIsOlderMethod(Object instance, Method method) {
        try {
            method.setAccessible(true);
            if ((Boolean) method.invoke(instance, OLDER_THEN_IT)) {
                AssertWrapper.fail(status, getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            AssertWrapper.fail(status, getMethodAccessErrorMessage(method));
        } finally {
            method.setAccessible(false);
        }
    }

    private void checkIsHigherMethod(Object instance, Method method) {
        try {
            method.setAccessible(true);
            if ((Boolean) method.invoke(instance, HIGHER_THEN_IT)) {
                AssertWrapper.fail(status, getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            AssertWrapper.fail(status, getMethodAccessErrorMessage(method));
        } finally {
            method.setAccessible(false);
        }
    }

    private String getMethodAccessErrorMessage(Method method) {
        return "Method " + method.getName() + " access error.";
    }

    private void checkIsKidMethod(Object instance, Method method) {
        try {
            method.setAccessible(true);
            if ((Boolean) method.invoke(instance)) {
                AssertWrapper.fail(status, getMethodLogicIsIncorrectMessage(method));
            }
        } catch (Exception e) {
            AssertWrapper.fail(status, getMethodAccessErrorMessage(method));
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
        AssertWrapper.fail(status, "Method " + methodName + " was not found");
        return null;
    }

    private Constructor<?> checkTwoArgumentConstructor(Class<?> personClass) {
        for (Constructor constructor : personClass.getDeclaredConstructors()) {
            if (constructor.getParameterCount() == 2) {
                for (Class paramClass : constructor.getParameterTypes()) {
                    if (!paramClass.equals(int.class)) {
                        AssertWrapper.fail(status, "Two parameters constructor has incorrect parameters types.");
                    }
                }
                return constructor;
            }
        }
        AssertWrapper.fail(status, "Two parameters constructor was not found.");
        return null;
    }

    private Object checkInstanceCreationWithDefaultConstructor(Class<?> personClass) {
        for (Constructor constructor : personClass.getDeclaredConstructors()) {
            if (constructor.getParameterCount() == 0) {
                try {
                    constructor.setAccessible(true);
                    return constructor.newInstance();
                } catch (InstantiationException e) {
                    AssertWrapper.fail(status, "Object of class " + TestConstants.PERSON_CLASS + " was not created");
                } catch (IllegalAccessException e) {
                    AssertWrapper.fail(status, "Object of class " + TestConstants.PERSON_CLASS + ". Default constructor access error.");
                } catch (InvocationTargetException e) {
                    AssertWrapper.fail(status, "Object of class " + TestConstants.PERSON_CLASS + ". Default constructor is incorrect.");
                } finally {
                    constructor.setAccessible(false);
                }
            }
        }
        AssertWrapper.fail(status, "Default constructor was not found.");
        return null;
    }

    private Class<?> checkClassExistence() {
        try {
            Class<?> personClass = Class.forName(TestConstants.PERSON_CLASS, TestConstants.INITIALIZE, ClassLoader.getSystemClassLoader());
            AssertWrapper.assertNotNull(status, personClass);
            return personClass;
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + TestConstants.PERSON_CLASS + " was not created");
        }
        return null;
    }

    private Object checkCreationInstanceWithTwoTestParams(Constructor<?> constructor) {
        Object instance = null;
        try {
            constructor.setAccessible(true);
            instance = constructor.newInstance(TEST_PERSON_HEIGHT, TEST_PERSON_AGE);
        } catch (Exception e) {
            AssertWrapper.fail(status, "Constructor with two parameters is incorrect");
        } finally {
            constructor.setAccessible(false);
        }
        return instance;
    }

    private void checkValueField(Object newInstance, Field field, Object value) {
        try {
            field.setAccessible(true);
            Object valueActual = field.get(newInstance);
            if (!value.equals(valueActual)) {
                AssertWrapper.fail(status, "Field " + field.getName() + " has incorrect value");
            }
        } catch (IllegalAccessException e) {
            AssertWrapper.fail(status, "Field " + field.getName() + " can't be accessed");
        } finally {
            field.setAccessible(false);
        }
    }

    private Field checkFieldExistance(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            AssertWrapper.fail(status, "Field " + fieldName + " was not created");
        }
        return null;
    }
}
