package CH02;

import java.sql.*;
import java.io.*;
import java.util.Vector;


public interface Database {
	public Connection getConnection();
}
