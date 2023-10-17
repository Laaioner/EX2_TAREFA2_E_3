package com.example.ex2_tarefa2_e_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txNome, txIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txNome = findViewById(R.id.txtNome);
        txIdade = findViewById(R.id.txtIdade);

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        txNome.setText(nome);
        txIdade.setText(String.valueOf(idade));

    }
}