import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://" +host +":" + port + "/dbname");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from tablename");
				while(rs.next())
				{
					
				}
	}

}
