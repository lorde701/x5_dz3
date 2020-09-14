package ru.x5.task2;

abstract class Animal {
    String food;
    String location;

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    abstract void makeNoise();

    void eat() {
        System.out.println("Животное кушает " + food);
    }

    abstract void sleep();
}
