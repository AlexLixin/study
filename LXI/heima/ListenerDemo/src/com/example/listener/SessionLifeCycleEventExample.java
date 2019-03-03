package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionLifeCycleEventExample implements ServletContextListener, HttpSessionListener {

	ServletContext servletContext;

	public SessionLifeCycleEventExample() {
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		log("CREATE", arg0);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		HttpSession session = arg0.getSession();
		long start = session.getCreationTime();
		long end = session.getLastAccessedTime();
		String counter = (String) session.getAttribute("counter");
		log("DESTROY, Session Duration:" + (end - start) + "(ms) Counter:" + counter, arg0);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		servletContext = arg0.getServletContext();
	}

	protected void log(String msg, HttpSessionEvent hse) {
		String ID = hse.getSession().getId();
		log("SessionID:" + ID + "   " + msg);
	}

	protected void log(String msg) {
		System.out.println("[" + getClass().getName() + "]" + msg);
	}

}
