package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class DetailsProfesseur extends AppCompatActivity {

    EditText matriculeDp,nomDp,naissanceDp,adresseDp,telephoneDp,emailDp,classeDp,moduleDp;
    Button modifierDp,supprimerDp,retourDp;
    int position;
    ParametrePro pDp = new ParametrePro();
    HashMap<String,String> mDp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_professeur);

        matriculeDp = findViewById(R.id.txtMatriculeDp);
        nomDp = findViewById(R.id.txtNomDp);
        naissanceDp = findViewById(R.id.txtNaissanceDp);
        adresseDp = findViewById(R.id.txtAdresseDp);
        telephoneDp = findViewById(R.id.txtTelephoneDp);
        emailDp = findViewById(R.id.txtEmailDp);
        classeDp = findViewById(R.id.txtClasseDp);
        moduleDp = findViewById(R.id.txtModuleDp);
        modifierDp = findViewById(R.id.btnModifierPD);
        supprimerDp = findViewById(R.id.btnSupprimerPD);
        retourDp = findViewById(R.id.btnRetourPD);

        Bundle extrasDp = getIntent().getExtras();
        if (extrasDp != null)
        {
            position = extrasDp.getInt("position");
        }
        mDp = pDp.valuesPro.get(position);
        matriculeDp.setText(mDp.get("MatriculeAP"));
        nomDp.setText(mDp.get("NomAP"));
        naissanceDp.setText(mDp.get("NaissanceAP"));
        adresseDp.setText(mDp.get("AdresseAP"));
        telephoneDp.setText(mDp.get("TelephoneAP"));
        emailDp.setText(mDp.get("EmailAP"));
        classeDp.setText(mDp.get("ClasseAP"));
        moduleDp.setText(mDp.get("ModuleAP"));

        modifierDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDp.put("MatriculeAP",matriculeDp.getText().toString());
                mDp.put("NomAP",nomDp.getText().toString());
                mDp.put("NaissanceAP",naissanceDp.getText().toString());
                mDp.put("AdresseAP",adresseDp.getText().toString());
                mDp.put("TelephoneAP",telephoneDp.getText().toString());
                mDp.put("EmailAP",emailDp.getText().toString());
                mDp.put("ClasseAP",classeDp.getText().toString());
                mDp.put("ModuleAP",moduleDp.getText().toString());
                Intent moDp = new Intent(getApplicationContext(),ListeProfesseur.class);
                startActivity(moDp);
                finish();
            }
        });

        supprimerDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pDp.valuesPro.remove(position);
                Intent suDp = new Intent(getApplicationContext(),ListeProfesseur.class);
                startActivity(suDp);
                finish();
            }
        });

        retourDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reDp = new Intent(getApplicationContext(),AcceuilProfesseur .class);
                startActivity(reDp);
                finish();
            }
        });

    }
}