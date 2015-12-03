package ru.itsphere.jrpadawan.array;

import org.junit.Test;
import org.junit.Assert;
import ru.itsphere.jrpadawan.string.Application;
import ru.itsphere.jrpadawan.string.Tasks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TasksTest {

    @Test
    public void task1Test() throws Exception {
        Application application = Tasks.task1();
        checkNameField("Photoshop", application);
    }

    private void checkNameField(String expectedName, Application application) throws Exception {
        Field name = Application.class.getDeclaredField("NAME");
        Assert.assertNotNull(name);

        if (!Modifier.isPrivate(name.getModifiers())) {
            Assert.fail("Field NAME is not private!");
        }
        name.setAccessible(true);
        Assert.assertEquals(expectedName, name.get(application));
    }

    @Test
    public void task2Test() throws Exception {
        Application application = Tasks.task2();
        checkNameField("Sony Vegas", application);
        checkFieldValue("version", "2", application);
        checkMethod("setVersion", String.class);
    }

    @Test
    public void task3Test() throws Exception {
        Application application = Tasks.task3();
        checkNameField("Sony Vegas", application);
        checkFieldValue("version", "3", application);
        checkMethod("setVersion", int.class);
    }

    private void checkMethod(String name, Class<? extends Object> aClass) throws NoSuchMethodException {
        Method setVersion = Application.class.getMethod(name, aClass);
        Assert.assertNotNull(setVersion);
        if (!Modifier.isPublic(setVersion.getModifiers())) {
            Assert.fail("Method " + name + " is not public!");
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
