package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    
    private String colore;
    private boolean wireless;

    //Constructors
    public Cuffie(String nome,String descrizione,double prezzo,String colore,boolean wireless){
        super(nome, descrizione, prezzo, 0.22f);

        this.wireless = wireless;

        if(colore != null){
            this.colore = colore;
        }else{ //Default
            this.colore = "Nere";
        }
    }

    //Get functions
    public String getColore(){
        return colore;
    }

    public boolean getIsWireless(){
        return wireless;
    }

    @Override
    public Double getPrezzoConIva(boolean hasTessera){
        Double prezzoIvato = Math.round(getPrezzoBase() * (1 + getIva()) * 100.0) / 100.0;
        if(hasTessera){
            if(!wireless){
                return prezzoIvato / 100 * 93; //7% di sconto se le cuffie sono cablate
            }else{
                return prezzoIvato / 100 * 98; //2% altrimenti
            }
        }else{
                return prezzoIvato;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\n Colore : " + colore + " | " + (wireless ? "Sono wireless" : "Non sono wireless"); 
    }

    //Set functions
    public void setColore(String colore){
        if(colore != null){
            this.colore = colore;
        }
    }

    public void setIsWireless(boolean wireless){
        this.wireless = wireless;
    }

}
