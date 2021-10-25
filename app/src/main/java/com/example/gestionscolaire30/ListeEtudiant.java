package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;

public class ListeEtudiant extends AppCompatActivity {

    ListView lsLe;
    String matriculeLe,nomLe,naissanceLe,adresseLe,telephoneLe,emailLe,classeLe;
    HashMap<String,String> mapLe;
    ParametreEtu pLe = new ParametreEtu();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_etudiant);

        lsLe = findViewById(R.id.lstEtu);

        Bundle extrasLe = getIntent().getExtras();
        if (extrasLe != null)
        {
            matriculeLe = extrasLe.getString("MatriculeAE");
            nomLe = extrasLe.getString("NomAE");
            naissanceLe = extrasLe.getString("NaissanceAE");
            adresseLe = extrasLe.getString("AdresseAE");
            telephoneLe = extrasLe.getString("TelephoneAE");
            emailLe = extrasLe.getString("EmailAE");
            classeLe = extrasLe.getString("ClasseAE");

            mapLe = new HashMap<String, String>();
            mapLe.put("MatriculeAE",matriculeLe);
            mapLe.put("NomAE",nomLe);
            mapLe.put("NaissanceAE",naissanceLe);
            mapLe.put("AdresseAE",adresseLe);
            mapLe.put("TelephoneAE",telephoneLe);
            mapLe.put("EmailAE",emailLe);
            mapLe.put("ClasseAE",classeLe);
            pLe.values.add(mapLe);

        }

        SimpleAdapter adapterLe = new SimpleAdapter(ListeEtudiant.this,
                pLe.values,R.layout.itemetudiant,new String[]{"MatriculeAE",
                "NomAE","NaissanceAE", "AdresseAE","TelephoneAE","EmailAE",
                "ClasseAE"},
                new int[]{R.id.MatriculeIt,R.id.NomIt,
                R.id.NaissanceIt,R.id.AdresseIt,R.id.TelephoneIt,R.id.EmailIt,
                R.id.ClasseIt});
        lsLe.setAdapter(adapterLe);

        lsLe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Le = new Intent(getApplicationContext(),DetailsEtudiant.class);
                Le.putExtra("position",i);
                startActivity(Le);
            }
        });
    }
}