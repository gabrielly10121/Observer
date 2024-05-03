package br.com.imepac.Entidades;

public class Gerente {

    private String nome;
    private double valorLimite;

    public Gerente(String nome, double valorLimite) {
        this.nome = nome;
        this.valorLimite = valorLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
}
