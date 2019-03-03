package com.example.listener;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCreateServlet
 */
@WebServlet("/SessionCreateServlet")
public class SessionCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionCreateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sval = (String) session.getAttribute("counter");
		int counter = 1;

		if (sval != null) {
			counter = Integer.parseInt(sval);
			counter++;
		}

		session.setAttribute("counter", String.valueOf(counter));
		out.println("<HEAD><TITLE> "
				+ "Session Created Successfully ..  \n"
				+ "Look at OC4J Console to see whether the HttpSessionEvent invoked "
				+ "</TITLE></HEAD><BODY>");
		out.println("<P>[<A HREF=\"SessionCreateServlet\">Reload</A>]&nbsp;");
		out.println("[<A HREF=\"SessionDestroyServlet\">Destroy Session</A>]");
		out.println("<h2>Session created Successfully</h2>");
		out.println("Look at the OC4J Console to see whether the HttpSessionEvent was invoked");
		out.println("<h3>Session Data:</h3>");
		out.println("New Session: " + session.isNew());
		out.println("<br>Session ID: " + session.getId());
		out.println("<br>Creation Time: " + new Date(session.getCreationTime()));
		out.println("<br>Last Accessed Time: " + new Date(session.getLastAccessedTime()));
		out.println("<BR>Number of Accesses: " + session.getAttribute("counter"));
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
