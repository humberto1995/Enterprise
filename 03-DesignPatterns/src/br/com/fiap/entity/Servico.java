package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_SERVICO")
@SequenceGenerator(name="seqServico",sequenceName="SQ_TB_SERVICO",allocationSize=1)
public class Servico {

	@Id
	@Column(name="CD_SERVICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqServico")
	private int codigo;
	
	@Column(name="NM_SERVICO",nullable=false)
	private String nome;
	
	@Column(name="VL_SERVICO",nullable=false)
	private double preco;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
