package ru.x5.task3;

public class Aspirant extends Student {
    private Qualification qualification;


    public Aspirant(String firstName, String lastName, String group, float averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public Aspirant(String firstName, String lastName, String group, float averageMark, Qualification qualification) {
        super(firstName, lastName, group, averageMark);
        this.qualification = qualification;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
}
