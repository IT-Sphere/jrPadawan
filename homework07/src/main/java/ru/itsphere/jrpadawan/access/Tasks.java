package ru.itsphere.jrpadawan.access;

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
        new Application("App 1");
        new Application("App 2");
        new Application("App 3");
        return Application.getCreatedApplicationCount();
    }

    /**
     * Этот метод не меняйте. Допишите метод calculate класса FactorialUtils.
     * Метод calculate должен вычислять факториал рекурсивным методом.
     * Циклы использовать нельзя!
     *
     * @return факториал числа number
     */
    public static int task6(int number) {
        return FactorialUtils.calculate(number);
    }
}