package com.example.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    TextView textoSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoSaludo =(TextView) findViewById(R.id.textHola);
        textoSaludo.setText("Ciclo de vida activity....");

        logAndAppend(etapa:"on create");
    }

    //comentario metodo etapa ciclo de vida

    @Override
    protected void onPause() {
        super.onPause();
        logAndAppend(etapa:"on pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logAndAppend(etapa:"on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logAndAppend(etapa:"on resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logAndAppend(etapa:"on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logAndAppend(etapa:"on restar");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logAndAppend(etapa:"on destroy");
    }

    private void logAndAppend(String etapa){
        Log.d( tag: "INFO Ejemplo", msg: "ETAPA CICLO DE VIDA"+etapa);
        textoSaludo.append("\nETAPA: "+ etapa);
    }

}