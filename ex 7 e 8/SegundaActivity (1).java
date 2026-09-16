package com.example.exemploenviodadoscadastro;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Pessoa;

public class SegundaActivity extends AppCompatActivity {
    TextView tvnome, tvEmail, tvTelefone, tvIdade, tvIniciais;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        tvnome = findViewById(R.id.lblNomeValor);
        tvEmail = findViewById(R.id.lblEmailValor);
        tvTelefone = findViewById(R.id.lblTelefoneValor);
        tvIdade = findViewById(R.id.lblIdadeValor);
        tvIniciais = findViewById(R.id.lblIniciais);
        Bundle dados = getIntent().getExtras();
        Pessoa pessoa = (Pessoa)dados.getSerializable("objetoPessoa");

        tvnome.setText(pessoa.getNome());
        tvEmail.setText(pessoa.getEmail());
        tvTelefone.setText(pessoa.getTelefone());
        tvIdade.setText(String.valueOf(pessoa.getIdade()));
        tvIniciais.setText(String.valueOf(pessoa.getIniciais()));
    }
}