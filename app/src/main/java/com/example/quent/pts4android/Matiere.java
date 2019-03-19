
package com.example.quent.pts4android;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Matiere {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("intitule")
    @Expose
    private String intitule;
    @SerializedName("moyenne")
    @Expose
    private String moyenne;
    @SerializedName("notes")
    @Expose
    private List<Note> notes = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(String moyenne) {
        this.moyenne = moyenne;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

}
