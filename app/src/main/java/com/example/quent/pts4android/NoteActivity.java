package com.example.quent.pts4android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class NoteActivity extends AppCompatActivity {

    private LinearLayout linearLayoutNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        linearLayoutNote = findViewById(R.id.linearLayoutNote);
    }
}
