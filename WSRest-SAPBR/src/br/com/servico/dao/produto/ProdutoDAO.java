package br.com.servico.dao.produto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.servico.model.Produto;

public class ProdutoDAO {

	public void CadastrarProduto(Produto produto) {
		SessionFactory sessionFactory =
				new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
			   tx = session.beginTransaction();
			   
			   session.save(produto);
			   
			   tx.commit();
			} catch (Exception e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
			} finally {
			   session.close();
			}		
	}
	
	
	public List<Produto> ObterProdutos(){		
		SessionFactory sessionFactory =
				new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
		   tx = session.beginTransaction();
		   Criteria criteria = session.createCriteria(Produto.class);
		   
		   List<Produto> produtos = criteria.list();
		   
		   tx.commit();
		   
		   return produtos;
		} catch (Exception e) {
		   if (tx!=null) tx.rollback();
		   e.printStackTrace(); 
		} finally {
		   session.close();
		}
		
		return new ArrayList<Produto>();
	}
	
}
