package ru.itsphere.jrpadawan.inheritance;

/**
 * Абстрактный класс. Морское животное.
 */
public abstract class MarineAnimals extends Animal{

    private double maxDepth;

    /**
     * Погрузиться на глубину.
     */
    public void dive() {
        System.out.println("Dived to " + maxDepth + "ms.");
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}
