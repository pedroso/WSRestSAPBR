package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.servico.contratos.IPessoaService;
import br.com.servico.dao.produto.ProdutoDAO;
import br.com.servico.model.ItemPedido;
import br.com.servico.model.Pedido;
import br.com.servico.model.Produto;

import com.google.gson.Gson;

@Path("/pessoa")
public class PessoaService implements IPessoaService {

	@GET
    @Produces("application/json")
	@Path("/works")
    public String mensagemContexto() {
		Mensagem m = new Mensagem();
		m.mensagem = "Bem vindo ao WebService do Sistema de Automacao de Pedido (SAP) - Contexto de Pessoa";
 
		return createDataResult(m);   
    }
	
	@POST
	@Produces("application/json")
	public String autenticarUsuario(@PathParam("usuario") String usuario, @PathParam("senha")String senha){
		Boolean success =  "felipe".equals(usuario) && "123".equals(senha);
		
		return createDataResult(success);
	}
	
	@GET
	@Path("/obterProduto")
    @Produces("application/json")
    public String obterProduto(@PathParam("usuario")String usuario,@PathParam("senha") String senha) {		
		Pedido pedido = new Pedido();
		
		Produto p1 = new Produto("Guaraná", 3.55);
		Produto p2 = new Produto("X-Tudo", 10.5);
		Produto p3 = new Produto("Misto quente", 5.0);
		Produto p4 = new Produto("Coca-Cola", 3.55);
		
		ItemPedido item1 = new ItemPedido(null, p1, 1);
		ItemPedido item2 = new ItemPedido(null, p4, 2);
		ItemPedido item3 = new ItemPedido(null, p3, 4);
		ItemPedido item4 = new ItemPedido(null, p2, 5);
		
		List<ItemPedido> itensPedido = new ArrayList<ItemPedido>();
		
		itensPedido.add(item1);
		itensPedido.add(item2);
		itensPedido.add(item3);
		itensPedido.add(item4);
		
		pedido.setItensPedido(itensPedido);
		
		return createDataResult(pedido);
    }
	
	@GET
	@Path("/obterProdutosComanda")
	@Produces("application/json")
	public String obterListaProdutos() {
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtos = dao.ObterProdutos();
		
		return createDataResult(produtos);
	}
	
	@Override
	public String getUsuario(String email) {
		return createDataResult(email);
	}
	
	public String createDataResult(Object obj){
		Gson gson = new Gson();		
		String json = gson.toJson(obj);
		
		return json;
	}
	
	public class Mensagem {
        public String mensagem;
    }
}
