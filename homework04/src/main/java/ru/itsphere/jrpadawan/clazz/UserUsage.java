package ru.itsphere.jrpadawan.clazz;

/**
 * ������� �����-����������� ��� ����������(5-� �������)
 * <p>
 * c. 123 - �. 153
 */
class UserUsage {
    // ����������� ����
    static final int MIN_HEIGHT = 140;
    // ������������ �������
    static final int MAX_AGE = 27;

    Object createUser() {
        return new User(190, 20);
    }

    Object createSuitableUser() {
        return new User(178, 25);
    }

    Object createUnsuitableUser() {
        return new User(150, 28);
    }
}
