package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/cust")
public class CustomerLoginser extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String uname = req.getParameter("cname");
		String pass = req.getParameter("cpass");
		Customebean cb = new CustomerLoginDAO().login(uname, pass);
		if (cb == null) {
			req.setAttribute("msg", "invalid user .........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		} else {
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			req.getRequestDispatcher("Customerlogin.jsp").forward(req, res);
		}
	}

}
