package br.com.fiap.dao;

import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T,K> {

	void cadastrar(T tabela);
	void salvar() throws DBException;
	T pesquisar(K codigo);
	void alterar(T tabela);
	void remover(K codigo)throws IdNotFoundException;
	
}
