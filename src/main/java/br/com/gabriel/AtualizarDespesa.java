package br.com.gabriel;

import br.com.gabriel.dao.DespesaDAO;
import br.com.gabriel.model.Categoria;
import br.com.gabriel.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findByid(3L);

        Despesa despesa = despesaOptional.get();

        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        despesa.setDescricao("Hortfruti");
        despesa.setData(LocalDate.of(2021,05,14));
        despesa.setValor(150);
        despesa.setCategoria(Categoria.OUTROS);

        dao.update(despesa);
    }

}
