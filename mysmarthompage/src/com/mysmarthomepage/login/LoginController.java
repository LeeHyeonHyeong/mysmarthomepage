package com.mysmarthomepage.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.syntax.part04.MemberBean;

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
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("컨트롤러에서 반든 ID"+ id);
		String pass = LoginServiceImpl.getInstance().login(id);
		if(pwd.equals(pass)){
			System.out.println("로그인성공");
		}else{
			System.out.println("로그인실패");
		}
		
	}

}
