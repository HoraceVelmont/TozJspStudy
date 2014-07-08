package CH02;

import java.sql.*;

public class DatabaseFactorImpl implements DatabaseFactory{
	private Database db;
	public Database getDatabase(){
		db = new DatabaseImpl();
		return db;
	}
}
