package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqPacote", sequenceName="SEQ_PACOTE", allocationSize=1)
public class Pacote {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqPacote")
	private int id;
	
	@Column(nullable=false)
	private String descricao;
	
	@Column(name="DT_SAIDA",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataSaida;
	
	@Column(name="QDT_DIAS")
	private int qtdDias;
	
	private float preco;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Transporte transporte;
	
	public Pacote(String descricao, Calendar dataSaida, int qtdDias, float preco, Transporte transporte) {
		super();
		this.descricao = descricao;
		this.dataSaida = dataSaida;
		this.qtdDias = qtdDias;
		this.transporte = transporte;
		this.preco = preco;
	}
	
	public Pacote() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}

	public int getId() {
		return id;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
