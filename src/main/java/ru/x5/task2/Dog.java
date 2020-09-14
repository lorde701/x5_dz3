package ru.x5.task2;

class Dog extends Animal {
    boolean isGoodScent;

    Dog(String food, String location) {
        super(food, location);
    }

    void makeNoise() {
        System.out.println("Гав");
    }

    void sleep() {
        System.out.println("Собака спит");
    }
}
