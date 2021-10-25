package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ouvreAceuilleEtudiant,ouvreAceuilleProfesseur,ouvreAceuilleModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ouvreAceuilleEtudiant = findViewById(R.id.btnEtudiant);
        ouvreAceuilleProfesseur = findViewById(R.id.btnProfesseur);
        ouvreAceuilleModule = findViewById(R.id.btnModule);

        ouvreAceuilleEtudiant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ae = new Intent(getApplicationContext(),AcceuilEtudiants.class);
                startActivity(Ae);
            }
        });

        ouvreAceuilleProfesseur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ap = new Intent(getApplicationContext(),AcceuilProfesseur.class);
                startActivity(Ap);
            }
        });

        ouvreAceuilleModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Am = new Intent(getApplicationContext(),AcceuilModule.class);
                startActivity(Am);
            }
        });
    }
}