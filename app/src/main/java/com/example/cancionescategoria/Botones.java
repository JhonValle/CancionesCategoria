package com.example.cancionescategoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Botones extends AppCompatActivity {
    Button RapG,PopG,ReggaetonG,RockG,CumbiaG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        RapG = (Button)findViewById(R.id.btnRap);
        PopG = (Button)findViewById(R.id.btnPop);
        ReggaetonG = (Button)findViewById(R.id.btnReggaeton);
        RockG = (Button)findViewById(R.id.btnRock);
        CumbiaG = (Button)findViewById(R.id.btnCumbia);




        RapG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarMusicRap();
            }
        });

        PopG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarMusicPop();
            }
        });

        ReggaetonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarMusicReggaeton();
            }
        });

        RockG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarMusicRock();
            }
        });

        CumbiaG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarMusicCumbia();
            }
        });

    }

    private void LlamarMusicRap()
    {
        Intent intent1 = new Intent(Botones.this,RapM.class);
        startActivity(intent1);
    }
    private void LlamarMusicPop()
    {
        Intent intent2 = new Intent(Botones.this,PopM.class);
        startActivity(intent2);
    }
    private void LlamarMusicReggaeton()
    {
        Intent intent3 = new Intent(Botones.this,ReggaetonM.class);
        startActivity(intent3);
    }

    private void LlamarMusicRock()
    {
        Intent intent4 = new Intent(Botones.this,RockM.class);
        startActivity(intent4);
    }
    private void LlamarMusicCumbia()
    {
        Intent intent5 = new Intent(Botones.this,CumbiaM.class);
        startActivity(intent5);
    }

}