package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	public static void main(String[] args) {

		//Executar a listagem de pacotes
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		List<Pacote> lista = dao.listar();
		System.out.println("LISTAGEM");
		for (Pacote pacote : lista) {
			System.out.println(pacote.getDescricao() + " R$" + pacote.getPreco() + " Dias: " + pacote.getQtdDias());
		}
		
		System.out.println("BUSCA POR QUANTIDADE DE DIAS MINIMO");
		lista = dao.buscarPorQuantidadeDiasMinimo(9);
		for (Pacote pacote : lista) {
			System.out.println(pacote.getDescricao() + " R$" + pacote.getPreco() + " Dias: " + pacote.getQtdDias());
		}
		
		em.close();
		System.exit(0);
	}
}
