package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DeleteServelet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "invalid session.........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			String pcode=req.getParameter("pcode");
			
		}
	}

}
