package escola.musica.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Curso {

	
	private Integer id;
	private String nome;
	private String descricao;
	private double duracao = 1;
	private TipoCurso tipo;
	private Date dataCriacao;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@NotEmpty(message = "O campo nome deve ser informado")
	@Length(min = 4, max = 50, 
	message = "O nome campo deve ter entre 4 e 50 caracteres!")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@NotEmpty(message = "Voc� deve informar uma descri��o")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Min(value = 1, message = "A dura��o n�o pode ser menor que 1")
	@Max(value = 10, message = "A dura��o n�o pode ser maior que 10")
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	@NotNull(message = "Voc� deve selecionar o tipo do curso!")
	public TipoCurso getTipo() {
		return tipo;
	}
	public void setTipo(TipoCurso tipo) {
		this.tipo = tipo;
	}
	
	@NotNull(message = "A data de cria��o deve ser informada")
	@Past(message = "A data de cria��o deve ser menor que a data atual")
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
}
