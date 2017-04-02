package br.com.project.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.project.cadastrar.infra.CriadorDeSession;
import br.com.project.modelos.Project;
import br.com.project.modelos.bancoDeUsuarios;

public class projectCadastroDao extends PlataformaDAO{
	private final Session session;
	
	public projectCadastroDao(){
		this.session = CriadorDeSession.getSession();
	}

	public void adicionaUsuario(bancoDeUsuarios project) {

		salva(project, session);
	}
	public void adicionaProject(Project project){
		salva(project, session);
	}
	private void salva(bancoDeUsuarios project, Session session) {
		saveProject(project, session);
	}
	private void salva(Project project, Session session) {
		saveProject(project, session);
	}
	
	public boolean existe(String projectName,String password,bancoDeUsuarios user){
		if(user.getProject().equals(projectName) && user.getPassword().equals(password)){
			return true;
		}
		return false;
	}
	public List<bancoDeUsuarios> recuperaUsuario(String nameProject) {
		Query query = session.createQuery("select t from bancoDeUsuarios as t "+"where t.project = :paramFinalizado");
	     query.setParameter("paramFinalizado", nameProject);
	     
	     List<bancoDeUsuarios> lista = query.list();
		return lista;
	}
	
	private void saveProject(Object project, Session session) {
		Transaction tx = session.beginTransaction();

		session.save(project);

		tx.commit();
	}

}