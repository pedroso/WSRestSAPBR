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
@Table(name = "Conta")
public class Conta {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    private Long id;
	
	@OneToOne
    private Mesa mesa;

    private StatusConta statusConta;

    public Conta() { }
    public Conta(Mesa mesa, StatusConta statusConta) {
        this.setMesa(mesa);
        this.setStatusConta(statusConta);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public StatusConta getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }
}
