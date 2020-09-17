package ru.x5.task2;

class Dog extends Animal {
    private boolean isGoodScent;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, boolean isGoodScent) {
        super(food, location);
        this.isGoodScent = isGoodScent;
    }

    public void makeNoise() {
        System.out.println("Гав");
    }

    public void sleep() {
        System.out.println("Собака спит");
    }
}
