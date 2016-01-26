package ru.itsphere.jrpadawan.clazz;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 */

    class PersonUsage {
        // Минимальный рост
        static final int MIN_HEIGHT = 140;
        // Максимальный возраст
        static final int MAX_AGE = 27;



        Object createPerson() {

            Person Kornholio = new Person(120, 16);
            return Kornholio;
        }


        Object createSuitablePerson() {

            Person Kornholio = new Person(150, 18);
            return Kornholio;
        }


        Object createUnsuitablePerson() {

            Person Kornholio = new Person(130, 28);
            return Kornholio;
        }
    }