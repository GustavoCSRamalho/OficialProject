package br.com.project.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
	@Id @GeneratedValue
	private long id;
	private String project;
	private String introducao;
	private String solucao;
	private String objetivo;
	private String desenvolvimento;
	private String requisitos;
	private String erros;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getIntroducao() {
		return introducao;
	}
	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}
	public String getSolucao() {
		return solucao;
	}
	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getDesenvolvimento() {
		return desenvolvimento;
	}
	public void setDesenvolvimento(String desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getErros() {
		return erros;
	}
	public void setErros(String erros) {
		this.erros = erros;
	}
	

}
