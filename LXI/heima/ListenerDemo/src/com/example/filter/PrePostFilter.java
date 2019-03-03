package com.example.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter(value = "/filter3.jsp")
public class PrePostFilter extends MyGenericFilter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Save original writer
		PrintWriter out = response.getWriter();
		// Generate a response wrapper with a different output stream
		GenericResponseWrapper responseWrapper = new GenericResponseWrapper((HttpServletResponse) response);
		// Process all in the chain (=get the jsp response..)
		chain.doFilter(request,responseWrapper);
		// Parse the response
		out.write("BEFORE" + responseWrapper.toString() + "AFTER"); // Just + for clear display, better use a
																	// StringUtils.concat
	}
}
