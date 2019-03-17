package com.example.quent.pts4android;

public class Note {

    private String intitule;
    private float notePratique;
    private float noteTheorique;

    public Note(String intitule){
        super();
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public float getNotePratique() {
        return notePratique;
    }

    public float getNoteTheorique() {
        return noteTheorique;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setNotePratique(float notePratique) {
        this.notePratique = notePratique;
    }

    public void setNoteTheorique(float noteTheorique) {
        this.noteTheorique = noteTheorique;
    }
}
