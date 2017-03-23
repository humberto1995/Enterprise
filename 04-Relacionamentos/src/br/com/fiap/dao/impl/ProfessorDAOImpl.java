package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProfessorDAO;
import br.com.fiap.entity.Professor;

public class ProfessorDAOImpl extends GenericDAOImpl<Professor, Integer> implements ProfessorDAO{

	public ProfessorDAOImpl(EntityManager em) {
		super(em);
	}

}
