package ru.itsphere.jrpadawan.clazz3;

/**
 * Пример того, как можно использовать класс StringLinkedList.
 * <p>
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ListUsage {

    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        list.add("Sasha");
        list.add("Masha");
        list.add("Pasha");

        System.out.println(list.get(0)); // Sasha
        System.out.println(list.get(1)); // Masha
        System.out.println(list.get(2)); // Pasha

        System.out.println(list.getSize()); // 3
        System.out.println(list.isEmpty()); // false

        list.remove("Masha");
        System.out.println(list); // Sasha Pasha
    }
}
