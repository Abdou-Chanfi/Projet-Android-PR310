package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class DetailsModule extends AppCompatActivity {

    EditText matriculeDm,nomDm,volumeHoraireDm,dateDebutDm,dateFinDm,salleDm,professeurDm;
    Button modifierDm,supprimerDm,retourDm;
    int position;
    ParametreMod pDm = new ParametreMod();
    HashMap<String,String> mDm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_module);

        matriculeDm = findViewById(R.id.txtMatriculeDm);
        nomDm = findViewById(R.id.txtNomDm);
        volumeHoraireDm = findViewById(R.id.txtVolumeHoraireDm);
        dateDebutDm = findViewById(R.id.txtDateDebutDm);
        dateFinDm = findViewById(R.id.txtDateFinDm);
        salleDm = findViewById(R.id.txtSalleDm);
        professeurDm = findViewById(R.id.txtProfesseurDm);
        modifierDm = findViewById(R.id.btnModifierDm);
        supprimerDm = findViewById(R.id.btnSupprimerDm);
        retourDm = findViewById(R.id.btnRetourDm);

        Bundle extrasDm = getIntent().getExtras();
        if (extrasDm != null)
        {
            position = extrasDm.getInt("position");
        }

        mDm = pDm.valuesMod.get(position);
        matriculeDm.setText(mDm.get("MatriculeAM"));
        nomDm.setText(mDm.get("NomAM"));
        volumeHoraireDm.setText(mDm.get("VolumeHoraireAM"));
        dateDebutDm.setText(mDm.get("DateDebutAM"));
        dateFinDm.setText(mDm.get("DateFinAM"));
        salleDm.setText(mDm.get("SalleAM"));
        professeurDm.setText(mDm.get("ProfesseurAM"));

        modifierDm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDm.put("MatriculeAM",matriculeDm.getText().toString());
                mDm.put("NomAM",nomDm.getText().toString());
                mDm.put("VolumeHoraireAM",volumeHoraireDm.getText().toString());
                mDm.put("DateDebutAM",dateDebutDm.getText().toString());
                mDm.put("DateFinAM",dateFinDm.getText().toString());
                mDm.put("SalleAM",salleDm.getText().toString());
                mDm.put("ProfesseurAM",professeurDm.getText().toString());
                Intent moDm = new Intent(getApplicationContext(),ListeModule.class);
                startActivity(moDm);
                finish();
            }
        });

        supprimerDm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pDm.valuesMod.remove(position);
                Intent suDm = new Intent(getApplicationContext(),ListeModule.class);
                startActivity(suDm);
                finish();
            }
        });

        retourDm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reDm = new Intent(getApplicationContext(),AcceuilModule .class);
                startActivity(reDm);
                finish();
            }
        });


    }
}