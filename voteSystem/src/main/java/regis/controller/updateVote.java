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

@WebServlet("/updateVote")
public class updateVote extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String score = request.getParameter("score");
		int iscore = Integer.parseInt(score);
		String comment = request.getParameter("comment");
		
		String plClass = request.getParameter("plClass");
		String plName = request.getParameter("plName");
		
		String pk = request.getParameter("pk");
		int ipk = Integer.parseInt(pk);
		VotesystemHibernateDAO aa = new VotesystemHibernateDAO();
		Votesystem vh = new Votesystem(ipk,name,plClass,plName,iscore,comment);
		aa.update(vh);
		
		
//		這是第一種方法
//		response.sendRedirect("demo.jsp");
//		這是第二種方法
		
		VotesystemHibernateDAO queryProductName = new VotesystemHibernateDAO();
		List<Votesystem> list= queryProductName.getAll();
		request.setAttribute("plans_lp", list);
		RequestDispatcher rd = request.getRequestDispatcher("/demo.jsp");
			rd.forward(request, response);
			return;

			
	}
}
