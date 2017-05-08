package br.com.project.testes;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.project.beans.Project;
import br.com.project.beans.bancoDeUsuarios;
import br.com.project.cadastrar.infra.CriadorDeSession;
import br.com.project.interfaces.plataformaInterface;
import br.com.project.servlet.projectLoginServlet;

public class teste implements plataformaInterface{
	private final Session session;
	public teste(){
		this.session = CriadorDeSession.getSession();
	}

	@Override
	public Project recuperaProjeto(String nameProject) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<bancoDeUsuarios> recuperaUsuario(String nameProject) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public void updateIntroducao(String introducao, String projectName) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateDesenvolvimento(String desenvolvimento, String projectName) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateObjetivo(String objetivo, String projectName) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateErros(String erros, String projectName) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateRequisitos(String requisitos, String projectName) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateSolucao(String solucao, String projectName) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void updateProject(String coluna, String valor, String projectName) {
		// TODO Auto-generated method stub
		String comando = "update Project as r set r."+coluna+" = :intro where r.project = :paramFinalizado" ;
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(comando);
		query.setParameter("intro", valor);
		query.setParameter("paramFinalizado", projectName);
		
		query.executeUpdate();
		tx.commit();
		
		
		
//		Transaction tx = session.beginTransaction();
//		Query query = session.createQuery("update Project as r "
//				+ "set r.objetivo = :intro where r.project = :paramFinalizado");
//		query.setParameter("intro", objetivo1);
//		query.setParameter("paramFinalizado", projectLoginServlet.nameProject);
//		
//		query.executeUpdate();
//		tx.commit();
//		System.out.println("Solucao = "+objetivo1);
//		System.out.println("Salvo com sucesso!");
		
	}

}
