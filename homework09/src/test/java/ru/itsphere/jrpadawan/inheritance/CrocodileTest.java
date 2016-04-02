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
public class CrocodileTest {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Crocodile");

    public static final double MOVE_TIME_EXPECTED = 21.277;
    public static final double DELTA = 0.001;
    public static final String SOUND = "shr";

    @Test
    public void test() {
        String className = "ru.itsphere.jrpadawan.inheritance.Crocodile";
        Class<?> crocodile = checkClass(className);

        if (crocodile == null) {
            return;
        }

        String constructorArg = "constructorArg";
        Object instance = checkConstructor(crocodile, className, constructorArg);
        if (instance == null) {
            return;
        }

        checkName(crocodile, className, instance, constructorArg);
        checkMove(crocodile, className, instance);
        checkSound(crocodile, className, instance);
    }

    private Class<?> checkClass(String className) {
        Class<?> crocodile;
        try {
            crocodile = Class.forName(className);
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + className + " was not created.");
            return null;
        }

        if (checkParentClass(className, crocodile)) {
            return null;
        }

        if (Modifier.isAbstract(crocodile.getModifiers())) {
            AssertWrapper.fail(status, "Class " + className + " must not be abstract.");
            return null;
        }
        return crocodile;
    }

    private boolean checkParentClass(String className, Class<?> creeper) {
        Class<?> parentClass;
        String parentClassName = null;
        try {
            parentClassName = "ru.itsphere.jrpadawan.inheritance.Creeper";
            parentClass = Class.forName(parentClassName);
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + parentClassName + " was not created.");
            return true;
        }
        AssertWrapper.assertTrue(status, className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(creeper));
        return false;
    }

    private Object checkConstructor(Class<?> crocodile, String className, String constructorArg) {
        Constructor<?> whaleConstructor = null;
        try {
            whaleConstructor = crocodile.getConstructor(String.class);
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

    private void checkSound(Class<?> crocodile, String className, Object instance) {
        String methodName = "getSound";
        Method getSound = null;
        try {
            getSound = crocodile.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            AssertWrapper.fail(status, "Method " + methodName + " was not inherited in class " + className);
            return;
        }

        String getSoundResult = null;
        try {
            getSoundResult = (String) getSound.invoke(instance);
        } catch (Exception e) {
            AssertWrapper.fail(status, "Class " + className + ", Method " + methodName + ". Execution error.");
            return;
        }

        if (!getSoundResult.equals(SOUND)) {
            AssertWrapper.fail(status, "Sound of the animal (" + className + ") was not setted.");
            return;
        }
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
