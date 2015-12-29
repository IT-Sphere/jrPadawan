package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task7Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskDistinctTest1() {
        list.distinct();
        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals(true, list.isEmpty());
        Assert.assertEquals("", list.toString());
    }

    @Test
    public void taskDistinctTest2() {
        list.add("0");
        list.add("0");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("0");
        StringLinkedList distinct = list.distinct();
        Assert.assertEquals("0", distinct.get(0));
        Assert.assertEquals("1", distinct.get(1));
        Assert.assertEquals("2", distinct.get(2));
        Assert.assertEquals(3, distinct.getSize());
        Assert.assertEquals(false, distinct.isEmpty());
        Assert.assertEquals("0 1 2 ", distinct.toString());

        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals("0", list.get(1));
        Assert.assertEquals("1", list.get(2));
        Assert.assertEquals(9, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 0 1 1 2 2 1 2 0 ", list.toString());
    }
}
