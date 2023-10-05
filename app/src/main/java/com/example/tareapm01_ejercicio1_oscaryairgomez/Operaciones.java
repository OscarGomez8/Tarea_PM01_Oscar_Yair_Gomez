package com.example.tareapm01_ejercicio1_oscaryairgomez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operaciones extends AppCompatActivity {

    Button btnRegresar;
    EditText resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        resultados = (EditText) findViewById(R.id.txtMensaje);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);

        //AQUI SE EJECUTA LA SUMA DE LOS NUMEROS INGRESADOS
        Intent intentsuma = getIntent();
        Integer Suma = intentsuma.getIntExtra("resultado", 0);

        Intent intentSuma = getIntent();
        String suma = intentSuma.getStringExtra("suma");

        //AQUI SE EJECUTA LA RESTA DE LOS NUMEROS INGRESADOS
        Intent intentresta = getIntent();
        Integer Resta = intentresta.getIntExtra("resultado", 0);

        Intent intentResta = getIntent();
        String resta = intentResta.getStringExtra("resta");

        //AQUI SE EJECUTA LA MULTIPLICACION DE LOS NUMEROS INGRESADOS
        Intent intentmultiplicacion = getIntent();
        Integer Multiplicacion  = intentresta.getIntExtra("resultado", 0);

        Intent intentMultiplicacion = getIntent();
        String multiplicacion  = intentResta.getStringExtra("multiplicacion");

        //AQUI SE EJECUTA LA DIVISION DE LOS NUMEROS INGRESADOS
        Intent intentdivision = getIntent();
        Double Division = intentdivision.getDoubleExtra("resultado", 0);

        Intent intentDivision = getIntent();
        String division = intentDivision.getStringExtra("division");

        if (Suma != null && suma != null) {
            resultados.setText(suma + "" + Suma);
        }
        else if (Resta != null && resta != null) {
            resultados.setText(resta + "" + Resta);
        }
        else if (Multiplicacion != null && multiplicacion != null) {
            resultados.setText(multiplicacion + "" + Multiplicacion);
        }
        else if (Division != null && division != null) {
            resultados.setText(division + "" + Division);
        }

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentregresar = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentregresar);
            }
        });


    }
}