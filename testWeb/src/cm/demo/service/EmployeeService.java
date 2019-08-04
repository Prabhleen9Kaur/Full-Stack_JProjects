package cm.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeService {
	try {
		Connection con;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost/jun2019?serverTimezone=");
		
	    
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	public List<Employee> viewAll(){
		
	}

}
