package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J04_Transaction {
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
	
	static void allFruits(PreparedStatement pstmt) throws SQLException {
		ResultSet rs = pstmt.executeQuery();
		
		System.out.println();
		System.out.println("----------------------");
		System.out.printf("%s\t%-15s%s\n", "FID", "FNAME", "FSIZE");
		System.out.println("----------------------");
		while(rs.next()) {
			System.out.printf("%d\t%-15s%d\n",
					rs.getInt("fruit_id"),
					rs.getString("fruit_name"),
					rs.getInt("fruit_size")
					);
		}
		
		rs.close();
	}

	public static void main(String[] args) {
		String sql = "UPDATE fruits6 set fruit_size=fruit_size + 1";
		String select = "SELECT * FROM fruits6 order by fruit_id"; 
		
		try (
			Connection conn = DriverManager.getConnection(url, user_id, user_pass);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			PreparedStatement selectPstmt = conn.prepareStatement(select);
		) {			
			conn.setAutoCommit(false);
			
			allFruits(selectPstmt);
			
			pstmt.executeUpdate();
			allFruits(selectPstmt);
			
			conn.rollback();
			
		} catch (SQLException e) {
			System.out.println("연결 실패");
		}
		
	}

}
