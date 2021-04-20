package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String NAME = "root";
    private static final String PASSWORD = "123456";
    
    
    
    
    public static Connection getConnect() {
    	return getConnect(URL, NAME, PASSWORD);
    }
    
    public static Connection getConnect(String url, String user, String pass) {
    	Connection conn = null;
    	
    	try {
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}

    	return conn;
    }
    

}
