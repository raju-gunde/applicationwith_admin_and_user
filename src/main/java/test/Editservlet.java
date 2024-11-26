package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/edit")

public class Editservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		HttpSession hs=req.getSession();
		if(hs==null) {
			
			req.setAttribute("msg", "session expired...............<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			
			String pcd=req.getParameter("pcode");
			
			ArrayList<ProducTBean> al=(ArrayList<ProducTBean>) hs.getAttribute("al");
			Iterator<ProducTBean> it=al.iterator();
			while(it.hasNext()) {
				ProducTBean pb=(ProducTBean)it.next();
				if(pcd.equals(pb.getCode())) {
					req.setAttribute("pb", pb);
					req.getRequestDispatcher("editproduct.jsp").forward(req, res);
				}
			}
			
		}
		
		
		
		
	}

}
