package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task1Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskAddAllTest1() {
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(array);
        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals("1", list.get(1));
        Assert.assertEquals("2", list.get(2));
        Assert.assertEquals(3, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 1 2 ", list.toString());
    }

    @Test
    public void taskAddAllTest2() {
        list.add("");
        list.add("");
        list.add("");
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(array);
        Assert.assertEquals("", list.get(0));
        Assert.assertEquals("", list.get(1));
        Assert.assertEquals("", list.get(2));
        Assert.assertEquals("0", list.get(3));
        Assert.assertEquals("1", list.get(4));
        Assert.assertEquals("2", list.get(5));
        Assert.assertEquals(6, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("   0 1 2 ", list.toString());
    }
}
