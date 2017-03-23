package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ServicoDAO;
import br.com.fiap.entity.Servico;

public class ServicoDAOImpl 
		extends GenericDAOImpl<Servico, Integer> 
								implements ServicoDAO {

	public ServicoDAOImpl(EntityManager em) {
		super(em);
	}

	
}