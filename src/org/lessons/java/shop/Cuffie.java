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

    public String toString(){
        return getNomeEsteso() + "\n Colore : " + colore + " | " + (wireless ? "Sono wireless" : "Non sono wireless"); 
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
