package com.example.filter;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter(value = "/filter3.jsp")
public class PrePostFilter extends MyGenericFilter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		OutputStream out = response.getOutputStream();
		out.write("<HR>PRE</HR>".getBytes());
		GenericResponseWrapper wrapper = new GenericResponseWrapper((HttpServletResponse) response);
		chain.doFilter(request, wrapper);
		out.write(wrapper.getData());
		out.write("<HR>POST</HR>".getBytes());
		out.close();
	}

}
