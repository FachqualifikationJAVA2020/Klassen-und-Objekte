package a.klassen;

public class KuchenTest {
	 public static void main(String[] args) {
		 
		Kuchen russischer_zupfkuchen = new Kuchen("Russischer Zupfkuchen",4.44);
			   russischer_zupfkuchen.ausgabe();
			   russischer_zupfkuchen.verkaufen(3);
			   russischer_zupfkuchen.ausgabe();
		
		Kuchen diplomatentorte = new Kuchen("Diplomatentorte",3.99);
			   diplomatentorte.ausgabe();
			   diplomatentorte.verkaufen(9);
			   diplomatentorte.ausgabe();
				
		System.out.println();
	    }
}
