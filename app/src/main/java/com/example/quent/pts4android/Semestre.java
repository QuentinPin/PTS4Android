package com.example.quent.pts4android;

import java.util.ArrayList;

public class Semestre {

    private ArrayList<Ue> listeDeUe;
    private String nom;

    public Semestre(String nom){
        super();
        this.nom = nom;
        this.listeDeUe = new ArrayList<Ue>();
    }

    public ArrayList<Ue> getListeDeUe() {
        return listeDeUe;
    }

    public String getNom() {
        return nom;
    }

    public void setListeDeUe(ArrayList<Ue> listeDeUe) {
        this.listeDeUe = listeDeUe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
