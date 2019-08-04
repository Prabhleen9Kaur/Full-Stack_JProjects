
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConn {
Connection connection = null;
Statement stmt = null;

DatabaseConn()
{
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@ec2-3-18-106-7.us-east-2.compute.amazonaws.com:1521:xe", "system", "oracle");	

if(connection!=null)
{
System.out.println("Connecting to oracle");


   
}
stmt = connection.createStatement();

    String sql = "select * from t1";
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
    int id = rs.getInt("id");
        String first = rs.getString("name");
        
        //Display values
        System.out.println("id:"+id+" name:" + first);
    }
     rs.close();
} catch (ClassNotFoundException e) {
e.printStackTrace();
// LOG.fatal("message");
} catch (SQLException e) {
e.printStackTrace();
// LOG.fatal("message");
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new DatabaseConn();

}

}
