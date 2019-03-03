package com.example.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class GenericResponseWrapper extends HttpServletResponseWrapper {
	private StringWriter output;

	public String toString() {
		return output.toString();
	}

	public GenericResponseWrapper(HttpServletResponse response) {
	        super(response);
	        //This creates a new writer to prevent the old one to be closed
	        output = new StringWriter();
	    }

	public PrintWriter getWriter() {
		return new PrintWriter(output, false);
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		// This is the magic to prevent closing stream, create a "virtual" stream that
		// does nothing..
		return new ServletOutputStream() {
			@Override
			public void write(int b) throws IOException {
			}

			@Override
			public boolean isReady() {
				return true;
			}

			@Override
			public void setWriteListener(WriteListener arg0) {
				
			}
		};
	}
}