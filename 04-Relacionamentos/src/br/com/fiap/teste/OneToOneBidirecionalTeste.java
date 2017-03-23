package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class OneToOneBidirecionalTeste {

	public static void main(String[] args) {
		//Buscar um grupo e exibir as propriedades do projeto
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		
		//Pesquisa pelo grupo de código 1
		GrupoAm grupo = dao.pesquisar(1);
		
		ProjetoAm projeto = grupo.getProjeto();
		
		System.out.println("Tema: " + projeto.getTema());
		System.out.println("Nota: " + projeto.getNota());
		
		em.close();
		System.exit(0);
		
	}
	
}
