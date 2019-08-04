import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcTest {

	Connection con;
	
	StoredProcTest(){
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin@3.18.106.7:1521:XE","system","oracle");
		
			if(con!= null) {
				System.out.println("Connected to Oracle");
				CallableStatement cs =con.prepareCall("{ call p3(?, ? ,?);}");
			
			    cs.setInt(1, 25);
			    cs.setInt(2, 20);
			    cs.registerOutParameter(3, Types.INTERGER);
			    cs.execute();
			    int num = cs.getInt(3);
			    System.out.println("Result is :" + num);
			}
		}catch(E)
		
	}
	
}
