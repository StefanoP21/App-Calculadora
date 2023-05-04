package com.example.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
public class Suma extends Fragment {
    public Suma() {
    }
    Button btnRegresar, btnValidar;
    EditText edt1, edt2, edt3;
    TextView txvRespuesta;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_suma,container,false);
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnRegresar = view.findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(this::onClick);

        btnValidar = view.findViewById(R.id.btnValidar);
        btnValidar.setOnClickListener(this::validar);

        edt1 = view.findViewById(R.id.edt1);
        edt2 = view.findViewById(R.id.edt2);
        edt3 = view.findViewById(R.id.edt3);
        txvRespuesta = view.findViewById(R.id.txvRespuesta);
    }
    public void onClick(View view) {
        startActivity(new Intent(view.getContext(),MainActivity.class));
    }
    public void validar(View view) {
        int num1 = Integer.parseInt(edt1.getText().toString());
        int num2 = Integer.parseInt(edt2.getText().toString());
        int num3 = Integer.parseInt(edt3.getText().toString());

        int suma = num1 + num2;
        if (suma == num3) {
            txvRespuesta.setText("La suma es correcta");
        }
        else {
            txvRespuesta.setText("La suma es incorrecta, el resultado de " + num1 + " + " + num2 + " es: " + suma);
            edt1.setText("");
            edt2.setText("");
            edt3.setText("");
            edt1.requestFocus();
        }
    }
}