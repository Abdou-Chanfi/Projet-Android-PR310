package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;

public class ListeProfesseur extends AppCompatActivity {

    ListView lsLp;
    String matriculeLp,nomLp,naissanceLp,adresseLp,telephoneLp,emailLp,classeLp,moduleLp;
    HashMap<String,String> mapLp;
    ParametrePro pLp = new ParametrePro();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_professeur);

        lsLp = findViewById(R.id.lstPro);

        Bundle extrasLp = getIntent().getExtras();
        if (extrasLp != null)
        {
            matriculeLp = extrasLp.getString("MatriculeAP");
            nomLp = extrasLp.getString("NomAP");
            naissanceLp = extrasLp.getString("NaissanceAP");
            adresseLp = extrasLp.getString("AdresseAP");
            telephoneLp = extrasLp.getString("TelephoneAP");
            emailLp = extrasLp.getString("EmailAP");
            classeLp = extrasLp.getString("ClasseAP");
            moduleLp = extrasLp.getString("ModuleAP");

            mapLp = new HashMap<String, String>();
            mapLp.put("MatriculeAP",matriculeLp);
            mapLp.put("NomAP",nomLp);
            mapLp.put("NaissanceAP",naissanceLp);
            mapLp.put("AdresseAP",adresseLp);
            mapLp.put("TelephoneAP",telephoneLp);
            mapLp.put("EmailAP",emailLp);
            mapLp.put("ClasseAP",classeLp);
            mapLp.put("ModuleAP",moduleLp);
            pLp.valuesPro.add(mapLp);

        }

        SimpleAdapter adapterLp = new SimpleAdapter(ListeProfesseur.this,
                pLp.valuesPro,R.layout.itemprofesseur,new String[]{"MatriculeAP",
                "NomAP","NaissanceAP", "AdresseAP","TelephoneAP","EmailAP",
                "ClasseAP","ModuleAP"},
                new int[]{R.id.MatriculePIt,R.id.NomPIt,
                        R.id.NaissancePIt,R.id.AdressePIt,R.id.TelephonePIt,R.id.EmailPIt,
                        R.id.ClassePIt,R.id.ModulePIt});
        lsLp.setAdapter(adapterLp);

        lsLp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Lp = new Intent(getApplicationContext(),DetailsProfesseur.class);
                Lp.putExtra("position",i);
                startActivity(Lp);
            }
        });
    }
}