package regis.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import regis.model.Votesystem;
import regis.model.dao.VotesystemHibernateDAO;
//這一支是讓他們寫進session查詢的程式

@WebServlet("/queryCustomizedPlan")
public class queryCustomizedPlan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		HttpSession session = request.getSession();
//		Cookie cookieUser = null;
//		Cookie cookiePassword = null;
		String coname = request.getParameter("coname");
		String cotime = request.getParameter("cotime");
//		int l = Integer.parseInt(cotime);
//		cookieUser = new Cookie("user", URLEncoder.encode(coname, "UTF-8"));
//		String value = URLDecoder.decode(cookieUser.getValue(), "UTF-8");
//		session.setAttribute("user", value);
//		cookieUser.setMaxAge(30 * 60 * 60);
//		cookieUser.setPath(request.getContextPath());
		
//		cookiePassword = new Cookie("cotime", URLEncoder.encode(cotime, "UTF-8"));
//		String value1 = URLDecoder.decode(cookieUser.getValue(), "UTF-8");
//		session.setAttribute("cotime", value1);
//		cookiePassword.setMaxAge(30 * 60 * 60);
//		cookiePassword.setPath(request.getContextPath());
		
		
		
//		response.sendRedirect("demo.jsp");
		VotesystemHibernateDAO query = new VotesystemHibernateDAO();
		List<Votesystem> list= query.queryCustomizedPlan(coname, cotime);
		request.setAttribute("plans_lp", list);
		
//		List<Votesystem> list= queryProductName.findPlan(l);
//		request.setAttribute("plans_lp", list);
		RequestDispatcher rd = request.getRequestDispatcher("/demo.jsp");
			rd.forward(request, response);
			return;
	}

}
