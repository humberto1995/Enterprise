package br.com.fiap.View;

import javax.swing.JOptionPane;

import br.com.fiap.bo.EstoqueBOStub;
import br.com.fiap.bo.EstoqueBOStub.ConsultorProduto;
import br.com.fiap.bo.EstoqueBOStub.ConsultorProdutoResponse;
import br.com.fiap.bo.EstoqueBOStub.ProdutoTO;

public class ConsoleViewListar {

	public static void main(String[] args) {
		try {
			EstoqueBOStub bo = new EstoqueBOStub();

			ConsultorProduto valores = new ConsultorProduto();
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
			valores.setCodProduto(codigo);

			ConsultorProdutoResponse response = bo.consultorProduto(valores);
			ProdutoTO produto = response.get_return();
			JOptionPane.showMessageDialog(null,
					"Descrição: " + produto.getDescricao() + "\nPreço: " + produto.getDescricao());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
