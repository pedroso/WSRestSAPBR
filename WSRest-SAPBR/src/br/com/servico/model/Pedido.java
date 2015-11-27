package br.com.servico.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pedido")
public class Pedido {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    private long id;
	
	@OneToOne
    private Usuario usuario;

	@Column(name = "enviado")
    private Boolean enviado;
    
    @OneToOne
    private Conta conta;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<ItemPedido> itensPedido;

    public Pedido() { }
    public Pedido(Usuario usuario, Conta conta) {
        setUsuario(usuario);
        setConta(conta);
        itensPedido = new ArrayList<ItemPedido>();
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }

    public void addItemPedido(ItemPedido itemPedido){
        this.itensPedido.add(itemPedido);
    }
    
    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }
	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
		
	}
}

