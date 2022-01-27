package org.redeonda.redeOnda.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_postagem;
	
	@NotNull(message = "O atributo título é Obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo título deve conter no mínimo 05 e no máximo 50 caracteres")
	private String titulo;
	
	@NotNull(message = "O atributo texto é Obrigatório!")
	@Size(min = 5, max = 1000 , message = "O atributo texto deve conter no mínimo 05 e no máximo 1000 caracteres")
	private String texto;
	
	@NotNull(message = "O atributo avaliação é Obrigatório!")
	private BigDecimal avaliacao;
	
	@UpdateTimestamp
	 private LocalDateTime data;
	
	@NotNull(message = "O atributo empresa é Obrigatório!")
	@Size(min = 3, max = 50, message = "O atributo empresa deve conter no mínimo 03 e no máximo 50 caracteres")
	private String empresa;
	
	@Size(min = 10, max = 255)
	private String imagem;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
    private Tema tema;	
	
	public long getId_postagem() {
		return id_postagem;
	}

	public void setId_postagem(long id_postagem) {
		this.id_postagem = id_postagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public BigDecimal getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(BigDecimal avaliacao) {
		this.avaliacao = avaliacao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	
	
}



