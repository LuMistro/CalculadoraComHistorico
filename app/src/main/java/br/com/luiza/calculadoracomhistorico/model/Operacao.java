package br.com.luiza.calculadoracomhistorico.model;

public class Operacao {

    private Double n1;
    private Double n2;
    private Double resultado;
    private String operacao;

    public Operacao() {
    }

    public Operacao(Double n1, Double n2, Double resultado, String operacao) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
        this.operacao = operacao;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
