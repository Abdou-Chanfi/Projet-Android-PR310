package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjouterEtudiants extends AppCompatActivity {

    EditText matriculeAe,nomAe,naissanceAe,adresseAe,telephoneAe,emailAe,classeAe;
    Button ajout, retourE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_etudiants);

        matriculeAe = findViewById(R.id.txtMatriculeE);
        nomAe = findViewById(R.id.txtNomE);
        naissanceAe = findViewById(R.id.txtNaissanceE);
        adresseAe = findViewById(R.id.txtAdresseE);
        telephoneAe = findViewById(R.id.txtTelephoneE);
        emailAe = findViewById(R.id.txtEmailE);
        classeAe = findViewById(R.id.txtClasseE);
        ajout = findViewById(R.id.btnAjouterAE);
        retourE = findViewById(R.id.btnRetourAE);

        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ae = new Intent(getApplicationContext(),ListeEtudiant.class);
                ae.putExtra("MatriculeAE",matriculeAe.getText().toString());
                ae.putExtra("NomAE",nomAe.getText().toString());
                ae.putExtra("NaissanceAE",naissanceAe.getText().toString());
                ae.putExtra("AdresseAE",adresseAe.getText().toString());
                ae.putExtra("TelephoneAE",telephoneAe.getText().toString());
                ae.putExtra("EmailAE",emailAe.getText().toString());
                ae.putExtra("ClasseAE",classeAe.getText().toString());
                startActivity(ae);
            }
        });

        retourE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(getApplicationContext(),AcceuilEtudiants .class);
                startActivity(re);
                finish();
            }
        });
    }
}