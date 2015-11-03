package ru.itsphere.jrpadawan.clazz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class UserUsageTest {

    @Test
    public void createUserTest() {
        UserUsage userUsage = new UserUsage();
        Object user = userUsage.createUser();
        Assert.assertNotNull(user);
        Assert.assertEquals(TestConstants.USER_CLASS, user.getClass().getName());
    }

    @Test
    public void createSuitableUserTest() throws Exception {
        UserUsage userUsage = new UserUsage();
        Object user = userUsage.createSuitableUser();
        Assert.assertNotNull(user);
        Assert.assertEquals(TestConstants.USER_CLASS, user.getClass().getName());

        Field fieldAge = user.getClass().getDeclaredField(TestConstants.FIELD_AGE);
        int age = (Integer) fieldAge.get(user);
        Assert.assertTrue(UserUsage.MAX_AGE > age);

        Field fieldHeight = user.getClass().getDeclaredField(TestConstants.FIELD_HEIGHT);
        int height = (Integer) fieldHeight.get(user);
        Assert.assertTrue(UserUsage.MIN_HEIGHT < height);
    }

    @Test
    public void createUnsuitableUserTest() throws Exception {
        UserUsage userUsage = new UserUsage();
        Object user = userUsage.createUnsuitableUser();
        Assert.assertNotNull(user);
        Assert.assertEquals(TestConstants.USER_CLASS, user.getClass().getName());

        Field fieldAge = user.getClass().getDeclaredField(TestConstants.FIELD_AGE);
        int age = (Integer) fieldAge.get(user);

        Field fieldHeight = user.getClass().getDeclaredField(TestConstants.FIELD_HEIGHT);
        int height = (Integer) fieldHeight.get(user);

        if (age <= UserUsage.MAX_AGE && height >= UserUsage.MIN_HEIGHT) {
            Assert.fail();
        }
    }

}
