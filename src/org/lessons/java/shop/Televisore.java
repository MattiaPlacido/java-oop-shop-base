package org.lessons.java.shop;

public class Televisore extends Prodotto{

    private int dimensioneInPollici;
    private boolean smart;

    //Costructors
    public Televisore(String nome,String descrizione,double prezzo,int dimensioneInPollici, boolean smart){
        super(nome, descrizione, prezzo, 0.22f);
        if(dimensioneInPollici >= 20){
            this.dimensioneInPollici = dimensioneInPollici;
        }else{ //Default
            this.dimensioneInPollici = 20;
        }
        this.smart = smart;
    }

    //Get functions 
    public int getDimensioneInPollici(){
        return dimensioneInPollici;
    }

    public boolean getIsSmart(){
        return smart;
    }

    public String toString(){
        return getNomeEsteso() + "\n Dimensione : " + dimensioneInPollici + " pollici | " + (smart ? "E' smart" : "Non è smart"); 
    }

    //Set functions
    public void setDimensioneInPollici(int dimensioneInPollici){
        if(dimensioneInPollici >= 20){
            this.dimensioneInPollici = dimensioneInPollici;
        }
    }

    public void setIsSmart(boolean smart){
        this.smart = smart;
    }

}
