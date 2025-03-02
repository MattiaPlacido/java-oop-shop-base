package org.lessons.java.shop;

public class Main {
public static void main(String[] args) {
    
    Prodotto olioExtravergine = new Prodotto("Olio extravergine", "Olio extravergine d'oliva doc", 10, 0.22);

    Prodotto alberoDiNatale = new Prodotto("Pino natalizio", "Pino per l'abbellimento di casa", 150,0.22);


    System.out.println(olioExtravergine.getNomeEsteso());
    System.out.println("Prezzo base : " + olioExtravergine.getPrezzoBase());
    System.out.println("Prezzo con iva : " + olioExtravergine.getPrezzoConIva());

    System.out.println(alberoDiNatale.getNomeEsteso());
    System.out.println("Prezzo base : " + alberoDiNatale.getPrezzoBase());
    System.out.println("Prezzo con iva : " + alberoDiNatale.getPrezzoConIva());

}
}
