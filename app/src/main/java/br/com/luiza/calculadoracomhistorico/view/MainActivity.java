package br.com.luiza.calculadoracomhistorico.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.luiza.calculadoracomhistorico.R;
import br.com.luiza.calculadoracomhistorico.controller.OperacaoControl;
import br.com.luiza.calculadoracomhistorico.model.Operacao;

public class MainActivity extends AppCompatActivity {

    private EditText etN1;
    private EditText etN2;

    private Operacao operacao;

    private OperacaoControl control;

    private ListView viewResultados;

    private List<String> resultados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicilizaElementos();
    }

    private void inicilizaElementos() {
        etN1 = findViewById(R.id.numero1);
        etN2 = findViewById(R.id.numero2);

        viewResultados = findViewById(R.id.resultados);

        operacao = new Operacao();

        control = new OperacaoControl();

        resultados = new ArrayList<>();
    }

    private void pegaElementosTela() {
        if (etN1.getText().toString().equals("") || etN1.getText() == null) {
            operacao.setN1(0.0);
        } else {
            operacao.setN1(Double.valueOf(etN1.getText().toString()));
        }
        if (etN2.getText().toString().equals("") || etN2.getText() == null) {
            operacao.setN2(0.0);
        } else {
            operacao.setN2(Double.valueOf(etN2.getText().toString()));
        }
    }

    public void calculaMultiplicacao(View view) {
        pegaElementosTela();
        operacao.setOperacao("*");
        control.multiplicar(operacao);
        mostraDadosNaTela();
        limpaCampos();
    }

    public void calculaDivisao(View view) {
        pegaElementosTela();
        operacao.setOperacao("/");
        control.dividir(operacao);
        mostraDadosNaTela();
        limpaCampos();
    }

    public void calculaSubtracao(View view) {
        pegaElementosTela();
        operacao.setOperacao("-");
        control.subtrair(operacao);
        mostraDadosNaTela();
        limpaCampos();
    }

    public void calculaAdicao(View view) {
        pegaElementosTela();
        operacao.setOperacao("+");
        control.adicionar(operacao);
        mostraDadosNaTela();
        limpaCampos();
    }

    private void limpaCampos() {
        etN1.setText("");
        etN2.setText("");
        operacao = new Operacao();
    }

    private void mostraDadosNaTela() {
        resultados.add(operacao.getN1() + operacao.getOperacao() + operacao.getN2() + " = " + operacao.getResultado());

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, resultados);
        viewResultados.setAdapter(arrayAdapter);
    }
}
