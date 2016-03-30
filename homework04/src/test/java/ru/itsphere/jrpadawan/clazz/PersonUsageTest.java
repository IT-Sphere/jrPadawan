package ru.itsphere.jrpadawan.clazz;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Field;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class PersonUsageTest {
    private static CheckingStatus createPersonStatus =
            new TaskCheckingStatus("There is an error in method createPerson of class PersonUsage (task 2)");
    private static CheckingStatus createSuitablePersonStatus =
            new TaskCheckingStatus("There is an error in method createSuitablePerson of class PersonUsage (task 3)");
    private static CheckingStatus createUnsuitablePersonStatus =
            new TaskCheckingStatus("There is an error in method createUnsuitablePerson of class PersonUsage (task 4)");

    @Test
    public void createPersonTest() {
        PersonUsage personUsage = new PersonUsage();
        Object person = personUsage.createPerson();
        AssertWrapper.assertNotNull(createPersonStatus, person);
        AssertWrapper.assertEquals(createPersonStatus, TestConstants.PERSON_CLASS, person.getClass().getName());
    }

    @Test
    public void createSuitablePersonTest() throws Exception {
        PersonUsage personUsage = new PersonUsage();
        Object person = personUsage.createSuitablePerson();
        AssertWrapper.assertNotNull(createSuitablePersonStatus, person);
        AssertWrapper.assertEquals(createSuitablePersonStatus, TestConstants.PERSON_CLASS, person.getClass().getName());

        Field fieldAge = person.getClass().getDeclaredField(TestConstants.FIELD_AGE);
        int age = (Integer) fieldAge.get(person);
        AssertWrapper.assertTrue(createSuitablePersonStatus, PersonUsage.MAX_AGE > age);

        Field fieldHeight = person.getClass().getDeclaredField(TestConstants.FIELD_HEIGHT);
        int height = (Integer) fieldHeight.get(person);
        AssertWrapper.assertTrue(createSuitablePersonStatus, PersonUsage.MIN_HEIGHT < height);
    }

    @Test
    public void createUnsuitablePersonTest() throws Exception {
        PersonUsage personUsage = new PersonUsage();
        Object person = personUsage.createUnsuitablePerson();
        AssertWrapper.assertNotNull(createUnsuitablePersonStatus, person);
        AssertWrapper.assertEquals(createUnsuitablePersonStatus, TestConstants.PERSON_CLASS, person.getClass().getName());

        Field fieldAge = person.getClass().getDeclaredField(TestConstants.FIELD_AGE);
        int age = (Integer) fieldAge.get(person);

        Field fieldHeight = person.getClass().getDeclaredField(TestConstants.FIELD_HEIGHT);
        int height = (Integer) fieldHeight.get(person);

        if (age <= PersonUsage.MAX_AGE && height >= PersonUsage.MIN_HEIGHT) {
            AssertWrapper.fail(createUnsuitablePersonStatus);
        }
    }
}
