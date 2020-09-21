package ru.x5.task2;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public abstract void makeNoise();

    public void eat() {
        System.out.println("Животное кушает " + food);
    }

    public abstract void sleep();
}
