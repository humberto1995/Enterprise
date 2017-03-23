package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteAtualizacao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		//Busca a pizza no BD com código 1
		Pizza pizza = em.find(Pizza.class, 1);
		
		pizza.setPreco(50);
		
		em.getTransaction().begin();
		em.merge(pizza);
		em.getTransaction().commit();
		
		System.out.println("Pizza atualizada!");
		System.exit(0);
		
	}
	
}





