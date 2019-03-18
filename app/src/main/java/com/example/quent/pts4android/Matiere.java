package com.example.quent.pts4android;

import java.util.ArrayList;

public class Matiere {

    private Note[] notes;
    private String code;
    private String intitule;
    private String moyenne;

    public Matiere(String intitule, String code, String moyenne){
        super();
        this.intitule = intitule;
        this.code = code;
        this.moyenne = moyenne;
        this.notes = new Note[3];
    }

    public void setListDeNote(ArrayList<Note> listDeNote) {
        this.notes = listDeNote.toArray(new Note[0]);
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

    public Note[] getListDeNote() {
        return notes;
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
