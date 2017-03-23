package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteBusca {

	public static void main(String[] args) {
		//Busca uma pizza
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		Pizza pizza = em.find(Pizza.class, 1);
		
		System.out.println(pizza.getSabor());
		
		pizza.setSabor("Marguerita");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.exit(0);
	}
	
}





