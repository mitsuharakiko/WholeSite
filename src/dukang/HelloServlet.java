package dukang;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public void service (HttpServletRequest req, HttpServletResponse res) 
		throws ServletException,IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		out.print("<h1>Hello,"+ name + "<h1>");
		String[] contacts = req.getParameterValues("contact");
		if (contacts != null) {
			out.print("<h1>Contact Informations:</h1>");
			for (String info : contacts) {
				out.print("<h1>"+info+"</h1>");
			}
		}
	}
}
