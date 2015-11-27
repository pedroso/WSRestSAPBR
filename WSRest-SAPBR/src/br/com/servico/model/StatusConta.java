package br.com.servico.model;

/**
 * Created by Felipe on 01/06/2015.
 */
public enum StatusConta {
    ABERTA(-1L, "Aberta"),
    FECHADA(-2L, "Fechada");

    private Long Id;
    private String Descricao;

    StatusConta(Long id, String descricao){
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
