package com.example.gestionscolaire30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;

public class ListeModule extends AppCompatActivity {

    ListView lsLm;
    String matriculeLm,nomLm,volumeHoraireLm,dateDebutLm,dateFinLm,salleLm,professeurLm;
    HashMap<String,String> mapLm;
    ParametreMod pLm = new ParametreMod();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_module);

        lsLm = findViewById(R.id.lstMod);

        Bundle extrasLm = getIntent().getExtras();
        if (extrasLm != null)
        {
            matriculeLm = extrasLm.getString("MatriculeAM");
            nomLm = extrasLm.getString("NomAM");
            volumeHoraireLm = extrasLm.getString("VolumeHoraireAM");
            dateDebutLm = extrasLm.getString("DateDebutAM");
            dateFinLm = extrasLm.getString("DateFinAM");
            salleLm = extrasLm.getString("SalleAM");
            professeurLm = extrasLm.getString("ProfesseurAM");


            mapLm = new HashMap<String, String>();
            mapLm.put("MatriculeAM",matriculeLm);
            mapLm.put("NomAM",nomLm);
            mapLm.put("VolumeHoraireAM",volumeHoraireLm);
            mapLm.put("DateDebutAM",dateDebutLm);
            mapLm.put("DateFinAM",dateFinLm);
            mapLm.put("SalleAM",salleLm);
            mapLm.put("ProfesseurAM",professeurLm);
            pLm.valuesMod.add(mapLm);
        }

        SimpleAdapter adapterLm = new SimpleAdapter(ListeModule.this,
                pLm.valuesMod,R.layout.itemmodule,new String[]{"MatriculeAM",
                "NomAM","VolumeHoraireAM", "DateDebutAM","DateFinAM","SalleAM",
                "ProfesseurAM"},
                new int[]{R.id.MatriculeMIt,R.id.NomMIt,
                        R.id.VolumeHoraireMIt,R.id.DateDebutMIt,R.id.DateFinMIt,R.id.SalleMIt,
                        R.id.ProfesseurMIt});
        lsLm.setAdapter(adapterLm);

        lsLm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Lm = new Intent(getApplicationContext(),DetailsModule.class);
                Lm.putExtra("position",i);
                startActivity(Lm);
            }
        });

    }
}