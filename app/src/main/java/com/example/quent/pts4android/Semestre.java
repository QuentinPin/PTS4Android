package com.example.quent.pts4android;

import java.util.ArrayList;

public class Semestre {

    private Ue[] content;
    private String intitule;
    private String code;

    public Semestre(String intitule, String code){
        super();
        this.intitule = intitule;
        this.code = code;
        this.content = new Ue[3];
    }

    public Ue[] getListeDeUe() {
        return content;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getCode() {
        return code;
    }

    public void setListeDeUe(ArrayList<Ue> listeDeUe) {
        this.content = listeDeUe.toArray(new Ue[0]);
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCode(String code) {
        this.code = code;
    }
}