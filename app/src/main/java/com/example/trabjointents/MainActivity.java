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
    private EditText ps_password;
    private Button btn_returnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = findViewById(R.id.btn_login);
        et_usuario = (EditText)findViewById(R.id.et_usuario);
        ps_password = (EditText)findViewById(R.id.ps_password);
        btn_returnhome = findViewById(R.id.btn_returnhome);
    }

    public void Login(View view){

        String validador_nombre = et_usuario.getText().toString();
        String validador_password = ps_password.getText().toString();

        if(validador_nombre.length()==0){
            Toast.makeText(this, "Ingresar Usuario", Toast.LENGTH_LONG).show();
        }else if(validador_password.length()==0){
            Toast.makeText(this, "Ingresar password", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Registro valido",Toast.LENGTH_SHORT).show();
            Intent login = new Intent(this,Ejercicio1_1.class);
            login.putExtra("dato_nombre", et_usuario.getText().toString());
            startActivity(login);
        }



    }

    public void GoToInicio(View view){
        Intent gotohome = new Intent(this,Inicio.class);
        startActivity(gotohome);
    }



}
