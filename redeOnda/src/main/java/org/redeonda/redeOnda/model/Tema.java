package org.redeonda.redeOnda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_tema;
	
	@NotNull (message = "O atributo título é Obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo título deve conter no mínimo 05 e no máximo 50 caracteres")
	private String titulo;
	
	@NotNull (message = "O atributo descrição é Obrigatório!")
	@Size(min = 10, max = 255, message = "O atributo descrição deve conter no mínimo 10 e no máximo 255 caracteres")
	private String descricao;
	
	@Size(min = 10, max = 255)
	private String imagem;

	public long getId_tema() {
		return id_tema;
	}

	public void setId_tema(long id_tema) {
		this.id_tema = id_tema;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
