package org.lessons.java.shop;

//importazione librerie
import java.util.Random;

public class Prodotto {
    //Attributi 
    public int codice;
    public String nome;
    public String descrizione;
    public Double prezzo;
    public Double iva;

    public Prodotto(String nome,String descrizione,double prezzo,double iva){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;    
    }

    public Double getPrezzoBase(){
        if(prezzo != null){

            return prezzo;
        }else{
            return null;
        }
    }

    public Double getPrezzoConIva(){
        if(prezzo != null && iva != null){
            return Math.round(prezzo * (1 + iva) * 100.0) / 100.0;
        }else{
            return null;
        }
    }

    public String getNomeEsteso(){
        if(nome != null){
            return codice + "-" + nome;
        }else{
            return String.valueOf(codice);
        }
    }

}
