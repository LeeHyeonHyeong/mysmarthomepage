package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * get ������� �α��� ���� �����
 */
@WebServlet("/part03/login_demo.do")
public class LoginDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("����� �Է��� �����Դϴ�.<br/>");
		out.println("�� �� �� : ");
		out.println(id);
		out.println("<br/> ���� : ");
		out.println(age);
		// �ڹٽ�ũ��Ʈ�� ���� �������� �̵��ϴ� ��ũ�� �������.
		//
		out.println("<br/><a href='javascript:history.go(-1)'>�ڷ�<a/>");
		out.println("</body></html>");
		out.close();
				
	}

	

}





