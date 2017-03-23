package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.JogadorDAO;
import br.com.fiap.entity.Jogador;

public class JogadorDAOImpl extends GenericDAOImpl<Jogador,Integer> implements JogadorDAO{

	public JogadorDAOImpl(EntityManager em) {
		super(em);
	}

}
