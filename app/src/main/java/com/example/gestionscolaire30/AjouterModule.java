package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjouterModule extends AppCompatActivity {

    EditText matriculeAm,nomAm,volumeHoraireAm,dateDebutAm,dateFinAm,salleAm,professeurAm;
    Button ajoute, retourM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_module);

        matriculeAm = findViewById(R.id.txtMatriculeM);
        nomAm = findViewById(R.id.txtNomM);
        volumeHoraireAm = findViewById(R.id.txtVolHoraireM);
        dateDebutAm = findViewById(R.id.txtDateDebutM);
        dateFinAm = findViewById(R.id.txtDateFinM);
        salleAm = findViewById(R.id.txtSalleM);
        professeurAm = findViewById(R.id.txtProfesseurM);
        ajoute = findViewById(R.id.btnAjouterM);
        retourM = findViewById(R.id.btnRetourM);

        ajoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am = new Intent(getApplicationContext(),ListeModule.class);
                am.putExtra("MatriculeAM",matriculeAm.getText().toString());
                am.putExtra("NomAM",nomAm.getText().toString());
                am.putExtra("VolumeHoraireAM",volumeHoraireAm.getText().toString());
                am.putExtra("DateDebutAM",dateDebutAm.getText().toString());
                am.putExtra("DateFinAM",dateFinAm.getText().toString());
                am.putExtra("SalleAM",salleAm.getText().toString());
                am.putExtra("ProfesseurAM",professeurAm.getText().toString());
                startActivity(am);
            }
        });

        retourM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rm = new Intent(getApplicationContext(),AcceuilModule .class);
                startActivity(rm);
                finish();
            }
        });

    }
}