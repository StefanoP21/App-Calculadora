package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaction;
    Fragment fragmentSuma, fragmentResta, fragmentMultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentSuma = new Suma();
        fragmentResta = new Resta();
        fragmentMultiplicacion = new Multiplicacion();
    }
    public void onClick(View view) {
        transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btnSuma:
                transaction.replace(R.id.contenedorFragments, fragmentSuma).commit();
                break;
            case R.id.btnResta:
                transaction.replace(R.id.contenedorFragments, fragmentResta).commit();
                break;
            case R.id.btnMultiplica:
                transaction.replace(R.id.contenedorFragments, fragmentMultiplicacion).commit();
                break;
        }
    }
}