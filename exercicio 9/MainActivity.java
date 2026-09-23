package com.example.exemplocomponentes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Funcionario;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    CheckBox checkBackEnd, checkFrontEnd;
    RadioButton rdMasculino, rdFeminino;
    Switch switchNotificacao;
    Button btnEnviar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtNome = (EditText) findViewById(R.id.txtNome);
        checkFrontEnd = (CheckBox) findViewById(R.id.chkFrontEnd);
        checkBackEnd = (CheckBox) findViewById(R.id.chkBackEnd);
        RadioGroup radioGroupSexo = (RadioGroup) findViewById(R.id.rdGrupoSexo);
        RadioButton radioMasculino = (RadioButton) findViewById(R.id.rdMasculino);
        RadioButton radioFeminino = (RadioButton) findViewById(R.id.rdFeminino);
        switchNotificacao = (Switch) findViewById(R.id.swNotificacao);
        btnEnviar = (Button) findViewById(R.id.cmdEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, DadosCadastroActivity.class);
                startActivity(intencao);
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(edtNome.getText().toString());
                String areaAtuacao="";
                if(checkFrontEnd.isChecked()){
                    areaAtuacao = areaAtuacao + "|";
                }
                startActivity(intencao);
            }
        });


    }
}