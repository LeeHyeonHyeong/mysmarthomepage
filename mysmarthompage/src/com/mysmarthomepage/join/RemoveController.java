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
		System.out.println("���񽺴ܿ��� �Ѿ�� ���ڰ� : +num");
		/*
		 * ���⿡�� num�� ���������� ���ȴ�.
		 * ���������� �������� ����Ǿ��ٸ� 1�� �Ѿ����
		 * ������ �̶�� 0�� �Ѿ�´�. 
		 */
	}

}
