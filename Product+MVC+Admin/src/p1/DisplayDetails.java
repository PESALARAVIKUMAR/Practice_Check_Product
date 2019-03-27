package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayDetails
 */
@WebServlet("/DisplayDetails")
public class DisplayDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayDetails() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		ArrayList<Product> list=new ArrayList<Product>();
		Product p=new Product();
		p.setCategory(request.getParameter("category"));
		list=ProductDAO.GetDetails(p.getCategory());
		out.print("<br><table width='100%' border:1px");
		out.print("<tr><th>Product Id</th><th>Product Name</th><th>Category</th><th>Description</th><th>Price</th><th>Quantity</th><th>EDIT</th><th>DELETE</th></tr>");
		for(Product pp:list){
			out.print("<tr><td>"+pp.getId()+"</td><td>"+pp.getName()+"</td><td>"+pp.getCategory()+"</td><td>"+pp.getDescription()+"</td><td>"+pp.getPrice()+"</td><td>"+pp.getQuantity()+"</td><td><a href='UpdateDetails.jsp?id="+pp.getId()+"'><button>edit</button></a></td><td><a href='DeleteDetails.jsp?id="+pp.getId()+"'><button>delete</button></a></td></tr>");
		}
		out.print("</table><br>");
		}

}
