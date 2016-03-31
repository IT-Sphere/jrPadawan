package ru.itsphere.jrpadawan.clazz2;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class TasksTest {

    private static CheckingStatus statusTask1 = new TaskCheckingStatus("There is an error in task 1");
    private static CheckingStatus statusTask2 = new TaskCheckingStatus("There is an error in task 2");
    private static CheckingStatus statusTask3 = new TaskCheckingStatus("There is an error in task 3");
    private static CheckingStatus statusTask4 = new TaskCheckingStatus("There is an error in task 4");
    private static CheckingStatus statusTask5 = new TaskCheckingStatus("There is an error in task 5");

    @Test
    public void task1Test() throws Exception {
        Application application = Tasks.task1();
        AssertWrapper.assertNotNull(statusTask1, application);
        checkFieldValue(statusTask1, "NAME", "Photoshop", application);
    }

    @Test
    public void task2Test() throws Exception {
        Application application = Tasks.task2();
        AssertWrapper.assertNotNull(statusTask2, application);
        checkFieldValue(statusTask2, "NAME", "Sony Vegas", application);
        checkFieldValue(statusTask2, "version", "2", application);
        checkMethod(statusTask2, "setVersion", String.class);
    }

    @Test
    public void task3Test() throws Exception {
        Application application = Tasks.task3();
        AssertWrapper.assertNotNull(statusTask3, application);
        checkFieldValue(statusTask3, "NAME", "Git", application);
        checkFieldValue(statusTask3, "version", "3", application);
        checkMethod(statusTask3, "setVersion", int.class);
    }

    @Test
    public void task4Test() throws Exception {
        Application application = Tasks.task4();
        AssertWrapper.assertNotNull(statusTask4, application);
        checkFieldValue(statusTask4, "NAME", "Gradle", application);
        checkFieldValue(statusTask4, "version", "4", application);
        checkConstructor(statusTask4, String.class, String.class);
    }

    @Test
    public void task5Test() {
        int delta = 0;
        int expectedCount = 3;
        int actualCount = Tasks.task5();
        AssertWrapper.assertEquals(statusTask5, expectedCount, actualCount, delta);
    }

    private void checkMethod(CheckingStatus status, String name, Class<? extends Object> aClass) throws NoSuchMethodException {
        Method setVersion = Application.class.getMethod(name, aClass);
        AssertWrapper.assertNotNull(status, setVersion);
        if (!Modifier.isPublic(setVersion.getModifiers())) {
            AssertWrapper.fail(status, "Method " + name + " is not public!");
        }
    }

    private void checkConstructor(CheckingStatus status, Class<? extends Object>... classes) throws Exception {
        Constructor<Application> constructor = Application.class.getDeclaredConstructor(classes);
        AssertWrapper.assertNotNull(status, "Constructor " + Arrays.toString(classes) + " is not found!", constructor);
        if (Modifier.isPrivate(constructor.getModifiers())) {
            AssertWrapper.fail(status, "Constructor " + Arrays.toString(classes) + " is private!");
        }
    }

    private void checkFieldValue(CheckingStatus status, String fieldName, String value, Application application) throws Exception {
        Field field = Application.class.getDeclaredField(fieldName);
        AssertWrapper.assertNotNull(status, field);

        if (!Modifier.isPrivate(field.getModifiers())) {
            AssertWrapper.fail(status, "Field " + fieldName + " is not private!");
        }
        field.setAccessible(true);
        AssertWrapper.assertEquals(status, value, field.get(application));
    }
}
