package ru.x5.task2;

class Cat extends Animal {
    boolean canCatchMouse;

    Cat(String food, String location) {
        super(food, location);
    }

    void makeNoise() {
        System.out.println("Мяу");
    }

    void sleep() {
        System.out.println("Кошка спит");
    }
}
