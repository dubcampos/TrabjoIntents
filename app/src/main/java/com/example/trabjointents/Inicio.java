package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Inicio extends AppCompatActivity {

    Button btn_ejercicio1;
    Button btn_ejercicio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btn_ejercicio1 = findViewById(R.id.btn_ejercicio1);
        btn_ejercicio2 = findViewById(R.id.btn_ejercicio2);
    }

    public void GoToEjercicio1(View view){
        Intent gotoe1 = new Intent(this,MainActivity.class);
        startActivity(gotoe1);
    }

    public void GoToEjercicio2(View view){
        Intent gotoe2 = new Intent(this,Ejercicio2.class);
        startActivity(gotoe2);
    }
}
