package com.example.buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button facil,medio,dific,extre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facil=findViewById(R.id.facil);
        medio=findViewById(R.id.medio);
        dific=findViewById(R.id.dificil);
        extre=findViewById(R.id.extremo);
        facil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2=new Intent(getApplicationContext(),facil.class);
                startActivity(intento2);
            }
        });
        medio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2=new Intent(getApplicationContext(), medio.class);
                startActivity(intento2);
            }
        });
        dific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2=new Intent(getApplicationContext(), dificil.class);
                startActivity(intento2);
            }
        });
        extre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2=new Intent(getApplicationContext(), extremo.class);
                startActivity(intento2);
            }
        });
    }
}
