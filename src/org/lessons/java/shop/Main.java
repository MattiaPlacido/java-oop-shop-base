package org.lessons.java.shop;

public class Main {
public static void main(String[] args) {
    
    //Smartphone || non chiedo l'iva perchè l'ho settatta di default a 0,22 in tutti i costruttori delle sottoclassi
    Smartphone motorola = new Smartphone("Motorola Smartphone","Descrizione",180,"1923789182379182379", 3);
    System.out.println(motorola.toString());

    //Televisore
    Televisore samsung = new Televisore("Samsung tv", "tv 40 pollici", 400, 40, false);
    System.out.println(samsung.toString());

    //Cuffie
    Cuffie JBLBluetooth = new Cuffie("JBL go Air pop","Cuffie bluetooth",30,"Bianche",true);
    System.out.println(JBLBluetooth.toString());
}
}
