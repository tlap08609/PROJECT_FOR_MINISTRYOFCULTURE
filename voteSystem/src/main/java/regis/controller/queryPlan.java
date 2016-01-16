package regis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import regis.model.Votesystem;
import regis.model.dao.VotesystemHibernateDAO;


@WebServlet("/queryPlan")
public class queryPlan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String word = request.getParameter("word");
//		int foo = Integer.parseInt(word);
		Long l = Long.parseLong(word);
		VotesystemHibernateDAO queryProductName = new VotesystemHibernateDAO();
		List<Votesystem> list= queryProductName.findPlan(l);
		request.setAttribute("plans_lp", list);
		RequestDispatcher rd = request.getRequestDispatcher("/demo.jsp");
			rd.forward(request, response);
			return;
	}

}
