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
public class Task9Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 9");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskCopyConstructorTest1() {
        StringLinkedList newList = new StringLinkedList(list);
        AssertWrapper.assertEquals(status, 0, newList.getSize());
        AssertWrapper.assertEquals(status, true, newList.isEmpty());
        AssertWrapper.assertEquals(status, "", newList.toString());

        AssertWrapper.assertEquals(status, 0, list.getSize());
        AssertWrapper.assertEquals(status, true, list.isEmpty());
        AssertWrapper.assertEquals(status, "", list.toString());
    }

    @Test
    public void taskCopyConstructorTest2() {
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
            StringLinkedList newList = new StringLinkedList(list);
            AssertWrapper.assertEquals(status, "0", newList.get(0));
            AssertWrapper.assertEquals(status, "0", newList.get(1));
            AssertWrapper.assertEquals(status, "1", newList.get(2));
            AssertWrapper.assertEquals(status, 9, newList.getSize());
            AssertWrapper.assertEquals(status, false, newList.isEmpty());
            AssertWrapper.assertEquals(status, "0 0 1 1 2 2 1 2 0 ", newList.toString());

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
