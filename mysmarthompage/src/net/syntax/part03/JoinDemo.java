package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinDemo
 */
@WebServlet("/part03/join_demo.do")
public class JoinDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String gender = request.getParameter("gender");
		String check_mail = request.getParameter("check_mail");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("����� �Է��� �����Դϴ�.<hr>");
		out.print("���� : <b>");
		out.print(gender);
		out.print("</b><br> �������� ���ſ��� : <b>");
		out.print(check_mail);
		out.println("</b><br> �����λ� : <b><pre>");
		out.print(content);
		out.println("</b></pre><br/><a href='javascript:history.go(-1)'>�ڷ�<a/>");
		out.print("</body></html>");
		
		
		out.close();
	}

}
