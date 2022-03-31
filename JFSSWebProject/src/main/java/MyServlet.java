

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.Product;
import View.*;
import Controller.*;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    public MyServlet() {
//        super();
//    }
//
//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("Intialization of server");
//	}

//	public void destroy() {
//		System.out.println("It will stop  all method");
//	}
//
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	System.out.println("Request Handler");
//	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		String productid=request.getParameter("ProductID");
//		response.sendRedirect("productReceivePage.jsp");
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection=null;
	    PreparedStatement pst=null;
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String productid=request.getParameter("ProductID");
		String productname=request.getParameter("Productname");
		Integer Productquantity=Integer.parseInt(request.getParameter("Productquantity"));
		Integer Productrate=Integer.parseInt(request.getParameter("Productrate"));
		
//		request.setAttribute("productid", productid);
//		request.setAttribute("productname", productname);
//		request.setAttribute("Productquantity", Productquantity);
//		request.setAttribute("Productrate", Productrate);
//		request.getRequestDispatcher("productReceivePage.jsp").forward(request, response);
		
//	
//		if(productid.equals("P100")&& productname.equals("mobile")&& Productquantity.equals(Productquantity) && Productrate.equals(Productrate))
//		{
//			response.sendRedirect("productReceivePage.jsp");
//		}
		
		Product product=new Product(productid,productname,Productquantity,Productrate);
	  	System.out.println(product);
	  	
	  	request.setAttribute("ProdDetails", product);
	  	request.getRequestDispatcher("ProductPage.jsp").forward(request, response);
		

//		ProductView productview=new ProductView();
//		ProductController productcontroller=new ProductController();
//		productcontroller.save();
//		productcontroller.modify();
	}

}
