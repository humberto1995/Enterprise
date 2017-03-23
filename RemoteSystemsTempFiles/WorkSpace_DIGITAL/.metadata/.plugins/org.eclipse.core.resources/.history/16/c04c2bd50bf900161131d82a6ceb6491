package br.com.fiap.View;

import javax.swing.JOptionPane;

import org.apache.axis2.AxisFault;

import br.com.fiap.bo.EstoqueBOStub;
import br.com.fiap.bo.EstoqueBOStub.ConsultorProduto;
import br.com.fiap.bo.EstoqueBOStub.ConsultorProdutoResponse;

public class ConsoleView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			EstoqueBOStub estoque = new EstoqueBOStub();
			
			ConsultorProduto p = new ConsultorProduto();
			p.setCodProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Produto: ")));
			
			ConsultorProdutoResponse produtoResponse = estoque.consultorProduto(p);
			
			String descricao = produtoResponse.get_return().getDescricao();
			int quantidade = produtoResponse.get_return().getQuantidade();
			double valor = produtoResponse.get_return().getPrecoUnitario();
			
			System.out.println("Descrição: "+descricao+"\nQuantidade: "+quantidade+
					"\nValor unitário: "+valor);
			
		JOptionPane.showMessageDialog(null,"Descrição: "+descricao+"\nQuantidade: "+quantidade+
				"\nValor unitário: "+valor);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Produto não cadastrado");
		}

	}

}
