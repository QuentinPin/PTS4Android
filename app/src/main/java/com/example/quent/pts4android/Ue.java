package com.example.quent.pts4android;

import java.util.ArrayList;

public class Ue {

    private Matiere[] matieres;
    private String intitule;
    private String code;

    public Ue(String intitule, String code){
        super();
        this.intitule = intitule;
        this.code = code;
        this.matieres = new Matiere[20];
    }

    public Matiere[] getListeDeMatiere() {
        return matieres;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getCode() {
        return code;
    }

    public void setListeDeMatiere(ArrayList<Matiere> listeDeMatiere) {
        this.matieres = listeDeMatiere.toArray(new Matiere[0]);
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
