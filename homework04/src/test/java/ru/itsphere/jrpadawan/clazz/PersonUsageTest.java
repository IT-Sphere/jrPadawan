package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class PersonUsageTest {

    @Test
    public void createPersonTest() {
        PersonUsage personUsage = new PersonUsage();
        Object person = personUsage.createPerson();
        Assert.assertNotNull(person);
        Assert.assertEquals(TestConstants.PERSON_CLASS, person.getClass().getName());
    }

    @Test
    public void createSuitablePersonTest() throws Exception {
        PersonUsage personUsage = new PersonUsage();
        Object person = personUsage.createSuitablePerson();
        Assert.assertNotNull(person);
        Assert.assertEquals(TestConstants.PERSON_CLASS, person.getClass().getName());

        Field fieldAge = person.getClass().getDeclaredField(TestConstants.FIELD_AGE);
        int age = (Integer) fieldAge.get(person);
        Assert.assertTrue(PersonUsage.MAX_AGE > age);

        Field fieldHeight = person.getClass().getDeclaredField(TestConstants.FIELD_HEIGHT);
        int height = (Integer) fieldHeight.get(person);
        Assert.assertTrue(PersonUsage.MIN_HEIGHT < height);
    }

    @Test
    public void createUnsuitablePersonTest() throws Exception {
        PersonUsage personUsage = new PersonUsage();
        Object person = personUsage.createUnsuitablePerson();
        Assert.assertNotNull(person);
        Assert.assertEquals(TestConstants.PERSON_CLASS, person.getClass().getName());

        Field fieldAge = person.getClass().getDeclaredField(TestConstants.FIELD_AGE);
        int age = (Integer) fieldAge.get(person);

        Field fieldHeight = person.getClass().getDeclaredField(TestConstants.FIELD_HEIGHT);
        int height = (Integer) fieldHeight.get(person);

        if (age <= PersonUsage.MAX_AGE && height >= PersonUsage.MIN_HEIGHT) {
            Assert.fail();
        }
    }
}
