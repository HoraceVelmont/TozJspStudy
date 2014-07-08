package CH02;
import java.sql.*;

public class Business {
	Database db = new Database();
	Connection con = db.getConnection();
 
	public void insert(String id, String code, int quality){
		String query = "insert into product values ( '" + id + "', '"+code+"', "+quality+")";
		try{
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
