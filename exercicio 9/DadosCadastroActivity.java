package com.example.exemplocomponentes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Funcionario;

public class DadosCadastroActivity extends AppCompatActivity {
    TextView tvNome, tvAreaAtuacao, tvSexo, tvNotificacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dados_cadastro);
        tvNome = (TextView) findViewById(R.id.lblNome);
        tvAreaAtuacao = (TextView) findViewById(R.id.lblAreaAtuacao);
        tvSexo = (TextView) findViewById(R.id.lblSexo);
        tvNotificacao = (TextView) findViewById(R.id.lblNotificacao);

        Bundle dados = getIntent().getExtras();
        Funcionario funcionario = (Funcionario) dados.getSerializable("objetoFuncionario");
        tvNome.setText(funcionario.getNome());
        tvAreaAtuacao.setText(funcionario.getAreaAtuacao());
        tvSexo.setText(funcionario.getSexo());
        tvNotificacao.setText(funcionario.getNotificacao());
    }
}