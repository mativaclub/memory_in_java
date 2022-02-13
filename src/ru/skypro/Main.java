package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Griffindor harry = new Griffindor("Гарри Поттер", 90,90,
                90,90, 90);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 80,80,
                80,80, 80);
        Griffindor ron = new Griffindor("Рон Уизли ", 70,70,
                70,70, 70);

        Slitherine drako = new Slitherine("Драко Малфой", 60,60,
                60,60, 60, 60, 60);
        Slitherine grehem = new Slitherine("Грэхэм Монтегю", 50,50,
                50,50, 50, 50, 50);
        Slitherine gregori = new Slitherine("Грегори Гойл ", 40,40,
                40,40, 40, 40, 40);

        Kogtevran chou = new Kogtevran("Чжоу Чанг", 30,30,
                30,30, 30, 30);
        Kogtevran padma = new Kogtevran("Падма Патил", 20,20,
                20,20, 20, 20);
        Kogtevran markus = new Kogtevran("Маркус Белби ", 10,10,
                10,10, 10, 10);

        Puffenduy zaharia = new Puffenduy("Захария Смит", 55,55,
                55,55, 55);
        Puffenduy sedrik = new Puffenduy("Седрик Диггори", 88,88,
                88,88, 88);
        Puffenduy justin = new Puffenduy("Джастин Финч-Флетчли ", 77,77,
                77,77, 77);


        harry.compareStudents(drako);
        System.out.println(harry);

        harry.compareGriffindor(germiona);
        System.out.println(harry);

        zaharia.comparePuffenduy(sedrik);
        System.out.println();
        drako.compareSlitherine(gregori);
        System.out.println();
        drako.compareStudents(zaharia);
        System.out.println();
        System.out.println(chou);


    }
}