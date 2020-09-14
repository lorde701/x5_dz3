package ru.x5.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+78005553535", "Samsung s1", 123f);
        Phone phone2 = new Phone("+78005550000", "Samsung s2", 100f);
        Phone phone3 = new Phone("+78005121212", "Samsung s3", 99f);
        Phone[] array = {phone1, phone2, phone3};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Данные о телефоне №" + (i + 1));
            Phone current = array[i];
            System.out.println("Номер телефона: " + current.getNumber());
            System.out.println("Модель телефона: " + current.getModel());
            System.out.println("Вес телефона: " + current.getWeight());
            current.receiveCall("Иван");
            current.receiveCall("Петр", "+74567894512");
            current.sendMessage("+74126541232", "+78459561548");
            System.out.println();
        }
    }
}
