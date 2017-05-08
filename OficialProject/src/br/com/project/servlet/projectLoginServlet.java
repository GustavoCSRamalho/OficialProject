package br.com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import br.com.caelum.vraptor.Result;
import br.com.project.beans.bancoDeUsuarios;
import br.com.project.cadastrar.infra.CriadorDeSession;
import br.com.project.dao.projectCadastroDao;

@WebServlet("/login")
public class projectLoginServlet extends HttpServlet {
	public static bancoDeUsuarios user;
	private static boolean value;
	private final Session session;
	private Result result;
	public static String nameProject;

	public projectLoginServlet() {
		session = CriadorDeSession.getSession();
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		this.nameProject = request.getParameter("projectNameL");
		String passwordProject = request.getParameter("passwordL");
		System.out.println(nameProject);
		System.out.println(passwordProject);

		List<bancoDeUsuarios> lista = new projectCadastroDao()
				.recuperaUsuario(projectLoginServlet.nameProject);

		Iterator it = lista.iterator();

		while (it.hasNext()) {

			user = (bancoDeUsuarios) it.next();
			System.out.println("User : " + user.getProject() + " Password : "
					+ user.getPassword());
		}

		value = (new projectCadastroDao().existe(nameProject, passwordProject,
				user));
		if (value) {

			response.sendRedirect("/OficialProject/introducao");
		} else {
			System.out.println("Usuario e senha não conferem!");
			out.println("<html>");
			out.println("<body>");
			out.println("Usuario e senha não conferem!");
			out.println("</body>");
			out.println("</html>");
		}

	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public bancoDeUsuarios getUser() {
		return user;
	}

	public void setUser(bancoDeUsuarios user) {
		this.user = user;
	}

	public Session getSession() {
		return session;
	}

}
