package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.BordaRecheada;
import br.com.fiap.entity.Pizza;
import br.com.fiap.entity.TamanhoPizza;

public class TesteCadastro {

	public static void main(String[] args) {
		//Criar o entity manager!!!
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		//Cadastrar uma pizza
		Pizza pizza = new Pizza(0, 32, "Carijó", 
				BordaRecheada.CATUPIRY, 
				TamanhoPizza.BROTINHO, 
				Calendar.getInstance(), 
				"Sem cortar", null);
		
		em.getTransaction().begin(); //inicia uma transação
		em.persist(pizza);
		em.getTransaction().commit();//finaliza com commit
		System.out.println("Pizza cadastrada!");
		System.exit(0);
	}
	
}
