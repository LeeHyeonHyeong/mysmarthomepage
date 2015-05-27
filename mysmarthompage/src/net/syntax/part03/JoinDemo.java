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
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String check_mail = request.getParameter("check_mail");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신의 입력한 정보입니다.<hr>");
		out.print("성별 : <b>");
		out.print(gender +"</b>");
		out.print("이름 : <b>");
		out.print(name +"</b>");
		out.print("나이 : <b>");
		out.print(age +"</b>");
		out.print("ID : <b>");
		out.print(id +"</b>");
		out.print("비밀번호 : <b>");
		out.print(pwd +"</b>");
		out.print("<br> 메일정보 수신여부 : <b>");
		out.print(check_mail);
		out.println("</b><br> 가입인사 : <b><pre>");
		out.print(content);
		out.println("</b></pre><br/><a href='javascript:history.go(-1)'>뒤로<a/>");
		out.print("</body></html>");
		
		
		out.close();
	}

}
