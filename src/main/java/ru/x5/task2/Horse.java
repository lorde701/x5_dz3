package ru.x5.task2;

class Horse extends Animal {
    int maneLength;

    Horse(String food, String location) {
        super(food, location);
    }

    void makeNoise() {
        System.out.println("Фр-Фр");
    }

    void sleep() {
        System.out.println("Лошадь спит");
    }
}
