package jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class TestDB {
	Connection con;
	Statement st;
	
	TestDB(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jun2019?serverTimezone=UTC","root","prabhleen");
		    if(con!= null) {
		    	System.out.println("Connected to MYSQL");
		    	st = con.createStatement();
		    	//int num = st.executeUpdate("insert into employees (fname, lname, age, salary) values ('John', 'Williams', 30, 98765.43)");
		    	//num += st.executeUpdate("insert into employees (fname, lname, age, salary) values ('Tom', 'Hanks', 28, 99933.66)");
               // System.out.println(num + " rows inserted!");
		    	fetchEmployees();
		    }
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fetchEmployees() {
		try {
			ResultSet rs = st.executeQuery("select * from employees where eid <+10");
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			int count = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i<=count; i++) {
					System.out.println(rsmd.getColumnName(i) + ":"+ rs.getString(i));
					}
				/*System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getInt(4));
				System.out.println(rs.getInt(5));*/
				System.out.println("---------------");
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	
	public static void main(String[] args) {
		new TestDB();
	}

}
