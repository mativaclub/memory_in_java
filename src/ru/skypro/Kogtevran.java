package ru.skypro;

public class Kogtevran extends Hogwarts {
    private final int clever;
    private final int wise;
    private final int witty;
    private final int fullOfCreativity;


    public Kogtevran(String name, int powerOfMagic, int distanceOfTransgression,
                     int clever, int wise, int witty, int fullOfCreativity) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getClever() {
        return clever;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void compareKogtevran(Kogtevran student) {
        super.compareStudents(student);
        if (this.clever > student.getClever()) {
            System.out.println("Clever " + this.getName() + " is higher then " + student.getName());
        } else if (this.clever == student.getClever()) {
            System.out.println("Clever " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Clever " + this.getName() + " is lower then " + student.getName());
        }

        if (this.wise > student.getWise()) {
            System.out.println("Wise " + this.getName() + " is higher then " + student.getName());
        } else if (this.wise == student.getWise()) {
            System.out.println("Wise " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Wise " + this.getName() + " is lower then " + student.getName());
        }

        if (this.witty > student.getWitty()) {
            System.out.println("Witty " + this.getName() + " is higher then " + student.getName());
        } else if (this.witty == student.getWitty()) {
            System.out.println("Witty " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Witty " + this.getName() + " is lower then " + student.getName());
        }


        if (this.fullOfCreativity > student.getFullOfCreativity()) {
            System.out.println("Creativity " + this.getName() + " is higher then " + student.getName());
        } else if (this.fullOfCreativity == student.getFullOfCreativity()) {
            System.out.println("Creativity " + this.getName() + " and " + student.getName() + " are equal");
        } else {
            System.out.println("Creativity " + this.getName() + " is lower then " + student.getName());
        }
    }
}

