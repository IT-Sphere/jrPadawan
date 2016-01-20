package ru.itsphere.jrpadawan.inheritance;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class InheritanceTest {

    @Test
    public void testCreeper() {
        Class<?> creeper = null;
        String className = "ru.itsphere.jrpadawan.inheritance.Creeper";
        try {
            creeper = Class.forName(className);
        } catch (ClassNotFoundException e) {
            Assert.fail("Class " + className + " was not created.");
        }

        Assert.assertTrue("Creeper is not extends LandAnimals.", LandAnimals.class.isAssignableFrom(creeper));
    }
}
