package test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/addpro")
public class AddproductSer extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg","session expired........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else {
			ProducTBean p=new ProducTBean();
			p.setCode(req.getParameter("pcode"));
			p.setName(req.getParameter("pname"));
			p.setPrice(Long.parseLong(req.getParameter("pprice")));
			p.setQty(Integer.parseInt(req.getParameter("pqty")));
			int k=new ProductDAO().insert(p);
			if(k>0) {
			req.setAttribute("msg", "product add succes fully........<br>");
			req.getRequestDispatcher("addproduct.jsp").forward(req, res);
			}
			
		}
		
		
		
		
		
	}

}
