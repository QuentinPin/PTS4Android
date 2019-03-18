package com.example.quent.pts4android;

import java.util.ArrayList;

public class Semestre {

    private ArrayList<Ue> listeDeUe;
    private String intitule;
    private String code;

    public Semestre(String intitule, String code){
        super();
        this.intitule = intitule;
        this.code = code;
        this.listeDeUe = new ArrayList<Ue>();
    }

    public ArrayList<Ue> getListeDeUe() {
        return listeDeUe;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getCode() {
        return code;
    }

    public void setListeDeUe(ArrayList<Ue> listeDeUe) {
        this.listeDeUe = listeDeUe;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
