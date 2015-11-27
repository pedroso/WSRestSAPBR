package br.com.servico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Felipe on 01/06/2015.
 */
@Entity
@Table(name = "Categoria")
public class Categoria {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    private Long Id;
	
	@Column(name = "nome", nullable = false, length = 100)
    private String nome;
	
	@OneToOne
    private Categoria subCategoria;


    public Categoria(){ }
    public Categoria(String nome, Categoria subCategoria) {
        this.setNome(nome);
        this.setSubCategoria(subCategoria);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(Categoria subCategoria) {
        this.subCategoria = subCategoria;
    }
}
