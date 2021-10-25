package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcceuilModule extends AppCompatActivity {

    Button ajouter,Liste, retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil_module);

        ajouter = findViewById(R.id.btnAjoutModuleAm);
        Liste = findViewById(R.id.btnListeModuleAm);
        retour = findViewById(R.id.btnRetourAm);

        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Am = new Intent(getApplicationContext(),AjouterModule.class);
                startActivity(Am);
            }
        });

        Liste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ale = new Intent(getApplicationContext(),ListeModule.class);
                startActivity(Ale);
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ram = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ram);
            }
        });

    }
}