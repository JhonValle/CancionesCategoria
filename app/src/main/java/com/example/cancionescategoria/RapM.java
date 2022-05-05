package com.example.cancionescategoria;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class RapM extends AppCompatActivity {
    Button play_pause,btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir=2,posicion=0;

    MediaPlayer vectormp[]=new MediaPlayer[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rap_m);

        play_pause=(Button)findViewById(R.id.btnPlay);
        btn_repetir=(Button)findViewById(R.id.btnRepetir);
        iv=(ImageView) findViewById(R.id.imageView);


        vectormp[0]=MediaPlayer.create(this,R.raw.paseloquepase);
        vectormp[1]=MediaPlayer.create(this,R.raw.dragonb);
        vectormp[2]=MediaPlayer.create(this,R.raw.jokerrap);
        vectormp[3]=MediaPlayer.create(this,R.raw.santaflow);
        vectormp[4]=MediaPlayer.create(this,R.raw.superbroly);

    }
    public void PlayPause(View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this,"Pausa",Toast.LENGTH_SHORT).show();
        }else{
            vectormp[posicion].start();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this,"Play",Toast.LENGTH_SHORT).show();
        }
    }
    public void Stop(View view){
        if(vectormp[posicion]!=null){
            vectormp[posicion].stop();

            vectormp[0]=MediaPlayer.create(this,R.raw.paseloquepase);
            vectormp[1]=MediaPlayer.create(this,R.raw.dragonb);
            vectormp[2]=MediaPlayer.create(this,R.raw.jokerrap);
            vectormp[3]=MediaPlayer.create(this,R.raw.santaflow);
            vectormp[4]=MediaPlayer.create(this,R.raw.superbroly);
            posicion=0;

            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.pase);
            Toast.makeText(this,"Stop",Toast.LENGTH_SHORT).show();

        }

    }
    public void Repetir(View view){
        if(repetir==1) {
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
        }else{
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir=1;
        }
    }
    public void Siguiente(View view){
        if(posicion<vectormp.length-1){
            if (vectormp[posicion].isPlaying()) {
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                if (posicion == 0) {
                    iv.setImageResource(R.drawable.pase);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.dragon1);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.joker);
                }
                else if (posicion == 3) {
                    iv.setImageResource(R.drawable.santaflow);
                }
                else if (posicion == 4) {
                    iv.setImageResource(R.drawable.dragon2);
                }
            }else {
                posicion++;
                if (posicion == 0) {
                    iv.setImageResource(R.drawable.pase);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.dragon1);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.joker);
                }
                else if (posicion == 3) {
                    iv.setImageResource(R.drawable.santaflow);
                }
                else if (posicion == 4) {
                    iv.setImageResource(R.drawable.dragon2);
                }
            }
        }else {
            Toast.makeText(this, "No existe mas canciones", Toast.LENGTH_SHORT).show();

        }
    }

    public void Anterior(View view){
        if (posicion>=1){

            if (vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp[0]=MediaPlayer.create(this,R.raw.paseloquepase);
                vectormp[1]=MediaPlayer.create(this,R.raw.dragonb);
                vectormp[2]=MediaPlayer.create(this,R.raw.jokerrap);
                vectormp[3]=MediaPlayer.create(this,R.raw.santaflow);
                vectormp[4]=MediaPlayer.create(this,R.raw.superbroly);
                posicion--;

                if (posicion == 0) {
                    iv.setImageResource(R.drawable.pase);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.dragon1);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.joker);
                }
                else if (posicion == 3) {
                    iv.setImageResource(R.drawable.santaflow);
                }
                else if (posicion == 4) {
                    iv.setImageResource(R.drawable.dragon2);
                }
                vectormp[posicion].start();
            }else{
                posicion--;
                if (posicion == 0) {
                    iv.setImageResource(R.drawable.pase);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.dragon1);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.joker);
                }
                else if (posicion == 3) {
                    iv.setImageResource(R.drawable.santaflow);
                }
                else if (posicion == 4) {
                    iv.setImageResource(R.drawable.dragon2);
                }
            }
        }else{
            Toast.makeText(this,"No existe mas canciones",Toast.LENGTH_SHORT).show();

        }
    }
}