package ru.itsphere.jrpadawan.clazz3;

import org.junit.Before;
import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task4Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 4");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskSubListTest1() {
        try {
            list.subList(0, 0);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskSubListTest2() {
        try {
            list.subList(1, 0);
        } catch (IllegalArgumentException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskSubListTest3() {
        try {
            list.add("0");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
            list.add("6");
            StringLinkedList subList1 = list.subList(1, 1);
            AssertWrapper.assertEquals(status, "1", subList1.get(0));
            AssertWrapper.assertEquals(status, 1, subList1.getSize());
            AssertWrapper.assertEquals(status, false, subList1.isEmpty());
            AssertWrapper.assertEquals(status, "1 ", subList1.toString());

            StringLinkedList subList2 = list.subList(0, 6);
            AssertWrapper.assertEquals(status, "0", subList2.get(0));
            AssertWrapper.assertEquals(status, "6", subList2.get(6));
            AssertWrapper.assertEquals(status, 7, subList2.getSize());
            AssertWrapper.assertEquals(status, false, subList2.isEmpty());
            AssertWrapper.assertEquals(status, "0 1 2 3 4 5 6 ", subList2.toString());

            StringLinkedList subList3 = list.subList(5, 6);
            AssertWrapper.assertEquals(status, "5", subList3.get(0));
            AssertWrapper.assertEquals(status, "6", subList3.get(1));
            AssertWrapper.assertEquals(status, 2, subList3.getSize());
            AssertWrapper.assertEquals(status, false, subList3.isEmpty());
            AssertWrapper.assertEquals(status, "5 6 ", subList3.toString());
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskSubListTest4() {
        try {
            list.add("0");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
            list.add("6");
            list.subList(1, 7);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskSubListTest5() {
        try {
            list.add("0");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
            list.add("6");
            list.subList(-1, 3);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
    }
}
