package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name="seqCliente",sequenceName="SQ_TB_CLIENTE",allocationSize=1)
public class Cliente {

	@Id
	@Column(name="CD_CLIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqCliente")
	private int codigo;
	
	@Column(name="NM_CLIENTE",nullable=false)
	private String nome;

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
	
}
