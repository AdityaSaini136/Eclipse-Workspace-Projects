package com.cart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.beans.Product;
import com.cart.service.ProductService;
import com.cart.service.Impl.ProductServiceImpl;
@WebServlet("/products/*")
public class ProductController extends HttpServlet{
	private ProductService productService;
	@Override
	public void init() throws ServletException {
		productService = new ProductServiceImpl();
		super.init();}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		PrintWriter writer = resp.getWriter();
		if(uri.endsWith("add")) {
			String pName = req.getParameter("productName");
			double price = Double.parseDouble(req.getParameter("price"));
			String mfgDate = req.getParameter("mfgDate");
			int quentity = Integer.parseInt(req.getParameter("qty"));
			Product product =new Product(pName,price,mfgDate,quentity);
			boolean res = productService.save(product);
			if(res) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("add_product.jsp");
				requestDispatcher.forward(req, resp);
				writer.write("Product Added to inventotry, again buy any product");
			}else {
				writer.write("Couldn't Add Product to inventotry");
			}
		}else if(uri.endsWith("getAll")) {
			List<Product> products = productService.getAll();
			/*
			writer.write("<table border='1'>");
			writer.write("<th>Name</th>");
			writer.write("<th>Mfg Date</th>");
			writer.write("<th>Price</th>");
			writer.write("<th>Quantity</th>");
			for(Product p : products) {
				writer.write("<tr>");
				writer.write("<td>"+p.getName()+"</td>");
				writer.write("<td>"+p.getMfgDate()+"</td>");
				writer.write("<td>"+p.getPrice()+"</td>");
				writer.write("<td>"+p.getQuantity()+"</td>");
				writer.write("<td> <input type='button' value='Edit' onclick='edit("+p.getId()+")'/></td>");
				writer.write("<td> <input type='button' value='Delete' onclick='delete("+p.getId()+")'/></td>");
				writer.write("</tr>");
			}
			writer.write("</table>");

			 */
			req.setAttribute("products", products);
			req.getRequestDispatcher("/show_products.jsp").forward(req, resp);

		}else if(uri.endsWith("delete")) {
			int id = Integer.parseInt(req.getParameter("id"));

			boolean result = productService.delete(id);
			req.setAttribute("result", result);
			req.getRequestDispatcher("getAll").forward(req, resp);
		}if(uri.endsWith("edit")) {
			String pName = req.getParameter("productName");
			double price = Double.parseDouble(req.getParameter("price"));
			String mfgDate = req.getParameter("mfgDate");
			int quentity = Integer.parseInt(req.getParameter("qty"));
			int id = Integer.parseInt(req.getParameter("id"));
			Product product =new Product(pName,price,mfgDate,quentity);
			product.setId(id);
			
			boolean res = productService.update(product);
			if(res) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAll");
				requestDispatcher.forward(req, resp);
				writer.write("Product updated to inventotry");
			}else {
				writer.write("Couldn't update Product to inventotry");
			}
		}
	}
}