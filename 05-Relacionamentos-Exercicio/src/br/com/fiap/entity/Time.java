package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_TIME")
@SequenceGenerator(name = "seqTime", sequenceName = "SQ_TB_TIME", allocationSize = 1)
public class Time {

	@Id
	@Column(name = "CD_TIME")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTime")
	private int codigo;

	@Column(name = "NM_TIME")
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FUNDACAO")
	private Calendar dataFundacao;

	@Column(name = "NR_TITULO")
	private int titulos;

	// Cascade -> cadastra o tecnico quando o time for cadastrado
	// fetch -> busca o tecnico no momento da busca do time
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "CD_TECNICO")
	private Tecnico tecnico;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name = "TB_TIME_CAMPEONATO", joinColumns = @JoinColumn(name = "CD_TIME"), // PK
																							// da
																							// tabela
																							// time
			inverseJoinColumns = @JoinColumn(name = "CD_CAMPEONATO")) // PK da
																		// tabela
																		// campeonato
	private List<Campeonato> campeonatos;

	@OneToMany(mappedBy = "time", cascade = CascadeType.PERSIST)
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	// Método para relacionamento OneToMany, para facilitar o cadastro
	// do relacionamento em cascata
	public void addJogador(Jogador jogador) {
		jogador.setTime(this);
		jogadores.add(jogador);
	}

	public Time() {
		super();
	}

	public Time(String nome, Calendar dataFundacao, int titulos, Tecnico tecnico) {
		super();
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.titulos = titulos;
		this.tecnico = tecnico;
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

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

}
