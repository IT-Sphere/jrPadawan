package ru.itsphere.jrpadawan.clazz;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 * <p>
 * Задача 1:
 * 1. Создать класс Person.
 * 2. Объявить в нем два числовых (int) поля height (рост) и age (возраст).
 * 3. Объявить конструктор без параметров. Он должен быть пустым (ничего не делать).
 * 4. Объявить конструктор принимающий 2 числовых (int) параметра.
 * Первый это рост, а второй возраст. Этот конструктор должен соответственно
 * инитиализировать внутренние поля класса Person.
 * 5. Объявить метод isKid без параметров. Этот метод должен проверять, является ли
 * объект данного класса ребенком. Ребенок - это тот, кто младше 18 лет.
 * Он должен возвращать значение типа boolean.
 * 6. Объявить метод isOlder принимающий параметр возраст. Этот метод должен проверять,
 * является ли объект данного класса старше того значения, которое пришло в качестве парамметра.
 * Он должен возвращать значение типа boolean.
 * 7. Объявить метод isHigher принимающий параметр рост. Этот метод должен проверять, является ли
 * объект данного класса выше того значения, которое пришло в качестве парамметра.
 * Он должен возвращать значение типа boolean.
 */
class Person {
    int height;
    int age;

    Person() {
    }

    Person(int height, int age) {
        this.height = height;
        this.age = age;
    }

    boolean isKid() {
        return age < 18;
    }

    boolean isOlder(int age) {
        return this.age > age;
    }

    boolean isHigher(int height) {
        return this.height > height;
    }
}
