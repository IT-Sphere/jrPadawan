package ru.itsphere.jrpadawan.inheritance;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class MarineAnimalTest {

    @Test
    public void test() {
        String className = "ru.itsphere.jrpadawan.inheritance.MarineAnimal";
        Class<?> marineAnimal = checkClass(className);
        if (marineAnimal == null) {
            return;
        }

        if (checkSwimSpeed(marineAnimal, className)) {
            return;
        }

        checkMove(marineAnimal, className);
    }

    private Class<?> checkClass(String className) {
        Class<?> marineAnimal;
        try {
            marineAnimal = Class.forName(className);
        } catch (ClassNotFoundException e) {
            Assert.fail("Class " + className + " was not created.");
            return null;
        }

        Class<Animal> parentClass = Animal.class;
        Assert.assertTrue(className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(marineAnimal));

        if (!Modifier.isAbstract(marineAnimal.getModifiers())) {
            Assert.fail("Class " + className + " is not abstract.");
            return null;
        }
        return marineAnimal;
    }

    private boolean checkSwimSpeed(Class<?> marineAnimal, String className) {
        Field field = null;
        String fieldName = "swimSpeed";
        try {
            field = marineAnimal.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Assert.fail("Field " + fieldName + " was not created in class " + className);
            return true;
        }

        if (!Modifier.isPrivate(field.getModifiers())) {
            Assert.fail("Field " + fieldName + " is not a private method");
            return true;
        }
        return false;
    }

    private void checkMove(Class<?> marineAnimal, String className) {
        Method method = null;
        String methodName = "move";
        try {
            method = marineAnimal.getDeclaredMethod(methodName, double.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Method " + methodName + " was not created in class " + className);
            return;
        }

        if (!Modifier.isPublic(method.getModifiers())) {
            Assert.fail("Method " + methodName + " is not a public method");
            return;
        }

        if (!double.class.equals(method.getReturnType())) {
            Assert.fail("Method " + methodName + " does not return double");
            return;
        }
    }
}
