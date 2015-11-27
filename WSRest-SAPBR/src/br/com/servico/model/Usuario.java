package br.com.servico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Felipe on 01/06/2015.
 */
@Entity
@Table(name="Usuario")
public class Usuario extends Funcionario{
	
	@Column(name = "usuario", nullable = false, length = 100)
    private String Usuario;
	
	@Column(name = "senha", nullable = false, length = 100)
    private String Senha;

    public Usuario() { }
    public Usuario(String nome, String cpf, String funcao, String usuario, String senha) {
        super(nome, cpf, funcao);
        setUsuario(usuario);
        setSenha(senha);
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
