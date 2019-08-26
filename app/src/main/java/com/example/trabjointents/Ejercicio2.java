package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    private Button btn_sigueinte;
    private Button btn_returnhome;
    private TextView tv_pantalla1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        btn_sigueinte = findViewById(R.id.btn_siguiente);
        btn_returnhome = findViewById(R.id.btn_returnhome);
        tv_pantalla1 = findViewById(R.id.tv_pantalla1);

        String tv_original = tv_pantalla1.getText().toString();

        String mensaje = getIntent().getStringExtra("mensaje");
        tv_pantalla1.setText(mensaje);



        if(tv_pantalla1.getText().equals("")||tv_pantalla1.getText().equals("PANTALLA 2")){
            tv_pantalla1.setText(tv_original);
        }

    }

    public void GoToPantalla2(View view){
        Intent gotop2 = new Intent(this,Ejercicio2_2.class);
        startActivity(gotop2);
    }

    public void GoToInicio(View view){
        Intent gotohome = new Intent(this,Inicio.class);
        startActivity(gotohome);
    }
}
