package ru.x5.task1;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println(String.format("Звонит %s с номера %s", name, number));
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляются сообщения на номера " + Arrays.toString(numbers));
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }
}
