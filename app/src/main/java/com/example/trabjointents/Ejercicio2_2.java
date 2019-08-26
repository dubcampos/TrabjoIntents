package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio2_2 extends AppCompatActivity {

    TextView tv_pantalla2;
    Button btn_siguiente;
    Button btn_anterior;
    Button btn_returnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_2);

        tv_pantalla2 = findViewById(R.id.tv_pantalla2);
        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_anterior = findViewById(R.id.btn_anterior);
        btn_returnhome = findViewById(R.id.btn_returnhome);
    }

    public void GoToPantalla3(View view){
        Intent gotop3 = new Intent(this,Ejercicio2_3.class);
        startActivity(gotop3);
    }

    public void GotoPantalla1(View view){
        Intent gotop1 = new Intent(this,Ejercicio2.class);
        startActivity(gotop1);
    }


}
