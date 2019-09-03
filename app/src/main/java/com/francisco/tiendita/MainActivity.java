package com.francisco.tiendita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mbtnCrearCuenta;
    TextView mtvIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        mtvIniciarSesion = findViewById(R.id.tvIniciarSesion);
        mbtnCrearCuenta.setOnClickListener(this);
        mtvIniciarSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCrearCuenta:
                mostrarCrearCuenta();
                break;
            case R.id.tvIniciarSesion:
                mostrarInicioSesion();
                break;
        }
    }

    private void mostrarInicioSesion() {
        startActivity(new Intent(this, InicioSesionActivity.class));
        Toast.makeText(this, "HELLO TEXTVIEW", Toast.LENGTH_SHORT).show();
    }

    private void mostrarCrearCuenta() {
        startActivity(new Intent(this, CrearCuentaActivity.class));
        Toast.makeText(this, "HELLO BUTTON", Toast.LENGTH_SHORT).show();
    }

}
