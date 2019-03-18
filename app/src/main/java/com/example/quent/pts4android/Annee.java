package com.example.quent.pts4android;

import java.util.ArrayList;

public class Annee {

    private String intitule;
    private String code;
    private Semestre[] content;

    public Annee(String intitule, String code){
        super();
        this.intitule = intitule;
        this.code = code;
        this.content = new Semestre[4];
    }

    public String getIntitule() {
        return intitule;
    }

    public String getCode() {
        return code;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
