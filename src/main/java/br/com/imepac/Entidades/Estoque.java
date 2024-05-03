package br.com.imepac.Entidades;

public class Estoque {

        private String produto;
        private double valor;

        public Estoque(String produto, double valor) {
            this.produto = produto;
            this.valor = valor;
        }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
