package ru.x5.task3;

public class Main {

    public static void main(String[] args) {
        Student[] array = {
                new Student("Петр", "Петров", "Д1", 3.5f),
                new Aspirant("Лев", "Сидоров", "Д12", 5f),
                new Student("Аркадий", "Смирнов", "Д1", 5f),
                new Student("Максим", "Королев", "Д1", 3.5f),
                new Aspirant("Василий", "Орлов", "Д3", 4.8f)
        };
        for (Student student : array) {
            System.out.println(String.format("%s %s получает степендию: %s",
                    student.lastName, student.firstName, student.getScholarship()));
        }
    }
}
