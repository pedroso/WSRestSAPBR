package br.com.servico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Felipe on 01/06/2015.
 */
@Entity
@Table(name="Funcionario")
public class Funcionario {    
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    private Long id;
    
	@Column(name = "nome", nullable = false, length = 100)
    private String Nome;
    
	@Column(name = "cpf", nullable = false, length = 100)
    private String Cpf;

	@Column(name = "funcao", nullable = false, length = 100)
    private String Funcao;

    public Funcionario() { }
    public Funcionario(String nome, String cpf, String funcao) {
        setNome(nome);
        setCpf(cpf);
        setFuncao(funcao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String funcao) {
        Funcao = funcao;
    }
}
