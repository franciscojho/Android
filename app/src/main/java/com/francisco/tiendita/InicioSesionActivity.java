package com.francisco.tiendita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class InicioSesionActivity extends AppCompatActivity implements View.OnClickListener {

    Button mbtnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        mbtnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        mbtnIniciarSesion.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_inicio_sesion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_Ayuda:
                mostrarAyuda();
                return true;
            case R.id.nav_Acerca_de:
                mostrarAcercaDe();
                return true;
            case R.id.nav_Informacion:
                mostrarInformacion();
                return true;
            case R.id.nav_Calculadora:
                mostrarCalculadora();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void mostrarInformacion() {
        startActivity(new Intent(this, InformacionActivity.class));
    }

    private void mostrarAcercaDe() {
        startActivity(new Intent(this, AcercadeActivity.class));
    }

    private void mostrarAyuda() {
        startActivity(new Intent(this, AyudaActivity.class));
    }

    private void mostrarCalculadora(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnIniciarSesion:
                mostrarEscritorio();
                break;
        }
    }

    private void mostrarEscritorio() {
        startActivity(new Intent(this, EscritorioActivity.class));
    }
}
