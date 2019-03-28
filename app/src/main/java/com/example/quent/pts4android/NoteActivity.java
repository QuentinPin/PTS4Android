package com.example.quent.pts4android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class NoteActivity extends AppCompatActivity {

    private LinearLayout linearLayoutNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        linearLayoutNote = findViewById(R.id.linearLayoutNote);
        Annee[] tabAnnee = ConnectionActivity.ANNEE;
        for (Annee unAnnee: tabAnnee){
            TextView nomAnnee = new TextView(this);
            nomAnnee.setText(unAnnee.getIntitule());
            nomAnnee.setTextColor(Color.WHITE);
            nomAnnee.setBackgroundColor(Color.rgb(0,113,246));
            nomAnnee.setPadding(20,30,0,30);
            linearLayoutNote.addView(nomAnnee);

            for(Content unContent: unAnnee.getContent()){
                TextView nomSemestre = new TextView(this);
                nomSemestre.setText(unContent.getIntitule());
                nomSemestre.setTextColor(Color.WHITE);
                nomSemestre.setBackgroundColor(Color.rgb(61,167,79));
                nomSemestre.setPadding(100,20,0,20);
                linearLayoutNote.addView(nomSemestre);

                for(Matiere uneMatière: unContent.getMatieres()){
                    TextView nomMatière = new TextView(this);
                    char[] intituleSansNumeroMatiere = new char[uneMatière.getIntitule().length()-6];
                    uneMatière.getIntitule().getChars(6, uneMatière.getIntitule().length(), intituleSansNumeroMatiere, 0);
                    String tempo = new String(intituleSansNumeroMatiere);
                    nomMatière.setText(tempo + ": " + uneMatière.getMoyenne());
                    nomMatière.setPadding(100,0,0,0);
                    linearLayoutNote.addView(nomMatière);

                    for(Note uneNote: uneMatière.getNotes()){
                        if(uneNote.getDescription() != null){
                            TextView nomNote = new TextView(this);
                            nomNote.setText(uneNote.getDescription() + ": " + uneNote.getValue());
                            nomNote.setPadding(200,0,0,0);
                            linearLayoutNote.addView(nomNote);
                        }
                    }

                }

            }
        }
    }
}
