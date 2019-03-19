package com.example.quent.pts4android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

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
            nomAnnee.setBackgroundColor(Color.BLACK);
            linearLayoutNote.addView(nomAnnee);

            for(Content unContent: unAnnee.getContent()){
                TextView nomSemestre = new TextView(this);
                nomSemestre.setText("\t" + unContent.getIntitule());
                nomSemestre.setTextColor(Color.WHITE);
                nomSemestre.setBackgroundColor(Color.BLUE);
                linearLayoutNote.addView(nomSemestre);

                for(Matiere uneMatière: unContent.getMatieres()){
                    TextView nomMatière = new TextView(this);
                    nomMatière.setText("\t\t" + uneMatière.getIntitule() + ": " + uneMatière.getMoyenne());
                    linearLayoutNote.addView(nomMatière);

                    for(Note uneNote: uneMatière.getNotes()){
                        TextView nomNote = new TextView(this);
                        nomNote.setText("\t\t\t" + uneNote.getDescription() + ": " + uneNote.getValue());
                        linearLayoutNote.addView(nomNote);
                    }

                }

            }
        }
    }
}
