package com.example.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(value = "/filter.jsp")
public class HelloWorldFilter extends MyGenericFilter {

	private FilterConfig filterConfig;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("Entering Filter");
		request.setAttribute("hello", "Hello World!");
		chain.doFilter(request, response);
		System.out.println("Exiting HelloWorldFilter");
	}

}
