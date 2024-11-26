package test;

import java.io.IOException;

import  jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/newadd")

public class AddAdminServe extends HttpServlet{
	@Override
	protected void  doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		AdminBean ab=new AdminBean();
		ab.setAname(req.getParameter("aname"));
		ab.setPword(req.getParameter("apass"));
		ab.setFname(req.getParameter("afname"));
		ab.setLname(req.getParameter("alname"));
		ab.setAddr(req.getParameter("aaddr"));
	    ab.setMid(req.getParameter("amid"));
	    ab.setPhno(Long.parseLong(req.getParameter("aphno")));
	    AddAdminDAO ad=new AddAdminDAO();
	    System.out.println("hhhh");
	    int k=ad.inserts(ab);
	    if(k>0) {
	    	req.setAttribute("msg", "user register succesfully...<br>");
	    	req.getRequestDispatcher("register.jsp").forward(req, res);
	    }
			
	
		
	}

}
