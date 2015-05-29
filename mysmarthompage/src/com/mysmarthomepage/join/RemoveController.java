package com.mysmarthomepage.join;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member/remove.do")
public class RemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		MemberBean bean = new MemberBean();
		bean.setId(id);
		int num = RemoveServiceImpl.getInstance().removeMember(bean);
		System.out.println("서비스단에서 넘어온 숫자값 : +num");
		/*
		 * 여기에서 num은 디버깅용으로 사용된다.
		 * 정상적으로 쿼리문이 실행되었다면 1이 넘어오고
		 * 비정상 이라면 0이 넘어온다. 
		 */
	}

}
