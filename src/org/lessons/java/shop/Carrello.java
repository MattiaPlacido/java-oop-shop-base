package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Quanti prodotti vuoi comprare?");
        int nProdotti = input.nextInt();
        input.nextLine(); //Evito che salti il prossimo nextline
        if(nProdotti <= 0){
            nProdotti = 3;
        }

        Prodotto[] prodotti = new Prodotto[nProdotti];

        for(int i = 0; i < prodotti.length; i++){
            //nome
            System.out.println("Inserisci il nome del prodotto desiderato : ");
            String nomeProdotto = input.nextLine();
            //prezzo
            System.out.println("Inserisci il prezzo del prodotto desiderato (prima dell'iva) : ");
            int prezzoProdotto = input.nextInt();
            input.nextLine(); //Evito che salti il prossimo nextline
            //descrizione
            System.out.println("Inserisci una caratteristica o la marca del tuo prodotto : ");
            String descrizioneProdotto = input.nextLine();
            //categoria
            System.out.println("Il tuo prodotto a che categoria appartiene? Cuffie, TV o Smartphone? : ");
            String categoriaProdotto = input.nextLine();

            switch (categoriaProdotto.toLowerCase()) {
                case "cuffie":
                    //Colore
                    System.out.println("Di che colore sono le tue cuffie? : ");
                    String coloreProdotto = input.nextLine();
            
                    //Wireless
                    System.out.println("Sono senza fili? (SOLO TRUE O FALSE)");
                    boolean isWireless = Boolean.parseBoolean(input.nextLine());
            
                    prodotti[i] = new Cuffie(nomeProdotto, descrizioneProdotto, prezzoProdotto, coloreProdotto, isWireless);
                    break;
            
                case "tv":
                    //Dimensioni
                    System.out.println("Inserisci i pollici della TV : ");
                    int dimensioniProdotto = input.nextInt();
                    input.nextLine(); //Evito che salti il prossimo nextline
            
                    //Smart
                    System.out.println("La TV è smart? (SOLO TRUE O FALSE)");
                    boolean isSmart = Boolean.parseBoolean(input.nextLine());

                    prodotti[i] = new Televisore(nomeProdotto, descrizioneProdotto, prezzoProdotto, dimensioniProdotto, isSmart);
                    break;
            
                case "smartphone":
                    //Codice IMEI
                    System.out.println("Inserisci il codice IMEI : ");
                    String codiceImei = input.nextLine();
            
                    //Ram in GB
                    System.out.println("Inserisci la quantita di RAM in gigabyte : ");
                    int ram = input.nextInt();
                    input.nextLine(); //Evito che salti il prossimo nextline
            
                    prodotti[i] = new Smartphone(nomeProdotto, descrizioneProdotto, prezzoProdotto, codiceImei, ram);
                    break;
            
                default:
                    //Inserisco prodotto vuoto
                    prodotti[i] = new Prodotto();
                    break;
            }
            
        }

        System.out.println("Hai una tessera fedeltà ? (SOLO TRUE O FALSE)");
        boolean hasTessera = Boolean.parseBoolean(input.nextLine());


        System.out.println("I tuoi oggetti sono : ");
        Double prezzoTotale = 0.0;
        for(int i = 0; i < prodotti.length; i++){
            prezzoTotale += prodotti[i].getPrezzoConIva(hasTessera);
            System.out.println(prodotti[i].toString());
        }
        System.out.println("Il totale è : " + prezzoTotale + " euro");

    }

}
