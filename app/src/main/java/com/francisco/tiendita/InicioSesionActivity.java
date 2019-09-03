package com.francisco.tiendita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class InicioSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
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
}
