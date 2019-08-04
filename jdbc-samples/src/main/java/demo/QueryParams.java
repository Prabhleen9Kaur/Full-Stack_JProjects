package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class QueryParams {
	Connection con;
    Statement st ; 
	QueryParams(String name, double sal){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jun2019?serverTimezone=UTC","root","prabhleen");
	    st = con.createStatement();
	    
	    st.executeUpdate("update employees set salary=" +sal+ "where fname='"+name+ "'");
	    PreparedStatement ps = con.prepareStatement("update employees set salary=? where fname=?");
	    ps.setDouble(1, sal);
	    ps.setString(2,name);
	    int x = ps.executeUpdate();
	    System.out.println(x);
	
	} 
	
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new QueryParams(args[0], Double.parseDouble(args[1]));
		
	}
}
	
}
