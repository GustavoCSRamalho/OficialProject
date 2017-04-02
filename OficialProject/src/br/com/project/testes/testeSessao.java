package br.com.project.testes;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.project.modelos.bancoDeUsuarios;




public class testeSessao {

	public static void main(String[] args) {

	     AnnotationConfiguration configuration = new AnnotationConfiguration();

	     configuration.configure();

	     

	     SessionFactory factory = configuration.buildSessionFactory();

	     Session session = factory.openSession();

	     

	     bancoDeUsuarios conta = new bancoDeUsuarios();

	     conta.setProject("Zoando");
	     conta.setPassword("123456");

	   

	     Transaction tx = session.beginTransaction();

	     session.save(conta);        

	     tx.commit();

	   }
}
