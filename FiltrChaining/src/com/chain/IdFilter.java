package com.chain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addAlien")
public class IdFilter implements Filter {

    
    public IdFilter() {
       
    }

	
	public void destroy() {
		
	}

	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out =response.getWriter();
		
		HttpServletRequest req=(HttpServletRequest) request ;
		int aid=Integer.parseInt(req.getParameter("aid"));
		if(aid>=1)
		{
			chain.doFilter(request, response);
		}
		else
			out.println("invalid input");
		
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
