package com.mysmarthomepage.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import net.syntax.part04.MemberVO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/member/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("컨트롤러에서 받은 ID"+ id);
		String pass = LoginServiceImpl.getInstance().login(id);
		if(pwd.equals(pass)){
			System.out.println("로그인성공");
			session.setAttribute("id", id);
			/*
			 * 로그인이 성공햇다면..세션객체(로그인을 지속시켜주는 역활)
			 * 세션객체는 id 값을 로그아웃 하기 전까지 지속적으로
			 * 갖고 있으면서SQL문이 ID값이 필요할 경우 제공하는 역활을 한다.
			 */
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/loginSuccess.jsp");
			dispatcher.forward(request, response);
		}else{
			System.out.println("로그인 실패");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
