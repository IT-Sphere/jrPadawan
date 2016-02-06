package ru.itsphere.jrpadawan.inheritance;

public class Main {
    public static void main(String[] args) {
        // создаем несколько пользователей
        User sasha = new User("Sasha");
        User masha = new User("Masha");
        User pasha = new User("Pasha");
        User dasha = new User("Dasha");

        // создаем новый канал и добавляем подписчиков
        YouTubeChannel channel100500 = new YouTubeChannel();
        channel100500.addSubscriber(sasha);
        channel100500.addSubscriber(masha);
        channel100500.addSubscriber(pasha);
        channel100500.addSubscriber(dasha);

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

        // публикуем новое видео на канале
        System.out.println("--- new video from TIX ---");
        channelThisIsHorosho.publishNewVideo("'new tix video 1'");
        System.out.println();

        System.out.println("--- new video from TIX ---");
        channelThisIsHorosho.publishNewVideo("'new tix video 2'");
        System.out.println();
    }
}
