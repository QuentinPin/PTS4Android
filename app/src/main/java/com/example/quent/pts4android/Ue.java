package com.example.quent.pts4android;

import java.util.ArrayList;

public class Ue {

    private ArrayList<Matiere> listeDeMatiere;
    private String intitule;
    private String code;

    public Ue(String intitule, String code){
        super();
        this.intitule = intitule;
        this.code = code;
        this.listeDeMatiere = new ArrayList<Matiere>();
    }

    public ArrayList<Matiere> getListeDeMatiere() {
        return listeDeMatiere;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getCode() {
        return code;
    }

    public void setListeDeMatiere(ArrayList<Matiere> listeDeMatiere) {
        this.listeDeMatiere = listeDeMatiere;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
