package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnector {
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521/XE";
	private static String user_id = "hr";
	private static String user_pass = "1234";
	
	static {
		try {
			Class.forName(driverName);
			System.out.println("����Ŭ JDBC ����̺� ���� ����");
		}catch (Exception e) {
			System.out.println("����Ŭ JDBC ����̺� ���� ����");
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user_id,user_pass);
	}
	
	/*
	public static PreparedStatement allFruits(String table) {
		return 
	}*/

}