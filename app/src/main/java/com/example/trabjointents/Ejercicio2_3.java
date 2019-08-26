package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ejercicio2_3 extends AppCompatActivity {

    private Button btn_siguiente;
    private Button btn_anterior;
    private Button btn_returnhome;
    private TextView tv_pantalla3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_3);

        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_anterior = findViewById(R.id.btn_anterior);
        btn_returnhome = findViewById(R.id.btn_returnhome);
        tv_pantalla3 = (TextView) findViewById(R.id.tv_pantalla3);

        String tv_original = tv_pantalla3.getText().toString();

        String mensaje = getIntent().getStringExtra("mensaje");
        tv_pantalla3.setText(mensaje);



        if(tv_pantalla3.getText().equals("")){
            tv_pantalla3.setText(tv_original);
        }


    }

    public void GoToPantalla2(View view){
        String temporal = tv_pantalla3.getText().toString();
        Intent gotop2 = new Intent(this,Ejercicio2_2.class);
        gotop2.putExtra("mensaje",temporal);
        startActivity(gotop2);
    }

    public void GoToPantalla4(View view){
        Intent gotop4 = new Intent(this,Ejercicio2_4.class);
        startActivity(gotop4);
    }

    public void GoToInicio(View view){
        Intent gotohome = new Intent(this,Inicio.class);
        startActivity(gotohome);
    }
}
