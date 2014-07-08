package CH02;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class BusinessA {
	DatabaseFactory df = new DatabaseFactorImpl();
	Database db = df.getDatabase();
 
	Connection con = db.getConnection();
 
	public void insert(String id, String code, int quality){
		String query ="insert into product values('"+id+"', '"+code+"', "+ quality+")";
		try{
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
