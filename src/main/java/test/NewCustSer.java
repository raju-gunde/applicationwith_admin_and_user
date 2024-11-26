package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/newcust")
public class NewCustSer extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		Customebean ab=new Customebean();
		ab.setUname(req.getParameter("cname"));
		ab.setPword(req.getParameter("cpass"));
		ab.setFname(req.getParameter("cfname"));
		ab.setLname(req.getParameter("clname"));
		ab.setAddr(req.getParameter("caddr"));
	    ab.setMid(req.getParameter("cmid"));
	    ab.setPhno(Long.parseLong(req.getParameter("cphno")));
	    NewCustDAO ad=new NewCustDAO();
	    int k=ad.insert(ab);
	    
	    if(k>0) {
	    	req.setAttribute("msg", "user register succesfully...<br>");
	    	req.getRequestDispatcher("customerreg.jsp").forward(req, res);
	    }
			
	
		
	}
	

}
