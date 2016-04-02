package ru.itsphere.jrpadawan.inheritance;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Modifier;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class CreeperTest {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in class Creeper");

    @Test
    public void test() {
        checkClass("ru.itsphere.jrpadawan.inheritance.Creeper");
    }

    private Class<?> checkClass(String className) {
        Class<?> creeper;
        try {
            creeper = Class.forName(className);
        } catch (ClassNotFoundException e) {
            AssertWrapper.fail(status, "Class " + className + " was not created.");
            return null;
        }

        if (checkParentClass(className, creeper)) {
            return null;
        }

        if (!Modifier.isAbstract(creeper.getModifiers())) {
            AssertWrapper.fail(status, "Class " + className + " is not abstract.");
            return null;
        }
        return creeper;
    }

    private boolean checkParentClass(String className, Class<?> creeper) {
        Class<LandAnimal> parentClass = LandAnimal.class;
        AssertWrapper.assertTrue(status, className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(creeper));
        return false;
    }
}
