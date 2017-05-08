package br.com.project.interfaces;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.project.beans.Project;
import br.com.project.beans.bancoDeUsuarios;
import br.com.project.dao.PlataformaDAO;

public interface plataformaInterface {
	public Project recuperaProjeto(String nameProject);
	
//	public List<bancoDeUsuarios> recuperaUsuario(String nameProject);
	
//	public void updateIntroducao(String introducao, String projectName );
//	
//	public void updateDesenvolvimento(String desenvolvimento, String projectName );
//	
//	public void updateObjetivo(String objetivo, String projectName );
//	
//	public void updateErros(String erros, String projectName );
//	
//	public void updateRequisitos(String requisitos, String projectName );
//	
//	public void updateSolucao(String solucao, String projectName );
	
	public void updateProject(String coluna ,String valor,String projectName);
	
	


}
