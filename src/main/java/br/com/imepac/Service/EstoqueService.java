package br.com.imepac.Service;


import br.com.imepac.Entidades.Estoque;
import br.com.imepac.Repository.EstoqueRepository;

import java.util.List;

public class EstoqueService {

    private EstoqueRepository estoqueRepository;

    public EstoqueService() {
        this.estoqueRepository = new EstoqueRepository();
    }

    public void addEstoque(Estoque estoque) {
        estoqueRepository.save(estoque);
    }

    public List<Estoque> getEstoques() {
        return estoqueRepository.findAll();
    }
}
