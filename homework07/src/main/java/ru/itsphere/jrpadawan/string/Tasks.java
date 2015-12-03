package ru.itsphere.jrpadawan.string;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * <p>
 * с. 200 - с. 212
 */
public class Tasks {
    /**
     * Создать и вернуть объект класса Application с именем "Photoshop".
     *
     * @return Application
     */
    public static Application task1() {
        return new Application("Photoshop");
    }

    /**
     * Создать и вернуть объект класса Application с именем "Sony Vegas".
     * Установите ему значение версии "2".
     * Допишите публичный метод setVersion в класс Application.
     *
     * @return Application
     */
    public static Application task2() {
        Application application = new Application("Sony Vegas");
        application.setVersion("2");
        return application;
    }

    /**
     * Создать и вернуть объект класса Application с именем "Sony Vegas".
     * Перегрузите метод setVersion таким образом, чтобы он принимал значение типа int. Раскомментируйте код.
     * Для того, чтобы преобразовать int в String используйте метод String.valueOf(version).
     *
     * @return Application
     */
    public static Application task3() {
        Application application = new Application("Sony Vegas");
        application.setVersion(3);
        return application;
    }

    /**
     * Создать и вернуть объект класса Application с именем "Sony Vegas".
     * Перегрузите метод setVersion таким образом, чтобы он принимал значение типа int. Раскомментируйте код.
     * Для того, чтобы преобразовать int в String используйте метод String.valueOf(version).
     *
     * @return Application
     */
    public static Application task4() {
        Application application = new Application("Sony Vegas");
        application.setVersion(3);
        return application;
    }
}

/*
   1) Спецификторы доступа
   2) Перегрузка методов/конструктора
   3) РЕкурсия
   4) static
   5) Вложения и внутреньие классы
   6) Аргументы переменной длинны


 */
