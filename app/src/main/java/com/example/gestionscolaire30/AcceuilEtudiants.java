package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcceuilEtudiants extends AppCompatActivity {

    Button ajouter,Liste, retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil_etudiants);

        ajouter = findViewById(R.id.btnAjouterEtudiants);
        Liste = findViewById(R.id.btnListeEtudiants);
        retour = findViewById(R.id.btnRetourEtudiants);

        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Aae = new Intent(getApplicationContext(),AjouterEtudiants.class);
                startActivity(Aae);
            }
        });
        Liste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ale = new Intent(getApplicationContext(),ListeEtudiant.class);
                startActivity(Ale);
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rae = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(rae);
            }
        });

    }
}