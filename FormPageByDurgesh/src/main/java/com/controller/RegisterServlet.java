package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setContentType("/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1> Welcome to Register Servlet </h>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String usergender = req.getParameter("user_gender");
		String coursename = req.getParameter("course_name");
		String condition = req.getParameter("condition");
		if(condition!=null) {
		if(condition.equals("checked")) {
		writer.print("<h1> Name :" +name+  "<h1>");
		writer.print("<h1> Password :" +password+  "<h1>");
		writer.print("<h1> Email :" +email+  "<h1>");
		writer.print("<h1> Gender :" +usergender+  "<h1>");
		writer.print("<h1> CourseName :" +coursename+  "<h1>");
		}
	}else {
		writer.print("<h1> Sorry Please accpeted the all tearm & Condition");
	}
}
}