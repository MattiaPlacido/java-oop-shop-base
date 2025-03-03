package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    //Attributes
    private String codiceImei;
    private int ramInGB;

    //Constructors
    public Smartphone(String nome,String descrizione,double prezzo,String codiceImei,int ramInGB){
        super(nome,descrizione,prezzo,0.22f);
        if(ramInGB >= 1){
            this.ramInGB = ramInGB;
        }else{ //Default
            this.ramInGB = 2;
        }
        if(codiceImei != null){
            this.codiceImei = codiceImei;
        }else{
            this.codiceImei = "";
        }
    }
    
    //Get functions
    public String getCodiceImei(){
        return codiceImei;
    }

    public int getRamInGb(){
        return ramInGB;
    }

    public String toString(){
        return getNomeEsteso() + "\n Ram : " + ramInGB + "GB | Codice Imei : " + codiceImei; 
    }

    //Set functions
    public void setCodiceImei(String codiceImei){
        if(codiceImei != null){
            this.codiceImei = codiceImei;
        }
    }

    public void setRamInGb(int ramInGB){
        if(ramInGB >= 1){
            this.ramInGB = ramInGB;
        }
    }

}
