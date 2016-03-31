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
public class Task6Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 6");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskAddFirstTest1() {
        try {
            list.addFirst("0");
            AssertWrapper.assertEquals(status, "0", list.get(0));
            AssertWrapper.assertEquals(status, 1, list.getSize());
            AssertWrapper.assertEquals(status, false, list.isEmpty());
            AssertWrapper.assertEquals(status, "0 ", list.toString());
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }

    @Test
    public void taskAddFirstTest2() {
        try {
            list.add("");
            list.add("");
            list.add("");
            list.addFirst("0");
            list.addFirst("1");
            list.addFirst("2");
            AssertWrapper.assertEquals(status, "2", list.get(0));
            AssertWrapper.assertEquals(status, "1", list.get(1));
            AssertWrapper.assertEquals(status, "0", list.get(2));
            AssertWrapper.assertEquals(status, "", list.get(3));
            AssertWrapper.assertEquals(status, "", list.get(4));
            AssertWrapper.assertEquals(status, "", list.get(5));
            AssertWrapper.assertEquals(status, 6, list.getSize());
            AssertWrapper.assertEquals(status, false, list.isEmpty());
            AssertWrapper.assertEquals(status, "2 1 0    ", list.toString());
        } catch (Exception e) {
            AssertWrapper.fail(status);
        }
    }
}
