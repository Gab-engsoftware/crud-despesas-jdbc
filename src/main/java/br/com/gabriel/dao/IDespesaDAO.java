package br.com.gabriel.dao;

import br.com.gabriel.model.Categoria;
import br.com.gabriel.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {
    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findByid(Long id);
    List<Despesa> findByCategoria(Categoria categoria);
}
