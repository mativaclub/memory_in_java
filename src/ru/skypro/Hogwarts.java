package ru.skypro;

public class Hogwarts {
    private final String name;
    private final int powerOfMagic;
    private final int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Student" + name + " have a power of magic " + powerOfMagic +
                " and can transgress to the distance " + distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }


    public void compareStudents(Hogwarts student) {
        if (this.powerOfMagic > student.getPowerOfMagic()) {
            System.out.println("Magic power " + this.name + " is higher then " + student.getName());
        } else if (this.powerOfMagic == student.getPowerOfMagic()) {
            System.out.println("Magic power " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Magic power " + this.name + " is lower then " + student.getName());
        }

    if (this.distanceOfTransgression > student.getDistanceOfTransgression()) {
        System.out.println("Distance Of Transgression " + this.name + " is higher then " + student.getName());
    } else if (this.distanceOfTransgression == student.getDistanceOfTransgression()) {
        System.out.println("Distance Of Transgression " + this.getName() + " and " + student.getName() + " are equal");
    } else {
        System.out.println("Distance Of Transgression " + this.name + " is lower then " + student.getName());
    }
}
}