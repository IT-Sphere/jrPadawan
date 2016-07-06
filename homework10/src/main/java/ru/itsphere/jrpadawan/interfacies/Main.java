package ru.itsphere.jrpadawan.interfacies;

/**
 * Смотри описание задачи на форуме.
 */
public class Main {
    public static void main(String[] args) {
        // создаем несколько пользователей
        User sasha = new User("Sasha");
        User masha = new User("Masha");
        User pasha = new User("Pasha");
        User dasha = new User("Dasha");

        Bot bot1 = new Bot();
        Bot bot2 = new Bot();
        Bot bot3 = new Bot();

        // создаем новый канал и добавляем подписчиков
        YouTubeChannel channel100500 = new YouTubeChannel();
        channel100500.addSubscriber(sasha);
        channel100500.addSubscriber(masha);
        channel100500.addSubscriber(pasha);
        channel100500.addSubscriber(dasha);


        channel100500.addSubscriber(bot1);
        channel100500.addSubscriber(bot2);


        // публикуем новое видео на канале
        System.out.println("--- new video from +100500 ---");
        channel100500.publishNewVideo("'new +100500 video 1'");
        System.out.println();

        System.out.println("--- new video from +100500 ---");
        channel100500.publishNewVideo("'new +100500 video 2'");
        System.out.println();

        // создаем новый канал и добавляем подписчиков
        YouTubeChannel channelThisIsHorosho = new YouTubeChannel();
        channelThisIsHorosho.addSubscriber(sasha);
        channelThisIsHorosho.addSubscriber(masha);


        channelThisIsHorosho.addSubscriber(bot3);


        // публикуем новое видео на канале
        System.out.println("--- new video from TIX ---");
        channelThisIsHorosho.publishNewVideo("'new tix video 1'");
        System.out.println();

        System.out.println("--- new video from TIX ---");
        channelThisIsHorosho.publishNewVideo("'new tix video 2'");
        System.out.println();
    }
}
