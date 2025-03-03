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

    @Override
    public Double getPrezzoConIva(boolean hasTessera){
        Double prezzoIvato = Math.round(getPrezzoBase() * (1 + getIva()) * 100.0) / 100.0;
        if(hasTessera){
            if(ramInGB < 32){
                return prezzoIvato / 100 * 95; //5% di sconto se la ram è sotto 32GB
            }else{
                return prezzoIvato / 100 * 98; //2% altrimenti
            }
        }else{
                return prezzoIvato;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\n Ram : " + ramInGB + "GB | Codice Imei : " + codiceImei; 
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
