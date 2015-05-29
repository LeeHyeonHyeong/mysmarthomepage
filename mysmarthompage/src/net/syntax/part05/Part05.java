package net.syntax.part05;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Discarder;

/**
 * Servlet implementation class Part04
 */
@WebServlet("/prototyp.do")
public class Part05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/part04/intro.jsp");
		dispatcher.forward(request, response);
	}

}
