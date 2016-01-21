package ru.itsphere.jrpadawan.inheritance;

/**
 * Конкретный класс "Медведь".
 */
public class Bear extends LandAnimal {
    /**
     * Создаем экземпляр этого класса и задаем имя.
     *
     * @param name - кличка животного.
     */
    public Bear(String name) {
        // Вызываем унаследованный метод setName из класса Animal.
        // И указываем имя.
        setName(name);
        // Вызываем унаследованный метод setSpeed из класса Animal.
        // И указываем скорость.
        setSpeed(13.8);
        // Вызываем унаследованный метод setSound из класса LandAnimal.
        setSound("opilki");
    }
}
