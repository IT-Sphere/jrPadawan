package ru.itsphere.jrpadawan.inheritance;

/**
 * Класс YouTube канал. Публикует видео и уведомляет пользователей.
 */
public class YouTubeChannel extends Observable {

    /**
     * Публикуем новое видео
     *
     * @param videoName
     */
    public void publishNewVideo(String videoName) {
        this.setChanged();
        notifySubscribers(videoName);
    }
}
