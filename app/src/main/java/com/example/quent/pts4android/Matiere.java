package com.example.quent.pts4android;

import java.util.ArrayList;

public class Matiere {

    private ArrayList<Note> listDeNote;
    private String code;
    private String intitule;
    private String moyenne;

    public Matiere(String intitule, String code, String moyenne){
        super();
        this.intitule = intitule;
        this.code = code;
        this.moyenne = moyenne;
        this.listDeNote = new ArrayList<Note>();
    }

    public void setListDeNote(ArrayList<Note> listDeNote) {
        this.listDeNote = listDeNote;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setMoyenne(String moyenne) {
        this.moyenne = moyenne;
    }

    public ArrayList<Note> getListDeNote() {

        return listDeNote;
    }

    public String getCode() {
        return code;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getMoyenne() {
        return moyenne;
    }
}
