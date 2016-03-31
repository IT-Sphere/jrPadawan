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
public class Task3Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 3");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void taskIndexOfTest1() {
        int i = list.indexOf("");
        AssertWrapper.assertEquals(status, -1, i);
        AssertWrapper.assertEquals(status, 0, list.getSize());
        AssertWrapper.assertEquals(status, true, list.isEmpty());
        AssertWrapper.assertEquals(status, "", list.toString());
    }

    @Test
    public void taskIndexOfTest2() {
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("1");
        int i = list.indexOf("0");
        AssertWrapper.assertEquals(status, 0, i);
        i = list.indexOf("1");
        AssertWrapper.assertEquals(status, 1, i);
        i = list.indexOf("2");
        AssertWrapper.assertEquals(status, 2, i);
        i = list.indexOf("3");
        AssertWrapper.assertEquals(status, -1, i);
        AssertWrapper.assertEquals(status, 4, list.getSize());
        AssertWrapper.assertEquals(status, false, list.isEmpty());
        AssertWrapper.assertEquals(status, "0 1 2 1 ", list.toString());
    }
}
