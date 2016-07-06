package ru.itsphere.jrpadawan.interfacies;

/**
 * Класс бот. Через метод update получает информацию от каналов, на которые подписаны.
 */
public class Bot extends User implements Observer {

    /**
     * Статический счетчик созданных ботов.
     * Используется для присвоения уникальных идентификатором вновь созданым ботам.
     */
    private static int botCounter = 0;

    /**
     * Идентификатор бота.
     */
    private int id = 0;

    /**
     * Конструктор принимающий имя и генерирующий новый идентификатор пользователю.
     */
    public Bot() {
        super("Bots");
        this.id = botCounter;
        botCounter++;
    }

    /**
     * Переопределен для более красивого вывода в консоль объекта класса пользователя.
     */
    @Override
    public String toString() {
        return "Bot-" + id;
    }

    @Override
    public void update(Object data) {
        System.out.println(this + " Bot has watched this video " + data);
    }

}
