package main.java.ru.itsphere.jrpadawan.inheritance;

/**
 * Created by Jooble on 21.02.2016.
 */
public class Snake extends Creeper {
        public Snake(String name) {
            // Вызываем унаследованный метод setName из класса Animal.
            // И указываем имя.
            setName(name);
            // Вызываем унаследованный метод setSpeed из класса Animal.
            // И указываем скорость.
            setSpeed(3.1);
            // Вызываем унаследованный метод setSound из класса LandAnimals.
            setSound("sh");
        }
}


