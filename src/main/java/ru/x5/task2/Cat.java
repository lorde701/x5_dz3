package ru.x5.task2;

public class Cat extends Animal {
    private boolean canCatchMouse;

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, boolean canCatchMouse) {
        super(food, location);
        this.canCatchMouse = canCatchMouse;
    }

    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void sleep() {
        System.out.println("Кошка спит");
    }
}
