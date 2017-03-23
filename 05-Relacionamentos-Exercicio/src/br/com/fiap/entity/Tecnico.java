package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TECNICO")
@SequenceGenerator(name = "seqTecnico", sequenceName = "SQ_TB_TECNICO", allocationSize = 1)
public class Tecnico {

	@Id
	@Column(name = "CD_TECNICO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTecnico")
	private int codigo;

	@Column(name = "NM_TECNICO")
	private String nome;

	// mappedBy -> nome do ATRIBUTO que mapeia o relacionamento (na classe time)
	// fetch LAZY -> quando buscar o tecnico o time não será carregado
	// Quando tem o mappedBy não pode colocar o @JoinColumn
	@OneToOne(mappedBy = "tecnico", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Time time;

	public Tecnico() {
		super();
	}

	public Tecnico(String nome) {
		super();
		this.nome = nome;
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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
