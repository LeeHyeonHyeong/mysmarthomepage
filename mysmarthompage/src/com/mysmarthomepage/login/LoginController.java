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
		System.out.println("��Ʈ�ѷ����� �ݵ� ID"+ id);
		
		LoginServiceImpl.getInstance().login(id);
		if(pwd.equals(pass)){
			System.out.println("�α��μ���");
		}else{
			System.out.println("�α��ν���");
		}
		
	}

}
