package ru.itsphere.jrpadawan.inheritance;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class WhaleTest {

    public static final double MOVE_TIME_EXPECTED = 9.709;
    public static final double DELTA = 0.001;
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Whale");

    @Test
    public void test() {
        String className = "ru.itsphere.jrpadawan.inheritance.Whale";
        Class<?> whale = checkClass(className);

        if (whale == null) {
            return;
        }

        String constructorArg = "constructorArg";
        Object instance = checkConstructor(whale, className, constructorArg);
        if (instance == null) {
            return;
        }

        checkName(whale, className, instance, constructorArg);
        checkMove(whale, className, instance);
    }

    private Class<?> checkClass(String className) {
        Class<?> whale;
        try {
            whale = Class.forName(className);
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + className + " was not created.");
            return null;
        }

        Class<?> parentClass = null;
        String parentClassName = null;
        try {
            parentClassName = "ru.itsphere.jrpadawan.inheritance.MarineAnimal";
            parentClass = Class.forName(parentClassName);
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + parentClassName + " was not created.");
            return null;
        }
        AssertWrapper.assertTrue(status, className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(whale));

        if (Modifier.isAbstract(whale.getModifiers())) {
            AssertWrapper.fail(status, "Class " + className + " must not be abstract.");
            return null;
        }
        return whale;
    }

    private Object checkConstructor(Class<?> whale, String className, String constructorArg) {
        Constructor<?> whaleConstructor = null;
        try {
            whaleConstructor = whale.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            AssertWrapper.fail(status, "Constructor of class " + className + " was not created.");
            return null;
        }

        if (!Modifier.isPublic(whaleConstructor.getModifiers())) {
            AssertWrapper.fail(status, "Constructor of class " + className + " have to be public.");
            return null;
        }

        Object instance = null;
        try {
            instance = whaleConstructor.newInstance(constructorArg);
        } catch (Exception e) {
            AssertWrapper.fail(status, "Class " + className + ". Constructor execution error.");
            return null;
        }
        return instance;
    }

    private void checkMove(Class<?> whale, String className, Object instance) {
        String methodName = "move";
        Method move = null;
        try {
            move = whale.getMethod(methodName, double.class);
        } catch (NoSuchMethodException e) {
            AssertWrapper.fail(status, "Method " + methodName + " was not inherited in class " + className);
            return;
        }

        double moveResult = 0;
        try {
            moveResult = (double) move.invoke(instance, Inheritance.ONE_HUNDRED_METERS);
        } catch (Exception e) {
            AssertWrapper.fail(status, "Class " + className + ", Method " + methodName + ". Execution error.");
            return;
        }

        AssertWrapper.assertEquals(status, "logic of metod move of the animal (" + className + ") is incorrect.", MOVE_TIME_EXPECTED, moveResult, DELTA);
    }

    private void checkName(Class<?> whale, String className, Object instance, String sasha) {
        String methodName = "getName";
        Method getName = null;
        try {
            getName = whale.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            AssertWrapper.fail(status, "Method " + methodName + " was not inherited in class " + className);
            return;
        }

        String getNameResult = null;
        try {
            getNameResult = (String) getName.invoke(instance);
        } catch (Exception e) {
            AssertWrapper.fail(status, "Class " + className + ", Method " + methodName + ". Execution error.");
            return;
        }

        if (!getNameResult.equals(sasha)) {
            AssertWrapper.fail(status, "Name of the animal (" + className + ") was not setted.");
            return;
        }
    }
}