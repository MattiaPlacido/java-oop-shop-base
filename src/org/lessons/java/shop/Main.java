package org.lessons.java.shop;

public class Main {
public static void main(String[] args) {
    
    //Prova costruttore con codice random
    Prodotto olioExtravergine = new Prodotto("Olio extravergine", "Olio extravergine d'oliva doc", 10, 0.22);
    //Prova costruttore con codice assegnato
    Prodotto alberoDiNatale = new Prodotto(64,"Pino natalizio", "Pino per l'abbellimento di casa", 150,0.22);
    //Prova costruttore senza parametri
    Prodotto pacchettoCaramelle = new Prodotto();

    System.out.println(olioExtravergine.getNomeEsteso());

    olioExtravergine.setNome("Olio motore");
    olioExtravergine.setDescrizione("Olio motore per macchine");
    System.out.println(olioExtravergine.getNomeEsteso());
    System.out.println(olioExtravergine.getDescrizione());

    System.out.println(alberoDiNatale.getNomeEsteso());

    System.out.println(pacchettoCaramelle.getNomeEsteso());

}
}
