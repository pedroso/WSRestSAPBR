package br.com.servico;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("WeHaveSciencePU");
		factory.createEntityManager();
	}

}
