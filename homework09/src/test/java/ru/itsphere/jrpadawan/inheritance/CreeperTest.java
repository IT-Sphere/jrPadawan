package ru.itsphere.jrpadawan.inheritance;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class CreeperTest {

    @Test
    public void test() {
        checkClass("ru.itsphere.jrpadawan.inheritance.Creeper");
    }

    private Class<?> checkClass(String className) {
        Class<?> creeper;
        try {
            creeper = Class.forName(className);
        } catch (ClassNotFoundException e) {
            Assert.fail("Class " + className + " was not created.");
            return null;
        }

        if (checkParentClass(className, creeper)) {
            return null;
        }

        if (!Modifier.isAbstract(creeper.getModifiers())) {
            Assert.fail("Class " + className + " is not abstract.");
            return null;
        }
        return creeper;
    }

    private boolean checkParentClass(String className, Class<?> creeper) {
        Class<LandAnimal> parentClass = LandAnimal.class;
        Assert.assertTrue(className + " is not extends class " + parentClass + ".", parentClass.isAssignableFrom(creeper));
        return false;
    }
}
