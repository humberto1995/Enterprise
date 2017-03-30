package br.com.fiap.dao;

import java.util.List;
import br.com.fiap.entity.Pacote;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> listar();
	
	List<Pacote> buscarPorQuantidadeDiasMinimo(int dias);
	
}