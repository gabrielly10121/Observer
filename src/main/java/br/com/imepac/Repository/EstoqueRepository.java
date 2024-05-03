package br.com.imepac.Repository;


import br.com.imepac.Entidades.Estoque;
import java.util.ArrayList;
import java.util.List;

public class EstoqueRepository {

    private List<Estoque> estoques = new ArrayList<>();

    public void save(Estoque estoque) {
        estoques.add(estoque);
    }

    public List<Estoque> findAll() {
        return estoques;
    }
}
