package br.com.servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.servico.model.Produto;

import com.google.gson.Gson;

@Path("/produto")
public class ProdutoController {
	
	@GET
	@Path("/conteudo")
	public String conteudo(){
		return "Felipe";
	}
	
	@GET
	@Produces("application/json")
	@Path("/cadastrar")
	public String cadastrarProduto(String produto){
		Gson gson = new Gson();		
		Produto p = gson.fromJson(produto, Produto.class);
		
		
		
		return "Felipe";
	}
}
