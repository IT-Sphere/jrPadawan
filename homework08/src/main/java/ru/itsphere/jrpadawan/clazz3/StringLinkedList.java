package ru.itsphere.jrpadawan.clazz3;

/**
 * Класс представляет собой собственную реализацию двусвязного списка.
 * <p>
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class StringLinkedList {
    // Ссылка на первый элемент списка.
    private Entry first;
    // Ссылка на последний элемент списка.
    private Entry last;
    // Количество элементов списка.
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
        // Проверяем, что индекс не вышел за рамки списка.
        checkIndex(index);
        // Берем первый элемент списка.
        Entry entry = first;
        // Последовательно переходим по списку пока не дойдем до элемента с необходимым индексом.
        for (int counter = 0; counter < index; counter++) {
            entry = entry.getNext();
        }
        // Возвращаем элемент списка, на котором остановились в цикле.
        return entry;
    }

    /**
     * Проверяем, что индекс не вышел за рамки списка.
     */
    private void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            // Если index меньше нуля или больше чем size - 1.
            throw new IndexOutOfBoundsException(String.format("Element with number %s doesn't exist", index));
        }
    }

    /**
     * Очистить список.
     */
    public void clear() {
        // Нужно аннулировать все поля класса.
        // Сами объекты, хранящие значение, можно не удалять. Потому, что они будут удалены сборщиком мусора,
        // когда будут утрачены все ссылки.
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Возвращает список в виде строки.
     */
    @Override
    public String toString() {
        // Создаем билдера (пример шаблона builder).
        StringBuilder builder = new StringBuilder();
        // Перебираем все элементы.
        for (Entry entry = first; entry != null; entry = entry.getNext()) {
            // Добавляем значение разделяя пробелом.
            builder.append(entry.getValue() + " ");
        }
        // Возвращаем получившееся значение.
        return builder.toString();
    }

    /**
     * Задача 1.
     * Добавляет все значение массива в конец списка.
     * Если в списке было "sasha masha", а добавляем [pasha][vadim],
     * то должно получиться "sasha masha pasha vadim".
     */
    public void addAll(String[] values) {
        for (String value : values) {
            add(value);
        }
    }

    /**
     * Задача 2.
     * Добавляет все значение массива по указанному индексу.
     * Если в списке было "sasha masha", а добавляем [pasha][vadim] на место индекса 1,
     * то должно получиться "sasha pasha vadim masha".
     * Если индекс выходит за пределы размера списка то должно вываливаться исключение IndexOutOfBoundsException
     * (можно использовать этот checkIndex метод).
     */
    public void addAll(int index, String[] values) {
        for (String value : values) {
            add(index++, value);
        }
    }

    /**
     * Задача 3.
     * Возвращает индекс, под которым это значение находится в списке.
     * Искать с начала (слева). Возвращать индекс первого попавшегося значения.
     * Например, если список у нас такой "sasha pasha vadim masha", то вызов метода со значением "pasha"
     * должен вернуть 1. Если значение не найдено, то возвращать -1.
     */
    public int indexOf(String value) {
        int index = 0;
        for (Entry entry = first; entry != null; entry = entry.getNext(), index++) {
            if (entry.getValue().equals(value)) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Задача 4.
     * Возвращает подсписок (Новый! Исходный остается без изменений) с элементами исходного начиная с индекса from по index to (включительно).
     * Если индекс выходит за пределы размера списка то должно вываливаться исключение IndexOutOfBoundsException
     * (можно использовать этот checkIndex метод). Если from > to, то должно происходить исключение IllegalArgumentException.
     * Например, если список у нас такой "sasha pasha vadim masha", то вызов метода со значением 1 и 2
     * должен вернуть список со значениями "pasha vadim".
     */
    public StringLinkedList subList(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from > to");
        }
        checkIndex(from);
        checkIndex(to);
        StringLinkedList subList = new StringLinkedList();
        int index = 0;
        for (Entry entry = first; entry != null; entry = entry.getNext(), index++) {
            if (from <= index && index <= to) {
                subList.add(entry.getValue());
            }
        }
        return subList;
    }

    /**
     * Задача 5.
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
     * Задача 6.
     * Добавляет новый элемент в начало списка.
     * Например, если было так "pasha vadim masha", то после выполнения этого
     * метода должно быть так "sasha pasha vadim masha".
     */
    public void addFirst(String value) {
        if (isEmpty()) {
            last = first = new Entry(null, value, null);
        } else {
            Entry newFirst = new Entry(null, value, first);
            first.setPrevious(newFirst);
            first = newFirst;
        }
        size++;
    }

    /**
     * Задача 7.
     * Возвращает новый (исходный остается без изменений) список только уникальных объектов. Например если было так
     * "pasha masha vadim masha", то станет так "pasha masha vadim".
     */
    public StringLinkedList distinct() {
        StringLinkedList distinct = new StringLinkedList();
        for (Entry entry = first; entry != null; entry = entry.getNext()) {
            if (!distinct.contains(entry.getValue())) {
                distinct.add(entry.getValue());
            }
        }
        return distinct;
    }

    /**
     * Задача 8.
     * Возвращает новый (исходный остается без изменений) список объектов порядок которых обратный. Например если было так
     * "pasha masha vadim masha", то станет так "masha vadim masha pasha".
     */
    public StringLinkedList reverse() {
        StringLinkedList reverse = new StringLinkedList();
        for (Entry entry = last; entry != null; entry = entry.getPrevious()) {
            reverse.add(entry.getValue());
        }
        return reverse;
    }

    /**
     * Класс для хранения строкового значения в списке.
     */
    private class Entry {
        // Ссылка на следующий элемент списка.
        private Entry next;
        // Ссылка на предыдущий элемент списка.
        private Entry previous;
        // Поле для хранения значения.
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
