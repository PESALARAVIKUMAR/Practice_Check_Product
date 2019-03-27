package p1;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	static int k=0;
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		//System.out.println("hi");
		String un=request.getParameter("name");
		//System.out.println(un);
		String pwd=request.getParameter("pwd");
		//System.out.println(pwd);
		if((un.equals("admin")) && (pwd.equals("admin")) && (k<3))
		{
			out.println("<script>alert('Success')</script>");
			request.getRequestDispatcher("Frame1.html").forward(request,response);

		}
		else
		{
			k++;
			//System.out.println(k);
			if(k<3)
			{
				out.println("<script>alert('Invalid UserName or Password')</script>");
				//request.getRequestDispatcher("Login.jsp").include(request,response);
				response.sendRedirect("Login.jsp");
			}						
			else
			{
				out.println("<script>alert('Account Blocked')</script>");
				out.println("Kindly reset your password");
			}
				
		}
	}

}
