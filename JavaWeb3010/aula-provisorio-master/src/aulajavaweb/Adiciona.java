package aulajavaweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adicionaContato")
public class Adiciona extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataNascimento = req.getParameter("dataNascimento");
		
		StringBuffer sb = new StringBuffer();
		sb.append("{ 'nome' : " + "'" + nome + "',");
		sb.append("'email' : " + "'" + email + "',");
		sb.append("'endereco' : " + "'" + endereco + "',");
		sb.append("'dataNascimento' : " + "'" + dataNascimento + "'}");
		
		resp.getWriter().append(sb);
	}

}
