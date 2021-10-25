package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjouterProfesseur extends AppCompatActivity {

    EditText matriculeAp,nomAp,naissanceAp,adresseAp,telephoneAp,emailAp,classeAp,moduleAp;
    Button ajoute, retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_professeur);

        matriculeAp = findViewById(R.id.txtMatriculeP);
        nomAp = findViewById(R.id.txtNomP);
        naissanceAp = findViewById(R.id.txtNaissanceP);
        adresseAp = findViewById(R.id.txtAdresseP);
        telephoneAp = findViewById(R.id.txtTelephoneP);
        emailAp = findViewById(R.id.txtEmailP);
        classeAp = findViewById(R.id.txtClasseP);
        moduleAp = findViewById(R.id.txtModuleP);
        ajoute = findViewById(R.id.btnAjouterP);
        retour = findViewById(R.id.btnRetourP);

        ajoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aP = new Intent(getApplicationContext(),ListeProfesseur.class);
                aP.putExtra("MatriculeAP",matriculeAp.getText().toString());
                aP.putExtra("NomAP",nomAp.getText().toString());
                aP.putExtra("NaissanceAP",naissanceAp.getText().toString());
                aP.putExtra("AdresseAP",adresseAp.getText().toString());
                aP.putExtra("TelephoneAP",telephoneAp.getText().toString());
                aP.putExtra("EmailAP",emailAp.getText().toString());
                aP.putExtra("ClasseAP",classeAp.getText().toString());
                aP.putExtra("ModuleAP",moduleAp.getText().toString());
                startActivity(aP);
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getApplicationContext(),AcceuilProfesseur .class);
                startActivity(r);
                finish();
            }
        });
    }
}