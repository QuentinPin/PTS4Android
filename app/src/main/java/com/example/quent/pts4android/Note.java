
package com.example.quent.pts4android;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Note {

    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("value")
    @Expose
    private Object value;

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
