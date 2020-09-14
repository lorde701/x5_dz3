package ru.x5.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] array = {
                new Dog("кости, мясо", "дом"),
                new Cat("мыши, молоко", "квартира"),
                new Horse("трава", "луг")
        };
        Vet vet = new Vet();
        for (Animal item : array) {
            vet.treatAnimal(item);
            System.out.println();
        }
    }
}
