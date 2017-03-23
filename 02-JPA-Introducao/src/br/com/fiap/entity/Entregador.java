package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_ENTREGADOR")
@SequenceGenerator(name="seqEntregador",sequenceName="SQ_ENTREGADOR",allocationSize=1)
public class Entregador {

	@Id
	@Column(name="CD_ENTREGADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqEntregador")	
	private int codigo;
	
	@Column(name="NM_ENTREGADOR",length=150,nullable=false)
	private String nome;
	
	@Column(name="DS_PLACA")
	private String placa;
	
	@Column(name="NR_HABILITACAO")
	private String habilitacao;
	
	@Column(name="NR_CPF",nullable=false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_CONTRATACAO")
	private Calendar dataContratacao;
	
	@Column(name="DS_PERIODO")
	private Periodo periodo;
	
	public Entregador() {
		super();
	}

	public Entregador(int codigo, String nome, String placa, String habilitacao, String cpf, Calendar dataContratacao,
			Periodo periodo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.placa = placa;
		this.habilitacao = habilitacao;
		this.cpf = cpf;
		this.dataContratacao = dataContratacao;
		this.periodo = periodo;
	}

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
}
