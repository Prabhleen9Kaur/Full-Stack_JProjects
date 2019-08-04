package cm.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserService {
	
	Connection con;
	
	public UserService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jun2019?serverTimezone=UTC","root","prabhleen");
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public boolean login() {
		
			try {
				PreparedStatement ps = con.prepareStatement("select");
			    ps.setString(1, uname);
				ps.setString(2, pword);
				ResultSet rs =ps.executeQuery();
				if(rs.next()) {
					return true;
				}
			
			}

	}

}
