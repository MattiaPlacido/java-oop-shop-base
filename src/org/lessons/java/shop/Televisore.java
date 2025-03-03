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

    @Override
    public Double getPrezzoConIva(boolean hasTessera){
        Double prezzoIvato = Math.round(getPrezzoBase() * (1 + getIva()) * 100.0) / 100.0;
        if(hasTessera){
            if(!smart){
                return prezzoIvato / 100 * 90; //10% di sconto se non è smart
            }else{
                return prezzoIvato / 100 * 98; //2% altrimenti
            }
        }else{
                return prezzoIvato;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\n Dimensione : " + dimensioneInPollici + " pollici | " + (smart ? "E' smart" : "Non è smart"); 
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
