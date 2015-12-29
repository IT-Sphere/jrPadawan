package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task5Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskToArrayTest1() {
        String[] actual = list.toArray();
        Assert.assertArrayEquals(new String[0], actual);
        Assert.assertEquals(0, actual.length);
    }

    @Test
    public void taskToArrayTest2() {
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        String[] actual = list.toArray();
        Assert.assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6"}, actual);
        Assert.assertEquals(7, actual.length);
    }
}
