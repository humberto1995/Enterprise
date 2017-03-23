package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CampeonatoDAO;
import br.com.fiap.entity.Campeonato;

public class CampeonatoDAOImpl extends GenericDAOImpl<Campeonato, Integer> implements CampeonatoDAO {

	public CampeonatoDAOImpl(EntityManager em) {
		super(em);
	}

}
