package ru.skypro;

public class Griffindor extends Hogwarts {
    private final int nobility;
    private final int honour;
    private final int bravery;

    public Griffindor(String name, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honour, int bravery) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Nobility of Student is " + nobility + ", honour is " + honour + ", bravery is " + bravery;
    }

    public void compareGriffindor(Griffindor student) {
        super.compareStudents(student);

        if (this.nobility > student.getNobility()) {
            System.out.println("Nobility " + this.getName() + " is higher then " + student.getName());
        } else if (this.nobility == student.getNobility()) {
            System.out.println("Nobility " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Nobility " + this.getName() + " is lower then " + student.getName());
        }

        if (this.honour > student.getHonour()) {
            System.out.println("Honour " + this.getName() + " is higher then " + student.getName());
        } else if (this.honour == student.getHonour()) {
            System.out.println("Honour " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Honour " + this.getName() + " is lower then " + student.getName());
        }


        if (this.bravery > student.getBravery()) {
            System.out.println("Bravery " + this.getName() + " is higher then " + student.getName());
        } else if (this.bravery == student.getBravery()) {
            System.out.println("Bravery " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Bravery " + this.getName() + " is lower then " + student.getName());
        }
    }
}

