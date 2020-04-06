package br.com.luiza.calculadoracomhistorico.controller;

import br.com.luiza.calculadoracomhistorico.model.Operacao;

public class OperacaoControl {
    public Double multiplicar(Operacao operacao) {
        operacao.setResultado(operacao.getN1() * operacao.getN2());
        return operacao.getResultado();
    }

    public Double dividir(Operacao operacao) {
        operacao.setResultado(operacao.getN1() / operacao.getN2());
        return operacao.getResultado();
    }

    public Double subtrair(Operacao operacao) {
        operacao.setResultado(operacao.getN1() - operacao.getN2());
        return operacao.getResultado();
    }

    public Double adicionar(Operacao operacao) {
        operacao.setResultado(operacao.getN1() + operacao.getN2());
        return operacao.getResultado();
    }
}
