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
public class SnakeTest {

    public static final double MOVE_TIME_EXPECTED = 32.258;
    public static final double DELTA = 0.001;
    public static final String SOUND = "sh";
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Snake");

    @Test
    public void test() {
        String className = "ru.itsphere.jrpadawan.inheritance.Snake";
        Class<?> snake = checkClass(className);

        if (snake == null) {
            return;
        }

        String constructorArg = "constructorArg";
        Object instance = checkConstructor(snake, className, constructorArg);
        if (instance == null) {
            return;
        }

        checkName(snake, className, instance, constructorArg);
        checkMove(snake, className, instance);
        checkSound(snake, className, instance);
    }

    private Class<?> checkClass(String className) {
        Class<?> snake;
        try {
            snake = Class.forName(className);
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + className + " was not created.");
            return null;
        }

        if (checkParentClass(className, snake)) {
            return null;
        }

        if (Modifier.isAbstract(snake.getModifiers())) {
            AssertWrapper.fail(status, "Class " + className + " must not be abstract.");
            return null;
        }
        return snake;
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

    private Object checkConstructor(Class<?> snake, String className, String constructorArg) {
        Constructor<?> snakeConstructor = null;
        try {
            snakeConstructor = snake.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            AssertWrapper.fail(status, "Constructor of class " + className + " was not created.");
            return null;
        }

        if (!Modifier.isPublic(snakeConstructor.getModifiers())) {
            AssertWrapper.fail(status, "Constructor of class " + className + " have to be public.");
            return null;
        }

        Object instance = null;
        try {
            instance = snakeConstructor.newInstance(constructorArg);
        } catch (Exception e) {
            AssertWrapper.fail(status, "Class " + className + ". Constructor execution error.");
            return null;
        }
        return instance;
    }

    private void checkSound(Class<?> aClass, String className, Object instance) {
        String methodName = "getSound";
        Method getSound = null;
        try {
            getSound = aClass.getMethod(methodName);
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
