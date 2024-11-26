package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/viewall")
public class ViewProductCustSer  extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession  hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "products not available......<br>");
		}
		else {
			ArrayList<ProducTBean> al=new VewproductDAO().retrieve();
			hs.setAttribute("al", al);
			req.getRequestDispatcher("viewprocust.jsp").forward(req, res);
		}
		
	}

}
