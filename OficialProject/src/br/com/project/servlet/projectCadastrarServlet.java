package br.com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.project.beans.Project;
import br.com.project.beans.bancoDeUsuarios;
import br.com.project.dao.projectCadastroDao;



@WebServlet("/cadastrarProject")
public class projectCadastrarServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

	
	PrintWriter out = response.getWriter();
	
	String nameProject = request.getParameter("projectNameC");
    String passwordProject = request.getParameter("passwordC");
    bancoDeUsuarios cadastro = new bancoDeUsuarios();
    cadastro.setProject(nameProject);
    cadastro.setPassword(passwordProject);
    
    Project project = new Project();
    project.setProject(nameProject);
    new projectCadastroDao().adicionaProject(project);
    
    new projectCadastroDao().adicionaUsuario(cadastro);
    out.println("<html>");
    out.println("<body>");
    out.println("Contato " + cadastro.getProject() + 
            " adicionado com sucesso & Project = "+project.getProject());    
    out.println("</body>");
    out.println("</html>");
    
    
	}
}
