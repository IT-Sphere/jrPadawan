package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task9Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskCopyConstructorTest1() {
        StringLinkedList newList = new StringLinkedList(list);
        Assert.assertEquals(0, newList.getSize());
        Assert.assertEquals(true, newList.isEmpty());
        Assert.assertEquals("", newList.toString());

        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals(true, list.isEmpty());
        Assert.assertEquals("", list.toString());
    }

    @Test
    public void taskCopyConstructorTest2() {
        list.add("0");
        list.add("0");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("0");
        StringLinkedList newList = new StringLinkedList(list);
        Assert.assertEquals("0", newList.get(0));
        Assert.assertEquals("0", newList.get(1));
        Assert.assertEquals("1", newList.get(2));
        Assert.assertEquals(9, newList.getSize());
        Assert.assertEquals(false, newList.isEmpty());
        Assert.assertEquals("0 0 1 1 2 2 1 2 0 ", newList.toString());

        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals("0", list.get(1));
        Assert.assertEquals("1", list.get(2));
        Assert.assertEquals(9, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 0 1 1 2 2 1 2 0 ", list.toString());
    }
}
