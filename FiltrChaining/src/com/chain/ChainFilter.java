package com.chain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class ChainFilter extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out =res.getWriter();
		
		int aid=Integer.parseInt(req.getParameter("aid"));
		String aname=req.getParameter("aname");
		out.println("welcome " + aname);
	}

}
