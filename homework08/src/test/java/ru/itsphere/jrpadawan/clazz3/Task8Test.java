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
public class Task8Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 8");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskReverseTest1() {
        list.reverse();
        AssertWrapper.assertEquals(status, 0, list.getSize());
        AssertWrapper.assertEquals(status, true, list.isEmpty());
        AssertWrapper.assertEquals(status, "", list.toString());
    }

    @Test
    public void taskReverseTest2() {
        try {
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
            AssertWrapper.assertEquals(status, "0", reverse.get(0));
            AssertWrapper.assertEquals(status, "2", reverse.get(1));
            AssertWrapper.assertEquals(status, "1", reverse.get(2));
            AssertWrapper.assertEquals(status, 9, reverse.getSize());
            AssertWrapper.assertEquals(status, false, reverse.isEmpty());
            AssertWrapper.assertEquals(status, "0 2 1 2 2 1 1 0 0 ", reverse.toString());

            AssertWrapper.assertEquals(status, "0", list.get(0));
            AssertWrapper.assertEquals(status, "0", list.get(1));
            AssertWrapper.assertEquals(status, "1", list.get(2));
            AssertWrapper.assertEquals(status, 9, list.getSize());
            AssertWrapper.assertEquals(status, false, list.isEmpty());
            AssertWrapper.assertEquals(status, "0 0 1 1 2 2 1 2 0 ", list.toString());
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }
}
