package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.entity.GrupoAm;

public class GrupoAmDAOImpl 
				extends GenericDAOImpl<GrupoAm, Integer> implements GrupoAmDAO{

	public GrupoAmDAOImpl(EntityManager em) {
		super(em);
	}

}