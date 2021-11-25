package com.example.ejemplo2cliclo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = (TextView) findViewById(R.id.texto);
        Button enviar = (Button) findViewById(R.id.btn_enviar);
        texto.setText("antes de click");

        enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                texto.setText("click realizado");
            }
        });
    }
}