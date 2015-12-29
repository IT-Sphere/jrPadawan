package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task6Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskAddFirstTest1() {
        list.addFirst("0");
        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals(1, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 ", list.toString());
    }

    @Test
    public void taskAddFirstTest2() {
        list.add("");
        list.add("");
        list.add("");
        list.addFirst("0");
        list.addFirst("1");
        list.addFirst("2");
        Assert.assertEquals("2", list.get(0));
        Assert.assertEquals("1", list.get(1));
        Assert.assertEquals("0", list.get(2));
        Assert.assertEquals("", list.get(3));
        Assert.assertEquals("", list.get(4));
        Assert.assertEquals("", list.get(5));
        Assert.assertEquals(6, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("2 1 0    ", list.toString());
    }
}
