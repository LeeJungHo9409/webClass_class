package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_PrepareStatment {
	
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
	
	public static void main(String[] args) {
		
		/*
			SQL INJECTION
				ex) ������ ���� �ٲ������ DB�� ���峯 ���ɼ��� ������ ��Ŀ���� �����ϴ� ��� 
		 */
		int employee_id = 150;
		String keyword = "%t%";
		
		// ��Ŀ�� ���� ���ؼ� ? �� ����ؼ� ���� ���ؾ��Ѵ�.
		String sql = "SELECT * FROM employees WHERE employee_id > ? AND lower(first_name) like lower(?)";
		
		try (
				Connection conn = DriverManager.getConnection(url, user_id, user_pass);
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {		
			
			System.out.println("DB_LOCAL_HOST ���� �����Ͽ����ϴ�.");
			
			// 1, 2, .... n�� ����ǥ ����
			pstmt.setInt(1, employee_id);
			pstmt.setString(2, keyword);
			
			try(ResultSet rs = pstmt.executeQuery();){
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					
					System.out.println(id + "\t" + name);
				}
			}
			
			
		} catch (SQLException e) {
			System.out.println("DB_LOCAL_HOST ���� �����Ͽ����ϴ�.");
		}

	}

}
