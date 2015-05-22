package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDemo2
 */
@WebServlet("/part03/login_demo2.do")
public class LoginDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String id = "admin";
		String pwd = "pass";
		PrintWriter out = response.getWriter();
		if (id.equalsIgnoreCase(request.getParameter("id"))
				&& pwd.equalsIgnoreCase(request.getParameter("pwd"))
				){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/part02/template.jsp");  //.java������ ��ξտ�..�� ���̵� ����Ȱ�η� �̵��Ѵ�.
			dispatcher.forward(request, response);
			/*out.println("<html><body>");
			out.println("����� �Է��� �����Դϴ�.<br/>");
			out.println("�� �� �� : ");
			out.println(id);
			out.println("<br/> �н����� : ");
			out.println(pwd);
			// �ڹٽ�ũ��Ʈ�� ���� �������� �̵��ϴ� ��ũ�� �������.
			out.println("<br/><a href='javascript:history.go(-1)'>�ڷ�<a/>");
			out.println("</body></html>");
			out.close();*/
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/part03/login_fail.jsp");  
			//�α��� ���н�ȭ��(login.fail)���� ������ ���нð��� �ҽ��� ��θ� �Ű�Ἥ �Է�������Ѵ�.
			dispatcher.forward(request, response);
		}

	}
}