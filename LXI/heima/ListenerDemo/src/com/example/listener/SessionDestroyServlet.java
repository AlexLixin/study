package com.example.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDestroyServlet
 */
@WebServlet("/SessionDestroyServlet")
public class SessionDestroyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionDestroyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the session object
		HttpSession session = request.getSession(true);
		// Invalidate Session
		session.invalidate();

		// set content type and other response header fields first
		response.setContentType("text/html");

		// then write the data of the response
		PrintWriter out = response.getWriter();

		out.println("<HEAD><TITLE> " + "Session Destroyed Successfully .. \n" + "</TITLE></HEAD><BODY>");
		out.println("<P>[<A HREF=\"../ListenerDemo/index.jsp\">Restart</A>]");
		out.println("<h2> Session Destroyed Successfully</h2>");
		out.println("Look at the OC4J Console to see whether the\n" + "HttpSessionEvent was invoked");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
