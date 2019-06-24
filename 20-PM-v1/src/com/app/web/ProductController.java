package com.app.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Product;
import com.app.repository.JdbcProductRepository;
import com.app.repository.ProductRepository;

/*
 * 
 *  using 'servlet-api' ( javax.servet.* )
 *  ----------------------------------------
 *  
 *  	- Servlet
 *      - GenericServlet implements Servlet
 *      - HttpServlet
 * 
 */

@WebServlet(urlPatterns = { "/products" })
public class ProductController extends HttpServlet {

	private ProductRepository productRepository;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ProductController :: init()");
		productRepository = new JdbcProductRepository();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ProductController :: doGet()");
		List<Product> products = productRepository.findAll();
		req.setAttribute("products", products);
		req.getRequestDispatcher("/products-view.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("ProductController :: destroy()");
	}

}
