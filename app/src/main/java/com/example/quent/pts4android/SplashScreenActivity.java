package com.example.quent.pts4android;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.os.Process.SIGNAL_KILL;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        if (isConnectedToInternet() == false){
            alerteDialogueDisplay();
        }else{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(SplashScreenActivity.this, ConnectionActivity.class);
                    startActivity(i);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }

    }

    private boolean isConnectedToInternet(){
        NetworkInfo network = ((ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (network==null || !network.isConnected())
            return false;
        return true;
    }

    private void alerteDialogueDisplay(){
        AlertDialog dialog;
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Aucune connection");
        alertDialog.setMessage("Vous devez disposer d'une d'une connexion internet pour accéder aux service de cette application.");
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("Réessayer", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(SplashScreenActivity.this, SplashScreenActivity.class);
                startActivity(i);
                finish();
            }
        });

        alertDialog.setNegativeButton("Quitter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               System.exit(0);
            }
        });

        dialog = alertDialog.create();
        dialog.show();

    }
}
