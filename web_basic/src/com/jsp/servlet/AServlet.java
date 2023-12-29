package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/a")
public class AServlet extends HttpServlet {
	//231228(thu)

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("s", "session");
		session.setMaxInactiveInterval(10); //(10)=> 10초 이내에 request가 오지 않으면 사라진다는 뜻.
		
		request.setAttribute("a", "abcd");
		request.getRequestDispatcher("/WEB-INF/views/a.jsp").forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
