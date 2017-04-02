package br.com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.project.cadastrar.infra.CriadorDeSession;
import br.com.project.dao.PlataformaDAO;
import br.com.project.modelos.Project;
import br.com.project.servlet.projectLoginServlet;

@Resource
public class Paginas {
	private static Project user;
	private final Result result;
	private final Session session;
	private final HttpServletRequest servletRequest;
	private final PlataformaDAO dao;
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Paginas(Result result,HttpServletRequest servletRequest) {
		this.result = result;
		this.session = CriadorDeSession.getSession();
		this.servletRequest = servletRequest;
		user = new PlataformaDAO().recuperaProjeto(projectLoginServlet.nameProject);
		this.dao = new PlataformaDAO();
		this.projectName = projectLoginServlet.nameProject;
	}

	@Get
	@Path("/introducao")
	public String introducao() {

		if (user.getIntroducao() == null) {
			return "Campo a ser preenchido!";
		} else {
			return user.getIntroducao();
		}

	}
	@Get
	@Path("/desenvolvimento")
	public String desenvolvimento() {
		
		if (user.getDesenvolvimento() == null) {
			return "Campo a ser preenchido!";
		} else {
			return user.getDesenvolvimento();
		}
	}
	@Get
	@Path("/solucao")
	public String solucao(){
		if (user.getSolucao() == null) {
			return "Campo a ser preenchido!";
		} else {
			return user.getSolucao();
		}
	}
	@Get
	@Path("/objetivo")
	public String objetivo(){
		if (user.getObjetivo() == null) {
			return "Campo a ser preenchido!";
		} else {
			return user.getObjetivo();
		}
		
	}
	@Get
	@Path("/requisitos")
	public String requisitos(){
		if (user.getRequisitos() == null) {
			return "Campo a ser preenchido!";
		} else {
			return user.getRequisitos();
		}
	}
	@Get
	@Path("/erros")
	public String erros(){
		if (user.getErros() == null) {
			return "Campo a ser preenchido!";
		} else {
			return user.getErros();
		}
	}
	@Get
	@Path("/visualizacao")
	public void visualizacao(){
		return;
	}
	
	@Path("/salva")
	public void salvas(String solucao){

		dao.updateProject("solucao", solucao, projectName);
		System.out.println("Solucao = "+solucao);
		System.out.println("Salvo com sucesso!");
		result.redirectTo(Paginas.class).solucao();
	
	}
	@Path("/salvai")
	public void salvai(String introducao){

		dao.updateProject("introducao", introducao, projectName);
		System.out.println("Solucao = "+introducao);
		System.out.println("Salvo com sucesso!");
		result.redirectTo(Paginas.class).introducao();
	
	}
	@Path("/salvao")
	public void salvao(String objetivo){

		dao.updateProject("objetivo", objetivo, projectName);
		System.out.println("Solucao = "+objetivo);
		System.out.println("Salvo com sucesso!");
		result.redirectTo(Paginas.class).objetivo();
	
	}
	@Path("/salvar")
	public void salvar(String requisitos){

		dao.updateProject("requisitos", requisitos, projectName);
		
		System.out.println("Solucao = "+requisitos);
		System.out.println("Salvo com sucesso!");
		result.redirectTo(Paginas.class).requisitos();
	
	}
	
	@Path("/salvae")
	public void salvae(String erros){

		dao.updateProject("erros", erros, projectName);
		System.out.println("Solucao = "+erros);
		System.out.println("Salvo com sucesso!");
		result.redirectTo(Paginas.class).erros();
	
	}
	
	@Path("/salvad")
	public void salvad(String desenvolvimento){

		dao.updateProject("desenvolvimento", desenvolvimento, projectName);
		System.out.println("Solucao = "+desenvolvimento);
		System.out.println("Salvo com sucesso!");
		result.redirectTo(Paginas.class).desenvolvimento();
	
	}

}
