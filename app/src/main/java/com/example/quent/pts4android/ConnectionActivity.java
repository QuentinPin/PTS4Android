package com.example.quent.pts4android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConnectionActivity extends AppCompatActivity {

    private EditText identifiantEditText;
    private EditText motDePasseEditText;
    private Button connectionButton;
    private Button afficherMotDePasseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        identifiantEditText = findViewById(R.id.identifiantEditText);
        motDePasseEditText = findViewById(R.id.motDePasseEditText);
        connectionButton = findViewById(R.id.connectionButton);
        afficherMotDePasseButton = findViewById(R.id.afficherMotDePasseButton);
        afficherMotDePasseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherMotDePasseAction();
            }
        });
        connectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connectionButtonAction();
            }
        });
    }

    private void afficherMotDePasseAction() {
        if (motDePasseEditText.getInputType() == 129) { //Si le mot de passe est cachuer
            motDePasseEditText.setInputType(0); //On l'affiche
            afficherMotDePasseButton.setText("Cacher");
        } else { //Si le mot de passe est visible
            motDePasseEditText.setInputType(129); //On le cache
            afficherMotDePasseButton.setText("Afficher");
        }
    }

    private void connectionButtonAction() {
        String id = identifiantEditText.getText().toString();
        String mdp = motDePasseEditText.getText().toString();
        /*
        Appelle de l'API ici
        */

        /*
        Changement d'interface
         */
    }
}
