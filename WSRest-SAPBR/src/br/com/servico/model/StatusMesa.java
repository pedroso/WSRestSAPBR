package br.com.servico.model;

/**
 * Created by Felipe on 01/06/2015.
 */
public enum StatusMesa {
    DISPONIVEL(-1L, "Disponível"),
    OCUPADA(-2L, "Ocupada");

    private Long Id;
    private String Descricao;

    StatusMesa(Long id, String descricao){
        this.Id = id;
        this.Descricao = descricao;
    }

    public double getId(){
        return this.Id;
    }

    public String getDescricao(){
        return this.Descricao;
    }
}
