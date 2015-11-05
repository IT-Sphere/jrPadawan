package ru.itsphere.jrpadawan.clazz;

public class TestUtils {

    public static final boolean INITIALIZE = false;

    public static Class<?> getPersonClass() throws ClassNotFoundException {
        return Class.forName(TestConstants.PERSON_CLASS, INITIALIZE, ClassLoader.getSystemClassLoader());
    }



}
