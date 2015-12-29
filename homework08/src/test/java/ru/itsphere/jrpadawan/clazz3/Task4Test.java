package ru.itsphere.jrpadawan.clazz3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task4Test {

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void taskSubListTest1() {
        list.subList(0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void taskSubListTest2() {
        list.subList(1, 0);
    }

    @Test
    public void taskSubListTest3() {
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        StringLinkedList subList1 = list.subList(1, 1);
        Assert.assertEquals("1", subList1.get(0));
        Assert.assertEquals(1, subList1.getSize());
        Assert.assertEquals(false, subList1.isEmpty());
        Assert.assertEquals("1 ", subList1.toString());

        StringLinkedList subList2 = list.subList(0, 6);
        Assert.assertEquals("0", subList2.get(0));
        Assert.assertEquals("6", subList2.get(6));
        Assert.assertEquals(7, subList2.getSize());
        Assert.assertEquals(false, subList2.isEmpty());
        Assert.assertEquals("0 1 2 3 4 5 6 ", subList2.toString());

        StringLinkedList subList3 = list.subList(5, 6);
        Assert.assertEquals("5", subList3.get(0));
        Assert.assertEquals("6", subList3.get(1));
        Assert.assertEquals(2, subList3.getSize());
        Assert.assertEquals(false, subList3.isEmpty());
        Assert.assertEquals("5 6 ", subList3.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void taskSubListTest4() {
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.subList(1, 7);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void taskSubListTest5() {
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.subList(-1, 3);
    }
}
