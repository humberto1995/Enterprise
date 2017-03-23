package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProfessorDAO;
import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.ProfessorDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.Professor;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class ManyToManyTeste {

	public static void main(String[] args) {
		//Cadastrar um projeto, grupos e orientadores:
		//Obter o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar dois grupos
		GrupoAm grupo1 = new GrupoAm(0, "Grupo 1");
		GrupoAm grupo2 = new GrupoAm(0, "Grupo 2");
		
		//Instanciar dois projetos passando o grupo
		ProjetoAm projeto1 = new ProjetoAm(0, "Tema 1", 0, Calendar.getInstance(), 
				new GregorianCalendar(2017,Calendar.OCTOBER,10), grupo1);
		ProjetoAm projeto2 = new ProjetoAm(0, "Tema 2", 0, Calendar.getInstance(),
				new GregorianCalendar(2017,Calendar.OCTOBER,10),grupo2);
		
		//Instanciar dois professores
		Professor prof1 = new Professor(0,"Humberto",
				new GregorianCalendar(2014,Calendar.JANUARY,10),null,10000);
		Professor prof2 = new Professor(0, "Rita",
				new GregorianCalendar(2000,Calendar.JANUARY,2),null,15000);
		
		//Relacionar o projeto com os professores
		/*List<Professor> professores = new ArrayList<Professor>();
		professores.add(prof1);
		professores.add(prof2);
		
		projeto1.setOrientadores(professores);
		projeto2.setOrientadores(professores);
		*/
		
		//Relacionar os professores com o projeto
		List<ProjetoAm> projetos = new ArrayList<ProjetoAm>();
		projetos.add(projeto1);
		projetos.add(projeto2);
		
		prof1.setProjetos(projetos);
		prof2.setProjetos(projetos);
		
		//Instanciar o DAO do projeto e do professor
		ProjetoAmDAO projetoDao = new ProjetoAmDAOImpl(em);
		ProfessorDAO profDao = new ProfessorDAOImpl(em);
		
		//Cadastrar os professores
		profDao.cadastrar(prof1);
		profDao.cadastrar(prof2);
		
		//Cadastrar os projetos
		projetoDao.cadastrar(projeto1);
		projetoDao.cadastrar(projeto2);
		
		//Commit
		try {
			projetoDao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		//Sucesso!
		em.close();
		System.exit(0);
	}
	
}
