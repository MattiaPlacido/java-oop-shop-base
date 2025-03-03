package org.lessons.java.shop;

//Import 
import java.util.Random;

public class Prodotto {
    //Attributes 
    private int codice;
    private String nome;
    private String descrizione;
    private Double prezzo;
    private Double iva;


    //Constructors
    public Prodotto(String nome,String descrizione,double prezzo,double iva){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;    
    }
    public Prodotto(int codice,String nome,String descrizione,double prezzo,double iva){
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;    
    }
    public Prodotto(){
        codice = 999;
        nome = "Pacchetto di caramelle default";
        descrizione = "Prova costruttore senza parametri";
        prezzo = 8.0;
        iva = 0.22;    
    }
    

    //GET functions
    public Double getPrezzoBase(){
        if(prezzo != null){

            return prezzo;
        }else{
            return null;
        }
    }

    public Double getPrezzoConIva(boolean hasTessera){
        if(prezzo != null && iva != null){
            Double prezzoIvato = Math.round(prezzo * (1 + iva) * 100.0) / 100.0;
            if(hasTessera){
                return prezzoIvato / 100 * 98; //2% di sconto
            }else{
                return prezzoIvato;
            }
        }else{
            return null;
        }
    }

    public String getNomeEsteso(){
        if(nome != null){
            return "\n" + codice + " - " + nome;
        }else{
            return String.valueOf(codice);
        }
    }

    public String getDescrizione(){
        return descrizione;
    }
    
    public Double getIva(){
        return iva;
    }

    public int getCodice(){
        return codice;
    }

    @Override
    public String toString(){
        return nome + " | " + codice + " | " + prezzo;
    }

    //SET functions
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }

    public void setDescrizione(String descrizione){
        if(descrizione != null){
            this.descrizione = descrizione;
        }
    }

    public void setPrezzo(Double prezzo){
        if(prezzo != null && !prezzo.isNaN() && prezzo >= 0){
            this.prezzo = prezzo;
        }
    }

    public void setIva(Double iva){
        if(iva != null && !iva.isNaN() && iva >= 0 && iva < 1){
            this.iva = iva;
        }
    }



}
