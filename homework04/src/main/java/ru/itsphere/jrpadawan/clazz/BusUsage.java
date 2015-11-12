package ru.itsphere.jrpadawan.clazz;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 */
public class BusUsage {

    /**
     * Задача 5
     * Дописать метод, который ИЗМЕНЯЕТ объект класса Bus.
     * Метод должен установить в объект bus скорость 220 и количество пасажиров 25.
     *
     * @param bus - автобус для изменения
     * @return объект класса Person
     */
    Bus changeBusSpeedAndPassengers(Bus bus) {
        bus.passengers = 25;
        bus.setSpeed(220);
        return bus;
    }
}
