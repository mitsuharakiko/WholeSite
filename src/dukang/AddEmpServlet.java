package dukang;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddEmpServlet extends HttpServlet{
	public void service (HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		double salary = Double.valueOf(req.getParameter("salary"));
		int age = Integer.valueOf(req.getParameter("age"));
		
		Connection conn =  null;
		PreparedStatement stat = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hydra","root","lm345za8jsxbdwfh");
			if (conn != null) {
				System.out.println("连接成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		pw.print("<h1>员工信息</h1>");
//		pw.print("<h1>员工姓名:"+ name +"</h1>");
//		pw.print("<h1>员工工资:"+ salary +"</h1>");
//		pw.print("<h1>员工年龄:"+ age +"</h1>");
	}
}
