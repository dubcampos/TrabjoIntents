package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Ejercicio1_1 extends AppCompatActivity {

    private TextView tv_usuario;
    private Button btn_atras;
    private Button btn_returnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1_1);

        tv_usuario = (TextView) findViewById(R.id.tv_usuario);
        btn_returnhome = findViewById(R.id.btn_returnhome);
        btn_atras = findViewById(R.id.btn_atras);


        String temporal = getIntent().getStringExtra("dato_nombre");
        tv_usuario.setText("¡Bienvenidx "+ temporal+"!");

    }

    public void Atras(View view){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}
