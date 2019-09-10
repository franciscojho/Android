package com.francisco.tiendita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class InformacionActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton mrbVision, mrbMision, mrbHistoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        mrbVision = findViewById(R.id.rbVision);
        mrbMision = findViewById(R.id.rbMision);
        mrbHistoria = findViewById(R.id.rbHistoria);

        mrbVision.setOnClickListener(this);
        mrbMision.setOnClickListener(this);
        mrbHistoria.setOnClickListener(this);
        mostrarMision();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rbVision:
                mostrarVision();
                break;
            case R.id.rbMision:
                mostrarMision();
                break;
            case R.id.rbHistoria:
                mostrarhistoria();
                break;
        }
    }

    private void mostrarhistoria() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.llcontenedor, new HistoriaFragment())
                .commit();
    }

    private void mostrarMision() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.llcontenedor, new MisionFragment())
                .commit();
    }

    private void mostrarVision() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.llcontenedor, new VisionFragment())
                .commit();
    }
}
