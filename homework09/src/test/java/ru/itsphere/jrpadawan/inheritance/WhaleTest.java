package ru.itsphere.jrpadawan.inheritance;

import org.junit.Assert;
import org.junit.Test;

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
            Assert.fail("Class " + className + " was not created.");
            return null;
        }

        Class<MarineAnimal> parentClass = MarineAnimal.class;
        Assert.assertTrue(className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(whale));

        if (Modifier.isAbstract(whale.getModifiers())) {
            Assert.fail("Class " + className + " must not be abstract.");
            return null;
        }
        return whale;
    }

    private Object checkConstructor(Class<?> whale, String className, String constructorArg) {
        Constructor<?> whaleConstructor = null;
        try {
            whaleConstructor = whale.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Constructor of class " + className + " was not created.");
            return null;
        }

        if (!Modifier.isPublic(whaleConstructor.getModifiers())) {
            Assert.fail("Constructor of class " + className + " have to be public.");
            return null;
        }

        Object instance = null;
        try {
            instance = whaleConstructor.newInstance(constructorArg);
        } catch (Exception e) {
            Assert.fail("Class " + className + ". Constructor execution error.");
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
            Assert.fail("Method " + methodName + " was not inherited in class " + className);
            return;
        }

        double moveResult = 0;
        try {
            moveResult = (double) move.invoke(instance, Inheritance.ONE_HUNDRED_METERS);
        } catch (Exception e) {
            Assert.fail("Class " + className + ", Method " + methodName + ". Execution error.");
            return;
        }

        Assert.assertEquals("logic of metod move of the animal (" + className + ") is incorrect.", MOVE_TIME_EXPECTED, moveResult, DELTA);
    }

    private void checkName(Class<?> whale, String className, Object instance, String sasha) {
        String methodName = "getName";
        Method getName = null;
        try {
            getName = whale.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            Assert.fail("Method " + methodName + " was not inherited in class " + className);
            return;
        }

        String getNameResult = null;
        try {
            getNameResult = (String) getName.invoke(instance);
        } catch (Exception e) {
            Assert.fail("Class " + className + ", Method " + methodName + ". Execution error.");
            return;
        }

        if (!getNameResult.equals(sasha)) {
            Assert.fail("Name of the animal (" + className + ") was not setted.");
            return;
        }
    }
}
