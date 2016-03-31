package ru.itsphere.jrpadawan.clazz3;

import org.junit.Before;
import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;

import java.util.LinkedList;
import java.util.List;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class TestableListTest {
    private static CheckingStatus status = StringLinkedListTest.STATUS;

    private List<String> myList;
    private List<String> list;

    @Before
    public void setUp() {
        myList = new TestableList();
        list = new LinkedList<>();
    }

    @Test
    public void testList() {
        doActions(list);
        doActions(myList);

        AssertWrapper.assertEquals(status, list.isEmpty(), myList.isEmpty());
        AssertWrapper.assertEquals(status, list.size(), myList.size());

        AssertWrapper.assertEquals(status, list.contains("332"), myList.contains("332"));
        AssertWrapper.assertEquals(status, list.contains("6567"), myList.contains("6567"));
        AssertWrapper.assertEquals(status, list.contains("dssdfsfsd"), myList.contains("dssdfsfsd"));
        AssertWrapper.assertEquals(status, list.contains("332"), myList.contains("332"));

        AssertWrapper.assertEquals(status, list.get(2), myList.get(2));
        AssertWrapper.assertEquals(status, list.get(1), myList.get(1));
        AssertWrapper.assertEquals(status, list.get(4), myList.get(4));
        AssertWrapper.assertEquals(status, list.get(0), myList.get(0));
    }

    private void doActions(List<String> list) {
        list.add("");
        list.add("223");
        list.add("23");
        list.add("432");
        list.add("234");
        list.add("234");
        list.add("234");
        list.add("234");
        list.add("234");
        list.add("234");
        list.add("2342");
        list.add("6567");
        list.add("6567");
        list.add("6567");
        list.add("6567");
        list.add("32dg");
        list.add("45565");

        list.remove("343454");
        list.remove("234");
        list.remove("234");
        list.remove("234");
        list.remove("23552");
        list.remove("23552");

        list.set(5, "sdfsdf");
        list.set(5, "sdfsdf");
        list.set(5, "sdfsdf");

        list.add(3, "dsfsd");
        list.add(2, "dssdfsfsd");
        list.add(4, "dsfssdfd");
        list.add(0, "dsfsdfsd");
        list.add(3, "dssdfsdfsd");

        list.remove(3);
        list.remove(2);
        list.remove(2);
        list.remove(0);
        list.remove(3);
        list.remove(1);
    }
}
