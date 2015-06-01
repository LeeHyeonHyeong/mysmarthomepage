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
		System.out.println("��Ʈ�ѷ����� ���� ID"+ id);
		String pass = LoginServiceImpl.getInstance().login(id);
		if(pwd.equals(pass)){
			System.out.println("�α��μ���");
			session.setAttribute("id", id);
			/*
			 * �α����� �����޴ٸ�..���ǰ�ü(�α����� ���ӽ����ִ� ��Ȱ)
			 * ���ǰ�ü�� id ���� �α׾ƿ� �ϱ� ������ ����������
			 * ���� �����鼭SQL���� ID���� �ʿ��� ��� �����ϴ� ��Ȱ�� �Ѵ�.
			 */
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/loginSuccess.jsp");
			dispatcher.forward(request, response);
		}else{
			System.out.println("�α��� ����");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
