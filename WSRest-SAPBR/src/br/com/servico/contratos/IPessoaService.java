package br.com.servico.contratos;

public interface IPessoaService {
	
	public String autenticarUsuario(String usuario, String senha);
	
	public String getUsuario(String email); 
}
