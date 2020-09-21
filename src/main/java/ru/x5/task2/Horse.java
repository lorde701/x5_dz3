package ru.x5.task2;

public class Horse extends Animal {
    private int maneLength;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, int maneLength) {
        super(food, location);
        this.maneLength = maneLength;
    }

    public void makeNoise() {
        System.out.println("Фр-Фр");
    }

    public void sleep() {
        System.out.println("Лошадь спит");
    }
}
