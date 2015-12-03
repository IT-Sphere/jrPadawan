package ru.itsphere.jrpadawan.array;

import org.junit.Test;
import org.junit.Assert;
import ru.itsphere.jrpadawan.string.Application;
import ru.itsphere.jrpadawan.string.Tasks;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class TasksTest {

    @Test
    public void task1Test() throws Exception {
        Application application = Tasks.task1();
        checkFieldValue("NAME", "Photoshop", application);
    }

    @Test
    public void task2Test() throws Exception {
        Application application = Tasks.task2();
        checkFieldValue("NAME", "Sony Vegas", application);
        checkFieldValue("version", "2", application);
        checkMethod("setVersion", String.class);
    }

    @Test
    public void task3Test() throws Exception {
        Application application = Tasks.task3();
        checkFieldValue("NAME", "Git", application);
        checkFieldValue("version", "3", application);
        checkMethod("setVersion", int.class);
    }

    @Test
    public void task4Test() throws Exception {
        Application application = Tasks.task4();
        checkFieldValue("NAME", "Gradle", application);
        checkFieldValue("version", "4", application);
        checkConstructor(String.class, String.class);
    }

    private void checkMethod(String name, Class<? extends Object> aClass) throws NoSuchMethodException {
        Method setVersion = Application.class.getMethod(name, aClass);
        Assert.assertNotNull(setVersion);
        if (!Modifier.isPublic(setVersion.getModifiers())) {
            Assert.fail("Method " + name + " is not public!");
        }
    }

    private void checkConstructor(Class<? extends Object>... classes) throws Exception {
        Constructor<Application> constructor = Application.class.getDeclaredConstructor(classes);
        Assert.assertNotNull("Constructor " + Arrays.toString(classes) + " is not found!", constructor);
        if (Modifier.isPrivate(constructor.getModifiers())) {
            Assert.fail("Constructor " + Arrays.toString(classes) + " is private!");
        }
    }

    private void checkFieldValue(String fieldName, String value, Application application) throws Exception {
        Field field = Application.class.getDeclaredField(fieldName);
        Assert.assertNotNull(field);

        if (!Modifier.isPrivate(field.getModifiers())) {
            Assert.fail("Field " + fieldName + " is not private!");
        }
        field.setAccessible(true);
        Assert.assertEquals(value, field.get(application));
    }
}
