package a.klassen;

public class Kuchen {
    String name;
    int pieces;
    double price;
    static int available_pieces = 8;

    Kuchen (String name, double price) {
        this.name = name;
        this.price = price;
        this.pieces = available_pieces;
    }

    void ausgabe() {
        if (pieces > 0) {
        	System.out.println(name + ", St�ckpreis " + price + " �\nVerf�gbare St�ckzahl: " + pieces);
        }else{
            System.out.println(name + " kostet pro St�ck " + price + " �");
        }
    }

    void verkaufen(int sell_pieces){
        if (sell_pieces > available_pieces){
            System.out.println("ERROR: Die gew�nschte St�ckzahl " + sell_pieces + " ist nicht verf�gbar.");
        }else {
            System.out.println("Es werden " + sell_pieces + " Kuchenst�cke verkauft");
            pieces -= sell_pieces;
        }
    }
}
