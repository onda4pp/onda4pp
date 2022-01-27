package org.redeonda.redeOnda.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario;

	@NotNull(message = "O atributo usuario é Obrigatório!")
	@Size(min = 3, max = 20, message = "O atributo título deve conter no mínimo 03 e no máximo 20 caracteres")
	private String usuario;

	@NotNull(message = "O atributo senha é Obrigatório!")
	@Size(min = 6, max = 20, message = "O atributo título deve conter no mínimo 06 e no máximo 20 caracteres")
	private String senha;

	@NotNull(message = "O atributo email é Obrigatório!")
	@Size(min = 10, max = 30, message = "O atributo email deve conter no mínimo 10 e no máximo 30 caracteres")
	private String email;

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
