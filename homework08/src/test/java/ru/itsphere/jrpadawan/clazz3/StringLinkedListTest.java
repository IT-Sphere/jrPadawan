package ru.itsphere.jrpadawan.clazz3;

import org.junit.Before;
import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

import java.util.LinkedList;
import java.util.List;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class StringLinkedListTest {
    public static CheckingStatus STATUS = new TaskCheckingStatus("There is an error in logic of StringLinkedList class");

    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedList();
    }

    @Test
    public void testSizeInEmptyList() {
        int expected = 0;
        int actual = list.getSize();
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testSizeInListWithOneText() {
        list.add("text");
        int expected = 1;
        int actual = list.getSize();
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testSizeInListWithTwoText() {
        list.add("text");
        list.add("text");
        int expected = 2;
        int actual = list.getSize();
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testIsEmptyInEmptyList() {
        boolean expected = true;
        boolean actual = list.isEmpty();
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testIsEmptyInListWithOneText() {
        list.add("text");
        boolean expected = false;
        boolean actual = list.isEmpty();
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testAddInEmptyList() {
        String expected = "text";
        list.add(expected);
        String actual = list.get(0);
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testAddInListWithOneText() {
        list.add("first");
        String expected = "text";
        list.add(expected);
        String actual = list.get(1);
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testAddWithIndex0InEmptyList() {
        try {
            list.add(0, "text");
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testAddWithIndex1InEmptyList() {
        try {
            list.add(1, "text");
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testAddWithIndexMinus1InEmptyList() {
        try {
            list.add(-1, "text");
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testAddByIndex0InListWithOneText() {
        String expectedMoved = "first";
        list.add(expectedMoved);
        String expected = "text";
        list.add(0, expected);
        String actual = list.get(0);
        AssertWrapper.assertEquals(STATUS, expected, actual);

        String actualMoved = list.get(1);
        AssertWrapper.assertEquals(STATUS, expectedMoved, actualMoved);
    }

    @Test
    public void testAddByIndex0InListWithTwoText() {
        list.add("first");
        String expectedMoved = "second";
        list.add(expectedMoved);
        String expected = "text";
        list.add(1, expected);
        String actual = list.get(1);
        AssertWrapper.assertEquals(STATUS, expected, actual);

        String actualMoved = list.get(2);
        AssertWrapper.assertEquals(STATUS, expectedMoved, actualMoved);
    }

    @Test
    public void testGetByIndex0InListEmpty() {
        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testGetByIndex1InListEmpty() {
        try {
            list.get(1);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testGetByIndexMinus1InListEmpty() {
        try {
            list.get(-1);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testGetByIndex0InListWithOneText() {
        String expected = "text";
        list.add(expected);
        String actual = list.get(0);
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testGetByIndex1InListWithOneText() {
        try {
            list.add("text");
            list.get(1);

        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testContainsInEmptyList() {
        boolean expected = false;
        boolean actual = list.contains("text");
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testContainsInListWithOneText() {
        list.add("");
        boolean expected = false;
        boolean actual = list.contains("text");
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testContainsInListWithOneSameText() {
        list.add("text");
        boolean expected = true;
        boolean actual = list.contains("text");
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testContainsInListWithTwoSameText() {
        list.add("");
        list.add("text");
        boolean expected = true;
        boolean actual = list.contains("text");
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetInEmptyList() {
        list.set(0, "text");
    }

    @Test
    public void testSetInListWithOneText() {
        list.add("old text");
        String expected = "new text";
        list.set(0, expected);
        String actual = list.get(0);
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testRemoveByIndexInEmptyList() {
        try {
            list.remove(0);
        } catch (IndexOutOfBoundsException e) {
        } catch (Throwable e) {
            AssertWrapper.fail(STATUS);
        }
    }

    @Test
    public void testRemoveByIndexInListWithOneText() {
        String text = "text";
        list.add(text);
        list.remove(0);
        boolean expected = false;
        boolean actual = list.contains(text);
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testRemoveByIndexInListWithTwoEqualsText() {
        String text = "text";
        list.add(text);
        list.add(text);
        list.remove(0);
        boolean expected = true;
        boolean actual = list.contains(text);
        AssertWrapper.assertEquals(STATUS, expected, actual);
    }

    @Test
    public void testRemoveInEmptyList() {
        list.remove("text");
    }

    @Test
    public void testRemoveInListWithOneText() {
        String text = "text";
        list.add(text);
        list.remove(text);
        boolean expected = false;
        boolean actual = list.contains(text);
        AssertWrapper.assertEquals(STATUS, expected, actual);

        int expectedSize = 0;
        int actualSize = list.getSize();
        AssertWrapper.assertEquals(STATUS, expectedSize, actualSize);
    }

    @Test
    public void testRemoveInListWithTwoEqualsText() {
        String text = "text";
        list.add(text);
        list.add(text);
        list.remove(text);
        boolean expected = true;
        boolean actual = list.contains(text);
        AssertWrapper.assertEquals(STATUS, expected, actual);

        int expectedSize = 1;
        int actualSize = list.getSize();
        AssertWrapper.assertEquals(STATUS, expectedSize, actualSize);
    }

    @Test
    public void test() {
        StringLinkedList myList = new StringLinkedList();

        List<String> list = new LinkedList<>();

    }
}
