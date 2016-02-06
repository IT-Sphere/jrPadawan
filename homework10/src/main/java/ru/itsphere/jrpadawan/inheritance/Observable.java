package ru.itsphere.jrpadawan.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Все, кто расширяет этот интерфейс, будут способны отправлять уведомления своим "подписчикам".
 */
public abstract class Observable {

    /**
     * Флаг, который сигнализирует о изменении состояния.
     */
    private boolean changed = false;

    /**
     * Список тех, кто заинтересован в получении уведомлении об изменении.
     */
    private List<User> subscribers = new ArrayList<>();

    /**
     * Метод "Подписывает" нового получателя уведомлений.
     *
     * @param subscriber
     */
    public void addSubscriber(User subscriber) {
        subscribers.add(subscriber);
    }

    /**
     * Метод уведомляет всех, кто "Подписался" на получение уведомлений.
     *
     * @param data
     */
    public void notifySubscribers(Object data) {
        if (changed) {
            for (User subscriber : subscribers) {
                subscriber.update(data);
            }
            changed = false;
        }
    }

    public void setChanged() {
        this.changed = true;
    }
}
