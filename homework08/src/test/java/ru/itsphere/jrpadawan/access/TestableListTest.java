package ru.itsphere.jrpadawan.access;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestableListTest {

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

        Assert.assertEquals(list.isEmpty(), myList.isEmpty());
        Assert.assertEquals(list.size(), myList.size());

        Assert.assertEquals(list.contains("332"), myList.contains("332"));
        Assert.assertEquals(list.contains("6567"), myList.contains("6567"));
        Assert.assertEquals(list.contains("dssdfsfsd"), myList.contains("dssdfsfsd"));
        Assert.assertEquals(list.contains("332"), myList.contains("332"));

        Assert.assertEquals(list.get(2), myList.get(2));
        Assert.assertEquals(list.get(1), myList.get(1));
        Assert.assertEquals(list.get(4), myList.get(4));
        Assert.assertEquals(list.get(0), myList.get(0));
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
