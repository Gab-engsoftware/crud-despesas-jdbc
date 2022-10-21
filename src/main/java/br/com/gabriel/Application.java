package br.com.gabriel;

import br.com.gabriel.dao.DespesaDAO;
import br.com.gabriel.model.Categoria;
import br.com.gabriel.model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();

        despesa.setDescricao("Curso Java");
        despesa.setCategoria(Categoria.EDUCACAO);
        despesa.setValor(1000);
        despesa.setData(LocalDate.of(2021,5,30));

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserida a despesa com id: " + despesaInserida.getId());
    }
}
