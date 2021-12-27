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
			System.out.println("오라클 JDBC 드라이브 연결 성공");
		}catch (Exception e) {
			System.out.println("오라클 JDBC 드라이브 연결 오류");
		}
	}
	
	public static void main(String[] args) {
		
		/*
			SQL INJECTION
				ex) 변수에 값을 바꿔버리면 DB가 고장날 가능성을 가지고 해커들이 공격하는 방식 
		 */
		int employee_id = 150;
		String keyword = "%t%";
		
		// 해커를 막기 위해선 ? 를 사용해서 값을 정해야한다.
		String sql = "SELECT * FROM employees WHERE employee_id > ? AND lower(first_name) like lower(?)";
		
		try (
				Connection conn = DriverManager.getConnection(url, user_id, user_pass);
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {		
			
			System.out.println("DB_LOCAL_HOST 연결 성공하였습니다.");
			
			// 1, 2, .... n번 물음표 지정
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
			System.out.println("DB_LOCAL_HOST 연결 실패하였습니다.");
		}

	}

}
