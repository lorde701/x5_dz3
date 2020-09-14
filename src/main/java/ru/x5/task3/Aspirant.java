package ru.x5.task3;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, float averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
