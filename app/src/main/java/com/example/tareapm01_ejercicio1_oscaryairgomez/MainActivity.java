package com.example.tareapm01_ejercicio1_oscaryairgomez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button btnsuma, btnresta, btnmultiplicacion, btndivision;

    EditText num1, num2;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuma = (Button) findViewById(R.id.btnSuma);
        btnresta = (Button) findViewById(R.id.btnResta);
        btnmultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
        btndivision = (Button) findViewById(R.id.btnDivision);
           num1 = findViewById(R.id.n1);
           num2 = findViewById(R.id.n2);



        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero1suma = num1.getText().toString();
                String numero2suma  = num2.getText().toString();

                if (numero1suma.isEmpty() || numero2suma.isEmpty()) {


                    Toast.makeText(MainActivity.this, "Es necesario llenar los dos espacios, gracias", Toast.LENGTH_SHORT).show();
                } else {
                    int numero1 = Integer.parseInt(num1.getText().toString());
                    int numero2 = Integer.parseInt(num2.getText().toString());
                    int resultado = numero1 + numero2;

                    String resultsuma = "La suma de los números " + numero1 + " + " + numero2 + " es:  " ;


                    Intent intentsuma = new Intent(getApplicationContext(), Operaciones.class);
                    intentsuma.putExtra("suma", resultsuma);
                    intentsuma.putExtra("resultado", resultado);
                    startActivity(intentsuma);

                }
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1resta = num1.getText().toString();
                String numero2resta = num2.getText().toString();

                if (numero1resta.isEmpty() || numero2resta.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Es necesario llenar los dos espacios, gracias", Toast.LENGTH_SHORT).show();
                } else {
                    int numero1 = Integer.parseInt(num1.getText().toString());
                    int numero2 = Integer.parseInt(num2.getText().toString());
                    int resultado = numero1 - numero2;

                    String resultresta = "La resta de los números " + numero1 + " - " + numero2 + " es:  ";

                    Intent intentresta = new Intent(getApplicationContext(), Operaciones.class);
                    intentresta.putExtra("resta", resultresta);
                    intentresta.putExtra("resultado", resultado);

                    startActivity(intentresta);
                }
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1multiplicacion = num1.getText().toString();
                String numero2multiplicacion = num2.getText().toString();

                if (numero1multiplicacion.isEmpty() || numero2multiplicacion.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Es necesario llenar los dos espacios, gracias", Toast.LENGTH_SHORT).show();
                } else {
                    int numero1 = Integer.parseInt(num1.getText().toString());
                    int numero2 = Integer.parseInt(num2.getText().toString());
                    int resultado = numero1 * numero2;

                    String resultmultiplicacion  = "La multiplicacion de los números " + numero1 + " * " + numero2 + " es:  ";

                    Intent intentmultiplicacion = new Intent(getApplicationContext(), Operaciones.class);
                    intentmultiplicacion.putExtra("multiplicacion", resultmultiplicacion);
                    intentmultiplicacion.putExtra("resultado", resultado);
                    startActivity(intentmultiplicacion);
                }
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1division = num1.getText().toString();
                String numero2division = num2.getText().toString();

                if (numero1division.isEmpty() || numero2division.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Es necesario llenar los dos espacios, gracias", Toast.LENGTH_SHORT).show();
                } else {
                    Double numero1 = Double.parseDouble(num1.getText().toString());
                    Double numero2 = Double.parseDouble(num2.getText().toString());
                    Double resultado = numero1 / numero2;

                    String resultdivision = "La division entre los números " + numero1 + " / " + numero2 + " es:  ";


                    Intent intentdivision = new Intent(getApplicationContext(), Operaciones.class);
                    intentdivision.putExtra("division", resultdivision);
                    intentdivision.putExtra("resultado", resultado);
                    startActivity(intentdivision);
                }
            }
        });
    }
}