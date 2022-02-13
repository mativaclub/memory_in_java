package ru.skypro;

public class Slitherine extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int powerLust;

    public Slitherine(String name, int powerOfMagic, int distanceOfTransgression,
                      int cunning, int determination, int ambition, int resourcefulness, int powerLust) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void compareSlitherine(Slitherine student) {
        super.compareStudents(student);
        if (this.cunning > student.getCunning()) {
            System.out.println("Cunning " + this.getName() + " is higher then " + student.getName());
        } else if (this.cunning == student.getCunning()) {
            System.out.println("Cunning " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Cunning " + this.getName() + " is lower then " + student.getName());
        }

        if (this.determination > student.getDetermination()) {
            System.out.println("Determination " + this.getName() + " is higher then " + student.getName());
        } else if (this.determination == student.getDetermination()) {
            System.out.println("Determination " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Determination " + this.getName() + " is lower then " + student.getName());
        }

        if (this.ambition > student.getAmbition()) {
            System.out.println("Ambition " + this.getName() + " is higher then " + student.getName());
        } else if (this.ambition == student.getAmbition()) {
            System.out.println("Ambition " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Ambition " + this.getName() + " is lower then " + student.getName());
        }

        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println("Resourcefulness " + this.getName() + " is higher then " + student.getName());
        } else if (this.resourcefulness == student.getResourcefulness()) {
            System.out.println("Resourcefulness " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Resourcefulness " + this.getName() + " is lower then " + student.getName());
        }

        if (this.powerLust > student.getPowerLust()) {
            System.out.println("PowerLust " + this.getName() + " is higher then " + student.getName());
        } else if (this.powerLust == student.getPowerLust()) {
            System.out.println("PowerLust " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("PowerLust " + this.getName() + " is lower then " + student.getName());
        }
    }
    }




