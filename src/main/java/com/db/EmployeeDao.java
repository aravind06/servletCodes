package com.db;

import java.sql.*;

import com.dto.Employee;

public class EmployeeDao {

	public Employee getEmployee(int id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_info", "root", "password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee_table where employee_id="+id);
		rs.next();
		Employee emp = new Employee();
		
		emp.setEmployee_id(rs.getInt("employee_id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getInt("salary"));
		emp.setState(rs.getString("state"));
		
		rs.close();
		con.close();
		
		return emp;
	}
	
}
