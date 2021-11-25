package com.example.ejemplo2cliclo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class terceraActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera3);

        TextView imcResultado = (TextView) findViewById(R.id.resultado);
        EditText imcAltura = (EditText) findViewById(R.id.tx_altura);
        EditText imcPeso = (EditText) findViewById(R.id.tx_peso);
        Button imcBoton = (Button) findViewById(R.id.button);

        imcBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String valorAltura = imcAltura.getText().toString();
                String valorPeso = imcPeso.getText().toString();
                float altura = Float.parseFloat(valorAltura);
                float peso = Float.parseFloat(valorPeso);
                float resultado = (peso/altura);
                imcResultado.setText(resultado+"");
            }
        });

    }
}