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
public class Task2Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 2");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskAddAllWithIndexTest1() {
        try {
            String[] array = new String[3];
            array[0] = "0";
            array[1] = "1";
            array[2] = "2";
            list.add(0, array);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
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
        list.add(0, array);
        AssertWrapper.assertEquals(status, "0", list.get(0));
        AssertWrapper.assertEquals(status, "1", list.get(1));
        AssertWrapper.assertEquals(status, "2", list.get(2));
        AssertWrapper.assertEquals(status, "", list.get(3));
        AssertWrapper.assertEquals(status, "", list.get(4));
        AssertWrapper.assertEquals(status, "", list.get(5));
        AssertWrapper.assertEquals(status, 6, list.getSize());
        AssertWrapper.assertEquals(status, false, list.isEmpty());
        AssertWrapper.assertEquals(status, "0 1 2    ", list.toString());
    }

    @Test
    public void taskAddAllWithIndexTest3() {
        try {
            list.add("");
            list.add("");
            list.add("");
            String[] array = new String[3];
            array[0] = "0";
            array[1] = "1";
            array[2] = "2";
            list.add(3, array);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskAddAllWithIndexTest4() {
        try {
            list.add("");
            list.add("");
            list.add("");
            String[] array = new String[3];
            array[0] = "0";
            array[1] = "1";
            array[2] = "2";
            list.add(-1, array);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskAddAllWithIndexTest5() {
        try {

            list.add("");
            list.add("");
            list.add("");
            String[] array = new String[3];
            array[0] = "0";
            array[1] = "1";
            array[2] = "2";
            list.add(2, array);
            AssertWrapper.assertEquals(status, "", list.get(0));
            AssertWrapper.assertEquals(status, "", list.get(1));
            AssertWrapper.assertEquals(status, "0", list.get(2));
            AssertWrapper.assertEquals(status, "1", list.get(3));
            AssertWrapper.assertEquals(status, "2", list.get(4));
            AssertWrapper.assertEquals(status, "", list.get(5));
            AssertWrapper.assertEquals(status, 6, list.getSize());
            AssertWrapper.assertEquals(status, false, list.isEmpty());
            AssertWrapper.assertEquals(status, "  0 1 2  ", list.toString());
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskAddAllWithIndexTest6() {
        try {
            list.add("");
            list.add("");
            list.add("");
            String[] array = new String[3];
            array[0] = "0";
            array[1] = "1";
            array[2] = "2";
            list.add(1, array);
            AssertWrapper.assertEquals(status, "", list.get(0));
            AssertWrapper.assertEquals(status, "0", list.get(1));
            AssertWrapper.assertEquals(status, "1", list.get(2));
            AssertWrapper.assertEquals(status, "2", list.get(3));
            AssertWrapper.assertEquals(status, "", list.get(4));
            AssertWrapper.assertEquals(status, "", list.get(5));
            AssertWrapper.assertEquals(status, 6, list.getSize());
            AssertWrapper.assertEquals(status, false, list.isEmpty());
            AssertWrapper.assertEquals(status, " 0 1 2   ", list.toString());
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }
}
