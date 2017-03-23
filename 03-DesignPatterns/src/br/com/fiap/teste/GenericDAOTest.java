package br.com.fiap.teste;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import br.com.fiap.dao.ServicoDAO;
import br.com.fiap.dao.impl.ServicoDAOImpl;
import br.com.fiap.entity.Servico;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class GenericDAOTest {
	
	@Test
	public void cadastroTest() {
		//Chamar o entityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instanciar os objetos
		ServicoDAO dao = new ServicoDAOImpl(em);
		Servico servico = new Servico();
		servico.setNome("Banho");
		servico.setPreco(40);
		
		try {
			//Chamar o servi�o / cadastrar
			dao.cadastrar(servico);
			dao.salvar();
			//Testar o resultado
			Assert.assertNotEquals(servico.getCodigo(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {
			em.close();
		}
	}

	@Test
	public void buscaTest(){
		//Instanciar o servicoDAO
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ServicoDAO dao = new ServicoDAOImpl(em);
		
		Servico servico = new Servico();
		servico.setNome("Tosa");
		servico.setPreco(40);
		
		try {
			//Cadastrar o servi�o
			dao.cadastrar(servico);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");
		}
		
		//Chamar o m�todo buscar do dao
		Servico busca = dao.pesquisar(servico.getCodigo());
		
		//Valida se encontrou o servi�o no banco
		Assert.assertNotNull(busca);
		
		em.close();
	}
	
	@Test
	public void removeTest(){
		//Instanciar os objetos
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ServicoDAO dao = new ServicoDAOImpl(em);
		
		Servico servico = new Servico();
		servico.setNome("Hospedagem");
		servico.setPreco(150);
		
		try {
			//Cadastrar um servi�o
			dao.cadastrar(servico);
			dao.salvar();
			
			//Remover um servi�o
			dao.remover(servico.getCodigo());
			dao.salvar();
			
			//Testar o resultado
			Servico busca = dao.pesquisar(servico.getCodigo());
			Assert.assertNull(busca);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			em.close();
		}
	}
	
	@Test
	public void atualizaTest(){
		//Inicializa os objetos
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ServicoDAO dao = new ServicoDAOImpl(em);
		
		Servico servico = new Servico();
		servico.setNome("Banho e Tosa");
		servico.setPreco(100);
		
		try {
			//Cadastra o servi�o
			dao.cadastrar(servico);
			dao.salvar();
			
			//Atualiza o servi�o
			servico.setPreco(50);
			servico.setNome("Jantar");
			
			dao.alterar(servico);
			dao.salvar();
			
			//Valida se as altera��es foram realizadas
			Servico busca = dao.pesquisar(servico.getCodigo());
			
			Assert.assertEquals(busca.getPreco(), servico.getPreco(), 0.0);
			Assert.assertEquals(busca.getNome(), servico.getNome());
			
		} catch (DBException e) {
			e.printStackTrace();
		} finally{
			em.close();
		}
	}
}





