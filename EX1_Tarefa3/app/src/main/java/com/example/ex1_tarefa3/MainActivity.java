package com.example.ex1_tarefa3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){
        int contador = 0;
        TextView soma = findViewById(R.id.clicks);
        contador++;
        soma.setText(" " + contador);

    }
}