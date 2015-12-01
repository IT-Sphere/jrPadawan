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

        Field version = Application.class.getDeclaredField("version");
        Assert.assertNotNull(version);

        if (!Modifier.isPrivate(version.getModifiers())) {
            Assert.fail("Field version is not private!");
        }
        version.setAccessible(true);
        Assert.assertEquals("2.0.12", version.get(application));

        Method setVersion = Application.class.getMethod("setVersion", String.class);
        Assert.assertNotNull(setVersion);
        if (!Modifier.isPublic(setVersion.getModifiers())) {
            Assert.fail("Method setVersion is not public!");
        }
    }
}
