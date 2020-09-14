package ru.x5.task3;

class Student {
    String firstName;
    String lastName;
    String group;
    float averageMark;

    Student(String firstName, String lastName, String group, float averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
