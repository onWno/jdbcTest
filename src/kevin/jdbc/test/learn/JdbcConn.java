package kevin.jdbc.test.learn;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection jconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kuixian","root", "root");
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
