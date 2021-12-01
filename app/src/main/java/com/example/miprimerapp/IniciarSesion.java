package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }
    //Metodo para el botón IniciarSesion de la Pagina Iniciar Sesión
    public void IniciarSesion(View view) {
        Intent IniciarSesion = new Intent(this, MenuDesplegable.class);
        startActivity(IniciarSesion);
    }
}