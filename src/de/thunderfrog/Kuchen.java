package de.thunderfrog;

public class Kuchen {
    String name;
    double preis;
    int stueck;

    static int stueckzahl = 16;

    Kuchen (String name, double preis) {
        this.name = name;
        this.preis = preis;
        this.stueck = stueckzahl;
    }

    void ausgabe(){
        if(stueck == 0){
            System.out.println("Name: " + name + " Preis: " + preis + " Stücke: 0");
        }else{
            System.out.println("Name: " + name + " Preis: " + preis + " Stücke: " + stueck);
        }
    }

    void verkaufen (int stuecke){
        System.out.println("Sie möchten " + stuecke + " stücke Kuchen.");

        if(stuecke > stueck){
            System.out.println("Leider keine Stücke mehr da");
        }else {
            System.out.println("Sie bekommen " + stuecke + " stücke Kuchen");
            stueck = stueck - stuecke;
        }
    }

}
