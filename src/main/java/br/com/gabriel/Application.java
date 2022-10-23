package br.com.gabriel;

import br.com.gabriel.dao.DespesaDAO;
import br.com.gabriel.model.Categoria;
import br.com.gabriel.model.Despesa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

//        Despesa despesa = new Despesa();
//        despesa.setDescricao("Pagamento do Condominio");
//        despesa.setCategoria(Categoria.MORADIA);
//        despesa.setValor(270);
//        despesa.setData(LocalDate.of(2021,06,10));
//
//        dao.save(despesa);

//        List<Despesa> despesas = dao.findAll();
//        for (Despesa despesa : despesas) {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Data: " + despesa.getData());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("Categoria: " + despesa.getCategoria());
//            System.out.println("===========================================");
//        }

//        Optional<Despesa> despesaOptional = dao.findByid(4L);
//        despesaOptional.ifPresent(despesa -> {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Data: " + despesa.getData());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("Categoria: " + despesa.getCategoria());
//        });

//        List<Despesa> despesas = dao.findByCategoria(Categoria.ALIMENTACAO);
//        for (Despesa despesa : despesas) {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Data: " + despesa.getData());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("Categoria: " + despesa.getCategoria());
//
//            System.out.println("===========================================");
//        }
    }
}
