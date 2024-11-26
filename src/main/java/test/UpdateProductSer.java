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
@WebServlet("/upd")
public class UpdateProductSer extends HttpServlet {
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	  HttpSession hs=req.getSession();
	  if(hs==null) {
		  req.setAttribute("msg", "session expired........<br>");
		  req.getRequestDispatcher("msg,jsp").forward(req, res);
		  
	  }
	  else {
		  String pcode=req.getParameter("pcode");
		  double price=Double.parseDouble(req.getParameter("price"));
		  int qty=Integer.parseInt(req.getParameter("quantity"));
		  @SuppressWarnings("unchecked")
		ArrayList<ProducTBean> al=(ArrayList<ProducTBean>)hs.getAttribute("al");
		  Iterator<ProducTBean> it=al.iterator();
		  while(it.hasNext()) {
			  ProducTBean pb=(ProducTBean)it.next();
			  if(pcode.equals(pb.getCode())) {
				  pb.setPrice(price);
				  pb.setQty(qty);
				  int k=new UpdateProductDAo().update(pb);
				  if(k>0) {
					  req.setAttribute("msg", "product update succesfully.........<br>");
					  req.getRequestDispatcher("updateproduct.jsp").forward(req, res);
				  }
				  break;
				  
			  }
			  
			  
			  
			  
			  
			  
		  }
	  }
	  
  }
}
