package dukang;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SystemDate extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws
		ServletException,IOException {
		res.setContentType("text/html;charset=utf-8");
		Date date = new Date();
		PrintWriter pw = res.getWriter();
		pw.print("当前时间为："+ date);
		pw.close();
	}
}
