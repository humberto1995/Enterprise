package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {

	protected EntityManager em;
	protected Class<T> classe;

	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T tabela) {
		em.persist(tabela);
	}

	@Override
	public void salvar() throws DBException {
		try {
			// inicia a transação
			em.getTransaction().begin();
			// finaliza o commit
			em.getTransaction().commit();
		} catch (Exception e) {
			// verifica se a conecção esta ativa
			if (em.getTransaction().isActive()) {
				// realiza o rollback
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new DBException("Erro no Commit");
		}
	}

	@Override
	public T pesquisar(K codigo) {
		return em.find(classe, codigo);
	}

	@Override
	public void alterar(T tabela) {
		em.merge(tabela);
	}

	@Override
	public void remover(K codigo) throws IdNotFoundException {
		T tabela = pesquisar(codigo);
		if (tabela == null) {
			throw new IdNotFoundException("Entidade não encontrada");
		}
		em.remove(tabela);
	}

}
