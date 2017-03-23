package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="seqProjeto",sequenceName="SQ_TB_PROJETO_AM",allocationSize=1)
public class ProjetoAm {

	@Id
	@Column(name="CD_PROJETO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProjeto")
	private int codigo;
	
	@Column(nullable=false,name="DS_TEMA",length=200)
	private String tema;
	
	@Column(name="VL_NOTA")
	private float nota;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INICIO",nullable=false)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENTREGA",nullable=false)
	private Calendar dataEntrega;
	
	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="CD_GRUPO",nullable=false)
	private GrupoAm grupo;
	
	@ManyToMany(mappedBy="projetos")
	private List<Professor> orientadores;

	public ProjetoAm() {
		super();
	}

	public ProjetoAm(int codigo, String tema, float nota, Calendar dataInicio, Calendar dataEntrega, GrupoAm grupo) {
		super();
		this.codigo = codigo;
		this.tema = tema;
		this.nota = nota;
		this.dataInicio = dataInicio;
		this.dataEntrega = dataEntrega;
		this.grupo = grupo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}

	public List<Professor> getOrientadores() {
		return orientadores;
	}

	public void setOrientadores(List<Professor> orientadores) {
		this.orientadores = orientadores;
	}
	
}
