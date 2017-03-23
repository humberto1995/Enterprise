package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Campeonato;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Tecnico;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastraTudoTeste {
	public static void main(String[] args) {

		// Obter o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		// Instanciar um TimeDAOImpl
		TimeDAO dao = new TimeDAOImpl(em);

		// Instanciar a galera (entidades)
		Tecnico tecnico = new Tecnico("TITE Vulgo Adenor");

		List<Campeonato> campeonatos = new ArrayList<Campeonato>();
		campeonatos.add(new Campeonato("Libertadores"));

		Time time = new Time("Corinthians", new GregorianCalendar(1910, Calendar.SEPTEMBER, 1), 500, tecnico);
		time.addJogador(new Jogador("Sheik"));

		time.setCampeonatos(campeonatos);

		// Cadastrar e commit
		try {
			dao.cadastrar(time);
			dao.salvar();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		// Sucesso!
	}
}
