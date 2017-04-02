package br.com.project.testes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.project.cadastrar.infra.CriadorDeSession;
import br.com.project.dao.PlataformaDAO;
import br.com.project.modelos.Project;
import br.com.project.modelos.bancoDeUsuarios;
import br.com.project.servlet.projectLoginServlet;

public class testeBusca {

	private static boolean value;
	private static Session session;

	private String nameProject;
	public testeBusca(){
		this.session = CriadorDeSession.getSession();
		this.nameProject = "a";
	}
	public static void main(String[] args) {

//	     AnnotationConfiguration configuration = new AnnotationConfiguration();
//
//	     configuration.configure();
//
//	     
//
//	     SessionFactory factory = configuration.buildSessionFactory();
//
//	     Session session = factory.openSession();
//
//	     Query query = session.createQuery("select t from projectCadastro as t "+"where t.project = :paramFinalizado");
//	     query.setParameter("paramFinalizado", "Zoando");
//	     
//	     List<projectCadastro> lista = query.list();
//	     
//	     Iterator it = lista.iterator();
//	     
//	     while(it.hasNext()){
//	    	 projectCadastro user = (projectCadastro) it.next();
//	    	 System.out.println("User : "+user.getProject()+" Password : "+user.getPassword());
//	     }
//	     
//	     
//	   }
//		AnnotationConfiguration configuration = new AnnotationConfiguration();
//		configuration.configure();
//		SessionFactory factory = configuration.buildSessionFactory();
//
//		Session session = factory.openSession();
//
//		String nameProject = "teste";
//		String passwordProject = "teste";
//		System.out.println(nameProject);
//		System.out.println(passwordProject);
//		
//		
//		Query query = session.createQuery("select t from bancoDeUsuarios as t "+"where t.project = :paramFinalizado");
//	     query.setParameter("paramFinalizado", nameProject);
//	     
//	     List<bancoDeUsuarios> lista = query.list();
//	     
//	     Iterator it = lista.iterator();
//	     
//	     while(it.hasNext()){
//	    	 bancoDeUsuarios usuario;
//	    	 usuario = (bancoDeUsuarios) it.next();
//	    	 user = (usuario);
//	    	 System.out.println("User : "+user.getProject()+" Password : "+user.getPassword());
//	     }
//	     
//		value = (new projectCadastroDao().existe(nameProject, passwordProject, user));
//		if(value){
//			   System.out.println("Logado");
//			    
//		}
//		else{
//			
//			   System.out.println("Usuario e senha não conferem!");    
//			  
//		}
		
//		Project project = new Project();
//		project.setProject("Testando");
//		new projectCadastroDao().adicionaProject(project);
//		System.out.println("Done!");
//		
//		new PlataformaDAO().updateIntroducao("Agora funcionou mesmo","a");
//		System.out.println("Done!");
		
		
		//Aqui funciona
		
		pegaProject();
		
//		List<Project> p = new ArrayList<Project>();
//		PlataformaDAO dao = new PlataformaDAO();
//		Project user = dao.recuperaProjeto("a");
//		p.add(user);
//		List<Project> pr = p;
//		for (Project projeto : pr) {
//			  System.out.println("Projeto name : "+projeto.getProject());
//			  System.out.println("Introducao : "+projeto.getIntroducao());
//			
//			}
		
		
		
	
//	public boolean isValue() {
//		return value;
//	}
//	public  void setValue(boolean value) {
//		this.value = value;
//	}
//	public bancoDeUsuarios getUser() {
//		return user;
//	}
//	public void setUser(bancoDeUsuarios user) {
//		this.user = user;
//	}
	}
	private static void pegaProject() {
		List<Project> p = new ArrayList<Project>();
		PlataformaDAO dao = new PlataformaDAO();
		Project user = dao.recuperaProjeto("a");
		p.add(user);
	}
		

	}


