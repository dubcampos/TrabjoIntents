package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio2_2 extends AppCompatActivity {

    private TextView tv_pantalla2;
    private Button btn_siguiente;
    private Button btn_anterior;
    private Button btn_returnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_2);

        tv_pantalla2 = findViewById(R.id.tv_pantalla2);
        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_anterior = findViewById(R.id.btn_anterior);
        btn_returnhome = findViewById(R.id.btn_returnhome);

        String tv_original = tv_pantalla2.getText().toString();

        String mensaje = getIntent().getStringExtra("mensaje");
        tv_pantalla2.setText(mensaje);



        if(tv_pantalla2.getText().equals("")||tv_pantalla2.getText().equals("PANTALLA 3")){
            tv_pantalla2.setText(tv_original);
        }

    }

    public void GoToPantalla3(View view){
        Intent gotop3 = new Intent(this,Ejercicio2_3.class);
        startActivity(gotop3);
    }

    public void GotoPantalla1(View view){
        String temporal = tv_pantalla2.getText().toString();
        Intent gotop1 = new Intent(this,Ejercicio2.class);
        gotop1.putExtra("mensaje",temporal);
        startActivity(gotop1);;
    }

    public void GoToInicio(View view){
        Intent gotohome = new Intent(this,Inicio.class);
        startActivity(gotohome);
    }


}
