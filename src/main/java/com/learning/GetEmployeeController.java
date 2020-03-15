package com.learning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.EmployeeDao;
import com.dto.Employee;


public class GetEmployeeController extends HttpServlet {
	
    
	
	private static final long serialVersionUID = -2667298936138437616L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("empid"));
		EmployeeDao dao = new EmployeeDao();
		try {
			Employee emp = dao.getEmployee(empid);
			request.setAttribute("emp", emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("showEmp.jsp");
		rd.forward(request, response);
	}

	

}
