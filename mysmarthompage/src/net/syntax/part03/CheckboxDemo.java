package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Checkbox���� �Ѿ�� �����Ͱ� �����ֱ�
 */
@WebServlet("/part03/checkbox.do")
public class CheckboxDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.print("<html><body>");
		String items[] = request.getParameterValues("item");
		if(items == null){
			out.print("������ �׸��� �����ϴ�.");
		}else{
			out.print("����� ������ �׸��Դϴ�.<hr>");
			for(String item : items){
				out.print(item + " ");
			}
		}
		// �ڹٽ�ũ��Ʈ�� ���� �������� �̵��ϴ� ��ũ�� �������.
				//
				out.println("<br/><a href='javascript:history.go(-1)'>�ڷ�<a/>");
				out.println("</body></html>");
				out.close();
		
	}

}
