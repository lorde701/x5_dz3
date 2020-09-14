package ru.x5.task1;

import java.util.Arrays;

class Phone {
    private String number;
    private String model;
    private float weight;

    Phone() {}

    private Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println(String.format("Звонит %s с номера %s", name, number));
    }

    void sendMessage(String... numbers) {
        System.out.println("Отправляются сообщения на номера " + Arrays.toString(numbers));
    }

    String getNumber() {
        return number;
    }

    String getModel() {
        return model;
    }

    float getWeight() {
        return weight;
    }
}
