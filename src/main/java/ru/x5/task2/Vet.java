package ru.x5.task2;

class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println("Место обитания животного: " + animal.getLocation());
        System.out.println("Еда животного: " + animal.getFood());
    }
}
