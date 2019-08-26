package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio2_4 extends AppCompatActivity {

    private Button btn_anterior;
    private Button btn_returnhome;
    private EditText et_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_4);

        btn_anterior = findViewById(R.id.btn_anterior);
        btn_returnhome = findViewById(R.id.btn_returnhome);
        et_datos = (EditText) findViewById(R.id.et_datos);
    }

    public void GoToPantalla3(View view){
        String temporal = et_datos.getText().toString();
        Intent gotop3 = new Intent(this,Ejercicio2_3.class);
        gotop3.putExtra("mensaje",temporal);
        startActivity(gotop3);
    }

    public void GoToInicio(View view){
        Intent gotohome = new Intent(this,Inicio.class);
        startActivity(gotohome);
    }
}
