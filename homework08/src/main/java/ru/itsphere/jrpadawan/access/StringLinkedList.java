package ru.itsphere.jrpadawan.access;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class StringLinkedList {
    private Entry first;
    private Entry last;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        if (isEmpty()) {
            last = first = new Entry(null, value, null);
            size++;
        } else {
            addLast(value);
        }
    }

    public void add(int index, String value) {
        // находим элемент, который в данный момент находится под этим индексом index
        Entry current = getEntry(index);
        // берем у него ссылку на предыдущий элемент с индексом index - 1
        Entry previous = current.getPrevious();
        // создаем новый объект и делаем так, чтобы он ссылался на обект с интексоми index - 1 и index
        // (находился между ними)
        Entry newEntry = new Entry(previous, value, current);
        // проверяем, тот ли это случай, когда нам нужно добавить элемент на место первого в списке
        if (index == 0) {
            // если так, то новый элемент должен стать первым
            first = newEntry;
        } else {
            // если нет, то просто элемент с индексом index - 1 должен ссылаться на новый объект как на следующий
            previous.setNext(newEntry);
        }
        // текущий элемент с индексом index должен ссылаться на новый как на предыдущий
        current.setPrevious(newEntry);
        // увеличиваем счетчик на единицу
        size++;
    }

    public String get(int index) {
        return getEntry(index).getValue();
    }

    public boolean contains(String value) {
        return getEntry(value) != null;
    }

    public void set(int index, String value) {
        getEntry(index).setValue(value);
    }

    public void remove(int index) {
        removeEntry(getEntry(index));
    }

    public void remove(String value) {
        Entry entry = getEntry(value);
        if (entry != null) {
            removeEntry(entry);
        }
    }

    public String[] toArray() {
        String[] array = new String[size];
        Entry entry = first;
        for (int i = 0; i < array.length; i++) {
            array[i] = entry.getValue();
            entry = entry.getNext();
        }
        return array;
    }

    private void addLast(String value) {
        Entry newLast = new Entry(last, value, null);
        last.setNext(newLast);
        last = newLast;
        size++;
    }

    private void removeEntry(Entry entry) {
        Entry previous = entry.getPrevious();
        Entry next = entry.getNext();
        if (previous == null) {
            first = next;
        } else {
            previous.setNext(next);
        }
        if (next == null) {
            last = previous;
        } else {
            next.setPrevious(previous);
        }
        size--;
    }

    private Entry getEntry(String value) {
        for (Entry entry = first; entry != null; entry = entry.getNext()) {
            if (entry.getValue().equals(value)) {
                return entry;
            }
        }
        return null;
    }

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
