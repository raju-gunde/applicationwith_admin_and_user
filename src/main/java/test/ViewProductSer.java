package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/view")

public class ViewProductSer extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "invalid view product details........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else {
			ArrayList<ProducTBean> al=new VewproductDAO().retrieve();
			hs.setAttribute("al", al);
			req.getRequestDispatcher("viewproduct.jsp").forward(req, res);
			
		}
	}

}

