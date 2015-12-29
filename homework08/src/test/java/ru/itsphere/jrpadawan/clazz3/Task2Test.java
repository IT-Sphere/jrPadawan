package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task2Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void taskAddAllWithIndexTest1() {
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(0, array);
    }

    @Test
    public void taskAddAllWithIndexTest2() {
        list.add("");
        list.add("");
        list.add("");
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(0, array);
        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals("1", list.get(1));
        Assert.assertEquals("2", list.get(2));
        Assert.assertEquals("", list.get(3));
        Assert.assertEquals("", list.get(4));
        Assert.assertEquals("", list.get(5));
        Assert.assertEquals(6, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("0 1 2    ", list.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void taskAddAllWithIndexTest3() {
        list.add("");
        list.add("");
        list.add("");
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(3, array);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void taskAddAllWithIndexTest4() {
        list.add("");
        list.add("");
        list.add("");
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(-1, array);
    }

    @Test
    public void taskAddAllWithIndexTest5() {
        list.add("");
        list.add("");
        list.add("");
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(2, array);
        Assert.assertEquals("", list.get(0));
        Assert.assertEquals("", list.get(1));
        Assert.assertEquals("0", list.get(2));
        Assert.assertEquals("1", list.get(3));
        Assert.assertEquals("2", list.get(4));
        Assert.assertEquals("", list.get(5));
        Assert.assertEquals(6, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals("  0 1 2  ", list.toString());
    }

    @Test
    public void taskAddAllWithIndexTest6() {
        list.add("");
        list.add("");
        list.add("");
        String[] array = new String[3];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        list.addAll(1, array);
        Assert.assertEquals("", list.get(0));
        Assert.assertEquals("0", list.get(1));
        Assert.assertEquals("1", list.get(2));
        Assert.assertEquals("2", list.get(3));
        Assert.assertEquals("", list.get(4));
        Assert.assertEquals("", list.get(5));
        Assert.assertEquals(6, list.getSize());
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals(" 0 1 2   ", list.toString());
    }
}
