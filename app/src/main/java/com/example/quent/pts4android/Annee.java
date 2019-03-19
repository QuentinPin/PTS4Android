
package com.example.quent.pts4android;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Annee {

    @SerializedName("intitule")
    @Expose
    private String intitule;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}
