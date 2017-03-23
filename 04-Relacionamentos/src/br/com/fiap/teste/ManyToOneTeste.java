package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class ManyToOneTeste {

	public static void main(String[] args) {
		//Cadastrar grupo e quatro alunos
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		
		//Instanciar o grupo e os alunos
		GrupoAm grupo = new GrupoAm(0, "Barra Code");
		Aluno aluno1 = new Aluno(0, "Attos", 
				new GregorianCalendar(1987, Calendar.APRIL, 12), grupo);
		Aluno aluno2 = new Aluno(0, "Thiago", 
				new GregorianCalendar(1999, Calendar.SEPTEMBER, 29), grupo);
		Aluno aluno3 = new Aluno(0, "Kenzo", 
				new GregorianCalendar(1998, Calendar.JUNE, 9), grupo);
		Aluno aluno4 = new Aluno(0, "Rita", 
				new GregorianCalendar(1999, Calendar.DECEMBER, 25), grupo);
		/*
		//Criar uma lista de alunos e adiciona-los
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		//Coloca a lista de aluno no grupo
		grupo.setAlunos(alunos);
		*/
		grupo.addAluno(aluno1);
		grupo.addAluno(aluno2);
		grupo.addAluno(aluno3);
		grupo.addAluno(aluno4);
		
		dao.cadastrar(grupo);
		try {
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
}
