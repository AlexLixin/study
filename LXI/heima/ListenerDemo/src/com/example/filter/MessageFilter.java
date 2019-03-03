package com.example.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/filter2.jsp", initParams = @WebInitParam(name = "message", value = "A message for you!"))
public class MessageFilter extends MyGenericFilter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Entering MessageFilter");
		String message = filterConfig.getInitParameter("message");
		request.setAttribute("message", message);
		chain.doFilter(request, response);
		System.out.println("Exiting MessageFilter");

	}

}
