package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hello.html")
public class HelloServlet extends HttpServlet {
	//231222(fri)-1227(wed)

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ 
//		System.out.println("Hello Servlet");
	
		// localhost/Web_basic/hello.html?message=good day=who=david
//		String message = request.getParameter("message");
//		String who = request.getParameter("who"); 
		
		request.setAttribute("method", "GET");
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
		
//		System.out.println(message);
//		System.out.println(who);
		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Echo message</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>method : GET</h1>");
//		out.println("<h1>To : "+who+"</h1>");
//		out.println("<h1>message : "+message+"</h1>");
//		out.println("</body>");
//		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String message = request.getParameter("message");
//		String who = request.getParameter("who"); 
		
		request.setAttribute("method", "POST");
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Echo.message</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>method : POST</h1>");
//		out.println("<h1>To : "+who+"</h1>");
//		out.println("<h1>message : "+message+"</h1>");
//		out.println("</body>");
//		out.println("</html>");
	
	
	}
	


	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
		String who = request.getParameter("who"); 
//		
//		request.setAttribute("method", "Delete");
//		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
		// delete는 포워딩방식을 지원하지 않고, 직접 아웃풋하기 때문에 실행이 되지 않음.
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Echo.message</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>method : DELETE</h1>");
		out.println("<h1>To : "+who+"</h1>");
		out.println("<h1>message : "+message+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	
	
	
	
}
