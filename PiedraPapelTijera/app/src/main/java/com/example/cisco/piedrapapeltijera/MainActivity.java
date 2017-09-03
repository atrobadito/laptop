package com.example.cisco.piedrapapeltijera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getName();
    private static final Random rgenerador= new Random();

    //Aqui guarda las imagenes en un array de  enteros
    private static final Integer[] imagenesID={R.drawable.piedra,R.drawable.papel , R.drawable.tijera};

    private ImageView imgvpiedra,imgvpapel,imgvtijera,imgvincognita,imgvusuario,imgvsistema;
    private Button btnJugar,btnReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgvpiedra= (ImageView) findViewById(R.id.imgvPiedra);
        imgvpapel= (ImageView) findViewById(R.id.imgvPapel);
        imgvtijera= (ImageView) findViewById(R.id.imgvTijera);
        //imgvincognita= (ImageView) findViewById(R.id.imgv);
        imgvusuario= (ImageView) findViewById(R.id.imgvUsuario);
        //imgvsistema= (ImageView) findViewById(R.id.imgvSistema);

        btnJugar= (Button) findViewById(R.id.btnJugar);
        btnReiniciar= (Button) findViewById(R.id.btnReiniciar);

        Integer q =imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView imgvSistema= (ImageView) findViewById(R.id.imgvSistema);

        //Inicio del Juego

        //Metodos para las imagenes

        imgvpiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvusuario.setImageResource(R.drawable.piedra);
            }
        });

        imgvpapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvusuario.setImageResource(R.drawable.papel);
            }
        });

        imgvtijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvusuario.setImageResource(R.drawable.tijera);
            }
        });

    }


}
