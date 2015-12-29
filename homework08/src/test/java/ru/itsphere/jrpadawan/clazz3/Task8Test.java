package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task8Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskReverseTest1() {
        list.reverse();
        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals(true, list.isEmpty());
        Assert.assertEquals("", list.toString());
    }

    @Test
    public void taskReverseTest2() {
        list.add("0");
        list.add("0");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("0");
        StringLinkedList reverse = list.reverse();
        Assert.assertEquals("0", reverse.get(0));
        Assert.assertEquals("2", reverse.get(1));
        Assert.assertEquals("1", reverse.get(2));
        Assert.assertEquals(9, reverse.getSize());
        Assert.assertEquals(false, reverse.isEmpty());
        Assert.assertEquals("0 2 1 2 2 1 1 0 0 ", reverse.toString());

        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals("0", list.get(1));
        Assert.assertEquals("1", list.get(2));
        Assert.assertEquals(9, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 0 1 1 2 2 1 2 0 ", list.toString());
    }
}
