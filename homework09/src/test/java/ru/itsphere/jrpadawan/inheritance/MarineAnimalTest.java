package ru.itsphere.jrpadawan.inheritance;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class MarineAnimalTest {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class MarineAnimal");

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
            AssertWrapper.fail(status, "Class " + className + " was not created.");
            return null;
        }

        Class<Animal> parentClass = Animal.class;
        AssertWrapper.assertTrue(status, className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(marineAnimal));

        if (!Modifier.isAbstract(marineAnimal.getModifiers())) {
            AssertWrapper.fail(status, "Class " + className + " is not abstract.");
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
            AssertWrapper.fail(status, "Field " + fieldName + " was not created in class " + className);
            return true;
        }

        if (!Modifier.isPrivate(field.getModifiers())) {
            AssertWrapper.fail(status, "Field " + fieldName + " is not a private method");
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
            AssertWrapper.fail(status, "Method " + methodName + " was not created in class " + className);
            return;
        }

        if (!Modifier.isPublic(method.getModifiers())) {
            AssertWrapper.fail(status, "Method " + methodName + " is not a public method");
            return;
        }

        if (!double.class.equals(method.getReturnType())) {
            AssertWrapper.fail(status, "Method " + methodName + " does not return double");
            return;
        }
    }
}
