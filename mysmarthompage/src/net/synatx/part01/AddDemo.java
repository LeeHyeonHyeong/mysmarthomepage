package net.synatx.part01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���������� ���������θ� ������ ����..��â�� ��
 */
@WebServlet("/part01/add_demo.do" )
public class AddDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		int add = num1+num2;
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>����</title></head>");
		out.print("<body>");
		out.print(num1 + "+" + num2 + "=" + add);
		out.print("</body>");
		out.print("</html>");
	}

}