package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task3Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskIndexOfTest1() {
        int i = list.indexOf("");
        Assert.assertEquals(-1, i);
        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals(true, list.isEmpty());
        Assert.assertEquals("", list.toString());
    }

    @Test
    public void taskIndexOfTest2() {
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("1");
        int i = list.indexOf("0");
        Assert.assertEquals(0, i);
        i = list.indexOf("1");
        Assert.assertEquals(1, i);
        i = list.indexOf("2");
        Assert.assertEquals(2, i);
        i = list.indexOf("3");
        Assert.assertEquals(-1, i);
        Assert.assertEquals(4, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 1 2 1 ", list.toString());
    }
}
