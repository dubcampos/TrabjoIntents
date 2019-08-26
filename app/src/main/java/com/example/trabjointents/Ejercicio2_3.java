package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ejercicio2_3 extends AppCompatActivity {

    Button btn_siguiente;
    Button btn_anterior;
    Button btn_returnhome;
    TextView tv_pantalla3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_3);

        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_anterior = findViewById(R.id.btn_anterior);
        btn_returnhome = findViewById(R.id.btn_returnhome);
        tv_pantalla3 = findViewById(R.id.tv_pantalla3);


    }

    public void GoToPantalla2(View view){
        Intent gotop2 = new Intent(this,Ejercicio2_2.class);
        startActivity(gotop2);
    }

    public void GoToPantalla4(View view){
        Intent gotop4 = new Intent(this,Ejercicio2_4.class);
        startActivity(gotop4);
    }
}
