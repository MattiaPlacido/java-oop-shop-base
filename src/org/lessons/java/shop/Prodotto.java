package org.lessons.java.shop;

//importazione librerie
import java.util.Random;

public class Prodotto {
    //Attributi 
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome,String descrizione,double prezzo,double iva){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;    
    }

    public double getPrezzoBase(){
        return prezzo;
    }

    public double getPrezzoConIva(){
        return Math.round(prezzo * (1 + iva) * 100.0) / 100.0;
    }

    public String getNomeEsteso(){
        return codice + "-" + nome;
    }

}
