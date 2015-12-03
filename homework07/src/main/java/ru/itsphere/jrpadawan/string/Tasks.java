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
     * Создать и вернуть объект класса Application с именем "Git".
     * Перегрузить метод setVersion таким образом, чтобы он принимал значение типа int. Раскомментируйте код.
     * Для того, чтобы преобразовать int в String используйте метод String.valueOf(version).
     *
     * @return Application
     */
    public static Application task3() {
        Application application = new Application("Git");
        application.setVersion(3);
        return application;
    }

    /**
     * Создать и вернуть объект класса Application с именем "Gradle" и версией "4", но для этого нужно перегрузить конструктар
     * таким образом, чтобы название и версия передавались через новый конструктор. Конструктор должен версию принимать ввиде строки.
     * Методы из прошлого задания использовать нельзя!
     *
     * @return Application
     */
    public static Application task4() {
        Application application = new Application("Gradle", "4");
        return application;
    }

    /**
     * В этом методе создайте 3 объекта класса Application. (После строки Application.resetCreatedApplicationCount();)
     * Верните значение счетчика созданных объектов класса Application. Для этого создайте статический метод в классе
     * Application, который будет возвращать значение поля сreatedApplicationCount.
     * Назовите это метод getCreatedApplicationCount.
     *
     * @return значение счетчика созданых объектов класса Application
     */
    public static int task5() {
        Application.resetCreatedApplicationCount();
        // код выше не трогать!
        return Application.getCreatedApplicationCount();
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
