package com.example.quent.pts4android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class ConnectionActivity extends AppCompatActivity {

    private EditText identifiantEditText;
    private EditText motDePasseEditText;
    private Button connectionButton;
    private Button afficherMotDePasseButton;
    private CheckBox sauvegardeIdentifiantCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        identifiantEditText = findViewById(R.id.identifiantEditText);
        motDePasseEditText = findViewById(R.id.motDePasseEditText);
        connectionButton = findViewById(R.id.connectionButton);
        afficherMotDePasseButton = findViewById(R.id.afficherMotDePasseButton);
        sauvegardeIdentifiantCheckBox = findViewById(R.id.sauvegardeIdentifiantCheckBox);
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
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String identifiant = preferences.getString("Identifiant", "");
        String motDePasse = preferences.getString("MotDePasse", "");
        identifiantEditText.setText(identifiant);
        motDePasseEditText.setText(motDePasse);
        if (!identifiant.equals("")) {
            sauvegardeIdentifiantCheckBox.setChecked(true);
        }
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
        sauvegardeIdentifiant(id, mdp);
        //Appelle de l'API
        this.traitementAPI(id, mdp);
        //Changement interface -> NoteActivity
//        Intent i = new Intent(this, NoteActivity.class);
//        startActivity(i);
//        finish();

    }

    private void sauvegardeIdentifiant(String id, String mdp) {
        if (sauvegardeIdentifiantCheckBox.isChecked()) {
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("Identifiant", id);
            editor.putString("MotDePasse", mdp);
            editor.apply();
        }
    }

    private void traitementAPI(String id, String mdp) {
        new Thread() {
            public void run() {
                String json = request("https://alexispoupelin.me/getAllNotes?id=i171193&pass=unq84eb&dep=INFO").toString();
                if(json.length() == 0){
                    /*
                    ----- ERREUR DE CHARGEMENT -----
                     */
                }
                char[] tempo = new char[json.length()-2];
                json.getChars(1, json.length()-1, tempo, 0);
                json = new String(tempo);
                Gson unGson = new Gson();
                Annee[] tabAnnee = unGson.fromJson(json, Annee[].class);
                Log.i("test", "test");
            }
        }.start();

    }

    private StringBuffer request(String urlString) {
        // TODO Auto-generated method stub

        StringBuffer chaine = new StringBuffer("");
        try {
            URL url = new URL(urlString);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "");
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.connect();

            InputStream inputStream = connection.getInputStream();

            BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = rd.readLine()) != null) {
                chaine.append(line);
            }
        } catch (IOException e) {
            // Writing exception to log
            e.printStackTrace();
        }
        return chaine;
    }
}
