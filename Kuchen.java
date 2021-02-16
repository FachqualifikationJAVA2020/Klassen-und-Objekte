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
        	System.out.println(name + ", Stückpreis " + price + " €\nVerfügbare Stückzahl: " + pieces);
        }else{
            System.out.println(name + " kostet pro Stück " + price + " €");
        }
    }

    void verkaufen(int sell_pieces){
        if (sell_pieces > available_pieces){
            System.out.println("ERROR: Die gewünschte Stückzahl " + sell_pieces + " ist nicht verfügbar.");
        }else {
            System.out.println("Es werden " + sell_pieces + " Kuchenstücke verkauft");
            pieces -= sell_pieces;
        }
    }
}
