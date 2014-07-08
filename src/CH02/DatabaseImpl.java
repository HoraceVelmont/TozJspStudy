package CH02;
import java.sql.*;

public class DatabaseImpl implements Database{
	private Connection con;
	private Statement stmt;
	private ResultSet rset;
 
	public DatabaseImpl(){
		String server ="localhost";
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
 
		try{
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","autoset");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
 
	public Connection getConnection(){
		return con;
	}
}
