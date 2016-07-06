package ru.itsphere.jrpadawan.interfacies;

/**
 * Класс пользователь. Через метод update получает информацию от каналов, на которые подписаны.
 */
public class User implements Observer {

    /**
     * Статический счетчик созданных пользователей.
     * Используется для присвоения уникальных идентификатором вновь созданым пользователям.
     */
    private static int userCounter = 0;

    /**
     * Имя пользователя.
     */
    private final String name;
    /**
     * Идентификатор пользователя.
     */
    private int id = 0;

    /**
     * Конструктор принимающий имя и генерирующий новый идентификатор пользователю.
     *
     * @param name
     */
    public User(String name) {
        this.name = name;
        this.id = userCounter;
        userCounter++;
    }

    /**
     * Метод, через который приходят уведомления пользователю. Его вызывают каналы и передают некую информацию.
     *
     * @param data - любая информация
     */
    public void update(Object data) {
        System.out.println(this + " has watched this video " + data);
    }

    /**
     * Переопределен для более красивого вывода в консоль объекта класса пользователя.
     */
    @Override
    public String toString() {
        return "User-" + id + " " + name;
    }
}
