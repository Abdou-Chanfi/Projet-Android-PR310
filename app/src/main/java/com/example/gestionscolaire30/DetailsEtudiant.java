package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class DetailsEtudiant extends AppCompatActivity {

    EditText matriculeDe,nomDe,naissanceDe,adresseDe,telephoneDe,emailDe,classeDe;
    Button modifierDe,supprimerDe,retourDe;
    int position;
    ParametreEtu pDe = new ParametreEtu();
    HashMap<String,String> mDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_etudiant);

        matriculeDe = findViewById(R.id.txtMatriculeDe);
        nomDe = findViewById(R.id.txtNomDe);
        naissanceDe = findViewById(R.id.txtNaissanceDe);
        adresseDe = findViewById(R.id.txtAdresseDe);
        telephoneDe = findViewById(R.id.txtTelephoneDe);
        emailDe = findViewById(R.id.txtEmailDe);
        classeDe = findViewById(R.id.txtClasseDe);
        modifierDe = findViewById(R.id.btnModifierEtudiantDe);
        supprimerDe = findViewById(R.id.btnSupprimerEtudiantDe);
        retourDe = findViewById(R.id.btnRetourEtudiantDe);

        Bundle extrasDe = getIntent().getExtras();
        if (extrasDe != null)
        {
            position = extrasDe.getInt("position");
        }
        mDe = pDe.values.get(position);
        matriculeDe.setText(mDe.get("MatriculeAE"));
        nomDe.setText(mDe.get("NomAE"));
        naissanceDe.setText(mDe.get("NaissanceAE"));
        adresseDe.setText(mDe.get("AdresseAE"));
        telephoneDe.setText(mDe.get("TelephoneAE"));
        emailDe.setText(mDe.get("EmailAE"));
        classeDe.setText(mDe.get("ClasseAE"));

        modifierDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDe.put("MatriculeAE",matriculeDe.getText().toString());
                mDe.put("NomAE",nomDe.getText().toString());
                mDe.put("NaissanceAE",naissanceDe.getText().toString());
                mDe.put("AdresseAE",adresseDe.getText().toString());
                mDe.put("TelephoneAE",telephoneDe.getText().toString());
                mDe.put("EmailAE",emailDe.getText().toString());
                mDe.put("ClasseAE",classeDe.getText().toString());
                Intent moDe = new Intent(getApplicationContext(),ListeEtudiant.class);
                startActivity(moDe);
                finish();
            }
        });

        supprimerDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pDe.values.remove(position);
                Intent suDe = new Intent(getApplicationContext(),ListeEtudiant.class);
                startActivity(suDe);
                finish();
            }
        });

        retourDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reDe = new Intent(getApplicationContext(),AcceuilEtudiants .class);
                startActivity(reDe);
                finish();
            }
        });
    }
}