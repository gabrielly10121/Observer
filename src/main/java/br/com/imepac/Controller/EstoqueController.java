package br.com.imepac.Controller;

import br.com.imepac.Entidades.Estoque;
import br.com.imepac.Service.EstoqueService;

public class EstoqueController {

    private EstoqueService estoqueService;

    public EstoqueController() {
        this.estoqueService = new EstoqueService();
    }

    public void createEstoque(String produto, double valor) {
        Estoque estoque = new Estoque(produto, valor);
        estoqueService.addEstoque(estoque);
    }

    public void listEstoques() {
        for (Estoque estoque : estoqueService.getEstoques()) {
            System.out.println("Produto: " + estoque.getProduto() + ", Valor: " + estoque.getValor());
        }
    }

}
