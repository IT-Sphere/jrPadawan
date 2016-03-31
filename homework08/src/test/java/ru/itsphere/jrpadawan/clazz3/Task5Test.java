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
public class Task5Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 5");
    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskToArrayTest1() {
        String[] actual = list.toArray();
        AssertWrapper.assertArrayEquals(status, new String[0], actual);
        AssertWrapper.assertEquals(status, 0, actual.length);
    }

    @Test
    public void taskToArrayTest2() {
        try {
            list.add("0");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
            list.add("6");
            String[] actual = list.toArray();
            AssertWrapper.assertArrayEquals(status, new String[]{"0", "1", "2", "3", "4", "5", "6"}, actual);
            AssertWrapper.assertEquals(status, 7, actual.length);
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }
}
