package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_ANIMAL")
@SequenceGenerator(name="seqAnimal",
sequenceName="SQ_TB_ANIMAL",allocationSize=1)
public class Animal {

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="seqAnimal")
	@Column(name="CD_ANIMAL")
	private int codigo;
	
	@Column(name="NM_ANIMAL",nullable=false)
	private String nome;
	
	@Column(name="DS_ESPECIE",nullable=false)
	private String especie;
	
	@Column(name="DS_PORTE")
	private Porte porte;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	public Animal() {
		super();
	}

	public Animal(int codigo, String nome, String especie, Porte porte, byte[] foto, Calendar dataNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.especie = especie;
		this.porte = porte;
		this.foto = foto;
		this.dataNascimento = dataNascimento;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
