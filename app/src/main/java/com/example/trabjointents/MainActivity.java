package com.example.trabjointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_login;
    private EditText et_usuario;
    private Button btn_returnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = findViewById(R.id.btn_login);
        et_usuario = findViewById(R.id.et_usuario);
        btn_returnhome = findViewById(R.id.btn_returnhome);
    }

    public void Login(View view){

        Intent login = new Intent(this,Ejercicio1_1.class);
        login.putExtra("dato_nombre", et_usuario.getText().toString());
        startActivity(login);

    }

}
