package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROFESSOR")
@SequenceGenerator(name="seqProf",sequenceName="SQ_TB_PROFESSOR",allocationSize=1)
public class Professor {

	@Id
	@Column(name="CD_PROFESSOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProf")
	private int codigo;
	
	@Column(name="NM_PROFESSOR",nullable=false)
	private String nome;
	
	@Column(name="DT_ADMISSAO")
	@Temporal(TemporalType.DATE) //Somente a Data
	private Calendar dataAdmissao;
	
	@ManyToMany
	@JoinTable(name="TB_PROFESSOR_PROJETO",
		joinColumns=@JoinColumn(name="CD_PROFESSOR"),
		inverseJoinColumns=@JoinColumn(name="CD_PROJETO"))
	private List<ProjetoAm> projetos;
	
	@Column(name="VL_SALARIO")
	private float salario;
	
	public Professor() {
		super();
	}

	public Professor(int codigo, String nome, Calendar dataAdmissao, List<ProjetoAm> projetos, float salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.projetos = projetos;
		this.salario = salario;
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

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public List<ProjetoAm> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<ProjetoAm> projetos) {
		this.projetos = projetos;
	}
	
}
