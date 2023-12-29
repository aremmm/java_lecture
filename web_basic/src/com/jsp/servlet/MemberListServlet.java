package com.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.dto.고객VO;
import com.jdbc.service.Service;
import com.jdbc.service.고객Service;
import com.jsp.dto.MemberVO;

//231228(thu)
@WebServlet("/member/list") //"/member/list"를 쓸때, member 앞에 꼭 슬래쉬(/)를 넣어줘야 함!!
public class MemberListServlet extends HttpServlet {
	

	private Service service = new 고객Service();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/WEB-INF/views/member/list.jsp";
		try {
			List<고객VO> memberList = service.list();
			
			request.setAttribute("memberList", memberList);
			
		}catch(Exception e) {
			url = "/WEB-INF/views/member/list.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
