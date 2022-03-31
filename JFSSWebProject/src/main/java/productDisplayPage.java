

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class productDisplayPage
 */
public class productDisplayPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productDisplayPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unlikely-arg-type")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productid=request.getParameter("ProductID");
		String productname=request.getParameter("Productname");
		String Productquantity=request.getParameter("ProductQuantity");
		Integer prodQty= Integer.parseInt(Productquantity);
		String Productrate=request.getParameter("Productrate");
		Integer price= Integer.parseInt(Productrate);
		Integer Pq= 100;
		Integer rate=1000;
		if(productid.equals("P100")&& productname.equals("mobile")&& Pq.equals(prodQty) && rate.equals(price))
		{
			response.sendRedirect("productReceivePage.jsp");
		}
		
	}

}
