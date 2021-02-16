package de.thunderfrog;

public class KuchenTest {
    public static void main(String[] args) {
        Kuchen bienenstich = new Kuchen("Bienenstich",9.99);
        bienenstich.ausgabe();
        bienenstich.verkaufen(10);
        bienenstich.ausgabe();


        System.out.println();

        Kuchen apfelstrudel = new Kuchen("Apfelstrudel",9.99);
        apfelstrudel.ausgabe();
        apfelstrudel.verkaufen(20);
        apfelstrudel.ausgabe();

    }
}
