package regis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import regis.model.Votesystem;
import regis.model.dao.VotesystemHibernateDAO;

@WebServlet("/updateVote")
public class updateVote extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		HttpSession session = request.getSession(false);
		
		String name = request.getParameter("name");
		System.out.println("name-"+name);
		String score = request.getParameter("score");
		int iscore = Integer.parseInt(score);
		String comment = request.getParameter("comment");
		String time = request.getParameter("time");
		String plClass = request.getParameter("plClass");
		String plName = request.getParameter("plName");
		String plNo = request.getParameter("plNo");
		String pk = request.getParameter("pk");
		int ipk = Integer.parseInt(pk);
		VotesystemHibernateDAO aa = new VotesystemHibernateDAO();
		Votesystem vh = new Votesystem(ipk,name,plNo,time,plName,plClass,iscore,comment);
		aa.update(vh);
		
		
//		這是第一種方法
//		response.sendRedirect("demo.jsp");
//		這是第二種方法

//		System.out.println("value="+value);
		
//		System.out.println("cotime="+cotime);
		VotesystemHibernateDAO query = new VotesystemHibernateDAO();
//		String value = (String) session.getAttribute("user");
//		System.out.println("value="+value);
//		String cotime =(String) session.getAttribute("cotime");
//		System.out.println("cotime="+cotime);
		List<Votesystem> list= query.queryCustomizedPlan(name, time);
		request.setAttribute("plans_lp", list);
		RequestDispatcher rd = request.getRequestDispatcher("/demo.jsp");
			rd.forward(request, response);
			return;

			
	}
}
