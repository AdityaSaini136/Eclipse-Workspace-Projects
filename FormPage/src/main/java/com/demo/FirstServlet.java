package com.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init() invoked");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Service() invoked");
		String userName = req.getParameter("uname");
		String password = req.getParameter("password");
		System.out.println(userName+" : "+password);
		resp.getWriter().print("Welcome :>>  "+ userName);
		if("Aditya".equals(userName) && "12345".equals(password)) {
			req.getRequestDispatcher("/home.html").forward(req, resp);
		}else {
			req.setAttribute("msg", "Invaild user credential,please try again..");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}
	}
	@Override
	public void destroy() {
		System.out.println("Destroy () invoked");
	}
}
