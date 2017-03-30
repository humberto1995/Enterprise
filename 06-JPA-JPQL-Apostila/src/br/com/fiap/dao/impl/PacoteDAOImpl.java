package br.com.fiap.dao.impl;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> listar() {
		 TypedQuery<Pacote> query = 
				 em.createQuery("from Pacote",Pacote.class);
		 return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorQuantidadeDiasMinimo(int dias) {
		TypedQuery<Pacote> query = //Nome da Classe e do atributo
				em.createQuery("from Pacote p where p.qtdDias >= :churros",Pacote.class);
		query.setParameter("churros", dias);		
		return query.getResultList();
	}

}







