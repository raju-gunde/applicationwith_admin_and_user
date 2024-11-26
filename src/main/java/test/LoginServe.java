package test;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class LoginServe extends HttpServlet{
	@Override
   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
   {
	
		String uname=req.getParameter("aname");
		String pass=req.getParameter("pass");
		AdminBean ab=new LoginDAO().login(uname, pass);
		if(ab==null) {
			req.setAttribute("msg", "invalid login..........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("login.jsp").forward(req, res);
			
		}
		
		
		
   }

}
