package br.com.project.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.Resource;
import br.com.project.beans.Project;
import br.com.project.beans.bancoDeUsuarios;
import br.com.project.cadastrar.infra.CriadorDeSession;
import br.com.project.interfaces.plataformaInterface;
import br.com.project.servlet.projectLoginServlet;

public class PlataformaDAO implements plataformaInterface {
	private final Session session;
	private static Project user;
	private String nameProject;

	public PlataformaDAO() {
		this.session = CriadorDeSession.getSession();
		this.nameProject = projectLoginServlet.nameProject;
	}

	public Project recuperaProjeto(String nameProject) {
		Query query = session.createQuery("select t from Project as t "
				+ "where t.project = :paramFinalizado");
		query.setParameter("paramFinalizado", nameProject);

		List<Project> lista = query.list();

		Iterator it = lista.iterator();

		while (it.hasNext()) {
			Project usuario;
			usuario = (Project) it.next();
			user = usuario;
			System.out.println("Project : " + user.getProject()
					+ " Introdução : " + user.getIntroducao());
		}
		return user;
	}
	

	@Override
	public void updateProject(String coluna, String valor, String projectName) {
		// TODO Auto-generated method stub
		String comando = "update Project as r set r." + coluna
				+ " = :intro where r.project = :paramFinalizado";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(comando);
		query.setParameter("intro", valor);
		query.setParameter("paramFinalizado", projectName);

		query.executeUpdate();
		tx.commit();
	}

	public static Project getUser() {
		return user;
	}

	public static void setUser(Project user) {
		PlataformaDAO.user = user;
	}

	public Session getSession() {
		return session;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	
	public List<Project> getPega() {
		List<Project> p = new ArrayList<Project>();
		PlataformaDAO dao = new PlataformaDAO();
		Project user = dao.recuperaProjeto("a");
		p.add(user);
		return p;
	}

}
