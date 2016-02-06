package ru.itsphere.jrpadawan.inheritance;

/**
 * Класс бот. Через метод update получает информацию от каналов, на которые подписаны.
 */
public class Bot {

    /**
     * Статический счетчик созданных ботов.
     * Используется для присвоения уникальных идентификатором вновь созданым ботам.
     */
    public static int userCounter = 0;

    /**
     * Идентификатор бота.
     */
    public int id = 0;

    /**
     * Конструктор принимающий имя и генерирующий новый идентификатор пользователю.
     */
    public Bot() {
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
        return "Bot-" + id;
    }
}
