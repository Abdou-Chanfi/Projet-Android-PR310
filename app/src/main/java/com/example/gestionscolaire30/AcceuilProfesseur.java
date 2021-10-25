package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcceuilProfesseur extends AppCompatActivity {

    Button ajouter,Liste,retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil_professeur);

        ajouter = findViewById(R.id.btnAjouterProfesseurAp);
        Liste = findViewById(R.id.btnListeProfesseurAp);
        retour = findViewById(R.id.btnRetourAp);

        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Aap = new Intent(getApplicationContext(),AjouterProfesseur.class);
                startActivity(Aap);
            }
        });

        Liste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ale = new Intent(getApplicationContext(),ListeProfesseur.class);
                startActivity(Ale);
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rap = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(rap);
            }
        });


    }
}