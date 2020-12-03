package com.poorani.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/welcome")
public class filter1 implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Wow, Its working");
		PrintWriter pw=response.getWriter();
		HttpServletRequest req=(HttpServletRequest) request;
		int passs=Integer.parseInt(req.getParameter("pass"));
		//System.out.println(passs);
		String user=req.getParameter("name");
		if(user.startsWith("employee"))
			{
				{if(passs==1234)	
					
					((HttpServletResponse) response).sendRedirect("front_page.html");
					
					//chain.doFilter(request, response);
					else
						pw.println("<h1>It is not a user login</h1>");
				}
						}
		else if(user.equals("admin"))
		{
			{if(passs==1234)	
				
				((HttpServletResponse) response).sendRedirect("admin.html");
				
				//chain.doFilter(request, response);
				else
					pw.println("<h1>It is not a admin login</h1>");
			}
					}
					//((HttpServletResponse) response).sendRedirect("employee.html");
		else
			pw.println("<h1 style=\"margin-top: 240px;text-align: center;color:red;font-size:60px;\">User Unauthorized...</h1>");
			
	}

}