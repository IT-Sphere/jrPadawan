package ru.itsphere.jrpadawan.access;

/**
 * Класс представляет собой собственную реализацию двусвязного списка.
 * <p>
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class StringLinkedList {
    private Entry first;
    private Entry last;
    private int size;

    /**
     * Возвращает размер списка.
     */
    public int getSize() {
        return size;
    }

    /**
     * Проверяет пустой ли список.
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Добавляет строку в конец списка.
     */
    public void add(String value) {
        // Первым шагом мы должны понять список на данный момент пуст или нет.
        // Для этого используем метод isEmpty.
        if (isEmpty()) {
            // Если он пуст, то в объекте класса StringLinkedList поля last и first ссылаются на null.
            // Нам нужно создать новый объект класса Entry, который не ссылается ни на кого (т.к. он единственный).
            // Когда объект есть, просто сделаем так, чтобы поля last и first ссылались на этот объект.
            last = first = new Entry(null, value, null);
            // Осталось просто увеличить на единицу счетчик size.
            size++;
        } else {
            // Если список НЕ пуст, то просто добавляем новый элемент в конец.
            addLast(value);
        }
    }

    /**
     * Добавляет новую строку, но вставляет ее под указаным индексом.
     * Не заменяет!
     */
    public void add(int index, String value) {
        // Находим элемент, который в данный момент находится под этим индексом index.
        Entry current = getEntry(index);
        // Берем у него ссылку на предыдущий элемент с индексом index - 1.
        Entry previous = current.getPrevious();
        // Создаем новый объект и делаем так, чтобы он ссылался на обект с
        // интексоми index - 1 и index (находился между ними).
        Entry newEntry = new Entry(previous, value, current);
        // Проверяем, тот ли это случай, когда нам нужно добавить элемент на место первого в списке.
        if (index == 0) {
            // Если так, то новый элемент должен стать первым.
            first = newEntry;
        } else {
            // Если нет, то просто элемент с индексом index - 1 должен ссылаться на новый объект как на следующий.
            previous.setNext(newEntry);
        }
        // Текущий элемент с индексом index должен ссылаться на новый как на предыдущий.
        current.setPrevious(newEntry);
        // Увеличиваем счетчик на единицу.
        size++;
    }

    /**
     * Возвращает значение находящееся в списке под указанным индексом.
     */
    public String get(int index) {
        // Получаем объект по индексу и берем у него значение.
        return getEntry(index).getValue();
    }

    /**
     * Проверяем содержится ли указанная строка в списке.
     */
    public boolean contains(String value) {
        // Пытаемся получить объект по значениею.
        // Если возвращается null, то возвращаем false.
        // Если возвращается не null, то возвращаем true.
        return getEntry(value) != null;
    }

    /**
     * Заменяет старое значение строки на новое (под указанным индексом).
     */
    public void set(int index, String value) {
        // Получаем объект по индексу и заменяем в нем значение.
        getEntry(index).setValue(value);
    }

    /**
     * Удаляем элемент списка по индексу.
     */
    public void remove(int index) {
        // Получаем объект по индексу и удаляем объект.
        removeEntry(getEntry(index));
    }

    /**
     * Находит и удаляет первое найденное значение из списка.
     */
    public void remove(String value) {
        // Находим элемент по значению.
        Entry entry = getEntry(value);
        if (entry != null) {
            // Если найден, то удаляем.
            removeEntry(entry);
        }
    }

    /**
     * Трансформирует список в массив строк.
     */
    public String[] toArray() {
        // Сначала создаем массив.
        String[] array = new String[size];
        // Создаем счетчик.
        int counter = 0;
        // Создаем цикл для последовательного перебора строк в списке.
        for (Entry entry = first; entry != null; entry = entry.getNext()) {
            // Заносим каждую строку в массив на свое место.
            array[counter] = entry.getValue();
            // Увеличим счетчик.
            counter++;
        }
        // Возвращаем массив.
        return array;
    }

    /**
     * Добавляет строку в конец списка.
     */
    private void addLast(String value) {
        // Создаем новый элемент. Используя конструктор класса Entry,
        // который принимает первым параметром ссылку на предыдущий элемент,
        // а третьим ссылку на следующий элемент (null т.к. добавляем в конец).
        // Вторым параметром он принимает само значение.
        // Получается, что объект newLast ссылается на бывший последний элемент.
        Entry newLast = new Entry(last, value, null);
        // Далее мы берем пока еще последний элемент и его ссылку на null (следующий)
        // переводим на новый последний элемент.
        // В итоге last и newLast ссылаются друг на друга.
        last.setNext(newLast);
        // Теперь нужно переписать поле last на новый последний элемент.
        last = newLast;
        // По тому, что добавили новый элемент увеличили счетчик на единицу.
        size++;
    }

    /**
     * Удаляет элемент из списка.
     */
    private void removeEntry(Entry entry) {
        // Получаем ссылку на элемент, который находится перед тем, который нужно удалить.
        Entry previous = entry.getPrevious();
        // Получаем ссылку на элемент, который находится после тем, который нужно удалить.
        Entry next = entry.getNext();
        if (previous == null) {
            // Это значит, что удаляем первый элемент списка.
            // Значит первым должен стать следующий за удаляемым.
            first = next;
        } else {
            // В противном случае просто сделаем так, чтобы прошлый (перед удаляемым)
            // ссылался на следующий (за удаляемым).
            previous.setNext(next);
        }
        if (next == null) {
            // Это значит, что удаляем последний элемент списка.
            // Значит последним должен стать элемент находящийся до удаленного.
            last = previous;
        } else {
            // В противном случае просто сделаем так, чтобы следующий (за удаляемым)
            // ссылался на прошлый (перед удаляемым).
            next.setPrevious(previous);
        }
        // Уменьшис счетчик.
        size--;
    }

    /**
     * Находим элемент списка по значению.
     */
    private Entry getEntry(String value) {
        // Для начала создадим цикл, который будет последовательно проходить по цепочке объектов.
        // Начиная с первого элемента Entry entry = first.
        // Затем у него мы берем ссылку на следующий элемент и переходим на него entry = entry.getNext().
        // И так до тех пор пока не перейдем по ссылке на нулевой объект entry != null.
        for (Entry entry = first; entry != null; entry = entry.getNext()) {
            // В цикле последовательно будем проверять каждый объект на то, содержит ли он нужное нам значение.
            if (entry.getValue().equals(value)) {
                // Если да, то возвращаем этот объект и завершаем цикл, если нет, то продолжаем цикл.
                return entry;
            }
        }
        return null;
    }

    /**
     * Находим элемент списка по индекусу.
     */
    private Entry getEntry(int index) {
        checkIndex(index);
        Entry entry = first;
        for (int counter = 0; counter < index; counter++) {
            entry = entry.getNext();
        }
        return entry;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException(String.format("Element with number %s doesn't exist", index));
        }
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private class Entry {
        private Entry next;
        private Entry previous;
        private String value;

        public Entry(Entry previous, String value, Entry next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }

        public Entry getNext() {
            return next;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public Entry getPrevious() {
            return previous;
        }

        public void setPrevious(Entry previous) {
            this.previous = previous;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
