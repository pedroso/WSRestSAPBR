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
@Table(name="Mesa")
public class Mesa {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    private Long id;

	@Column(name = "nome", nullable = false)
    private Integer numero;
	
    private StatusMesa statusMesa;

    public Mesa(){ }

    public Mesa(Integer numero, StatusMesa statusMesa) {
        this.setNumero(numero);
        this.setStatusMesa(statusMesa);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public StatusMesa getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(StatusMesa statusMesa) {
        this.statusMesa = statusMesa;
    }
}
