package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogOutServelet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg",  "sesssion expired.......<br>");
		}
		else {
			hs.removeAttribute("abean");
			hs.removeAttribute("al");
			hs.invalidate();
			req.setAttribute("msg", "Lofged out Succesfully.........<br>");
		}
		req.getRequestDispatcher("msg.jsp").forward(req, res);
	}

}
