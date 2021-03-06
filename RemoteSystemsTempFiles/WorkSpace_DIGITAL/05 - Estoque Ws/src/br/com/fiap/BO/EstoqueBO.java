package br.com.fiap.BO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.AxisFault;

import br.com.fiap.TO.ProdutoTO;

public class EstoqueBO {

	private Map<Integer, ProdutoTO> banco = new HashMap<>();

	public EstoqueBO() {
		banco.put(401, new ProdutoTO(401, "Camiseta Masculina Manga Curta Branca", 50, 1));
		banco.put(402, new ProdutoTO(402, "Camiseta Feminina Manga Longa Rosa", 10000, 1));
	}

	public ProdutoTO consultorProduto(int codProduto) throws AxisFault {
		ProdutoTO prod = banco.get(codProduto);
		if (prod == null)
			throw new AxisFault("Produto n�o Encontrado");
		return prod;
	}

	public List<ProdutoTO> listar() {
		return new ArrayList<>(banco.values());
	}

}
