package ru.skypro;

public class Puffenduy extends Hogwarts {
    private final int industrious;
    private final int loyal;
    private final int honesty;

    public Puffenduy(String name, int powerOfMagic, int distanceOfTransgression,
                     int industrious, int loyal, int honesty) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.industrious = industrious;
        this.loyal = loyal;
        this.honesty = honesty;
    }

    public int getIndustrious() {
        return industrious;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonesty() {
        return honesty;
    }

    public void comparePuffenduy(Puffenduy student) {
        super.compareStudents(student);
        if (this.industrious > student.getIndustrious()) {
            System.out.println("Industrious " + this.getName() + " is higher then " + student.getName());
        } else if (this.industrious == student.getIndustrious()) {
            System.out.println("Industrious " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Industrious " + this.getName() + " is lower then " + student.getName());
        }

        if (this.loyal > student.getLoyal()) {
            System.out.println("Loyal " + this.getName() + " is higher then " + student.getName());
        } else if (this.loyal == student.getLoyal()) {
            System.out.println("Loyal " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Loyal " + this.getName() + " is lower then " + student.getName());
        }

        if (this.honesty > student.getHonesty()) {
            System.out.println("Honesty " + this.getName() + " is higher then " + student.getName());
        } else if (this.honesty == student.getHonesty()) {
            System.out.println("Honesty " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Honesty " + this.getName() + " is lower then " + student.getName());
        }
    }
}

