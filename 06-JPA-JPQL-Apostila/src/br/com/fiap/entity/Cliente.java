package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqCliente", sequenceName="SEQ_CLIENTE", allocationSize=1)
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCliente")
	private int id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(length=11,nullable=false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	private List<Pacote> pacotes;

	public Cliente(String nome, String cpf, Calendar dataNascimento, Endereco endereco, List<Pacote> pacotes) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.pacotes = pacotes;
	}
	
	public Cliente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}
	
	
}
