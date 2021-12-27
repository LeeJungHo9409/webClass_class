package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J03_ExecuteIUpdate {
	
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
		// INSERT, UPDATE, DELETE는 executeUpdate() 메서드를 사용한다.
		
		String sql = "UPDATE fruits6 SET fruit_size = fruit_size+1 WHERE code is null";
		String selectSql = "SELECT * FROM fruits6";
		
		try (
			Connection conn = DriverManager.getConnection(url, user_id, user_pass);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			PreparedStatement select = conn.prepareStatement(selectSql);
		) {
			// insert, update, delete는 resultSet 대신 몇 행이 바뀌었는지 리턴함
			//System.out.println("DB 연결 성공");
			
			int row = pstmt.executeUpdate();
			System.out.printf("%d 행이 변경 되었습니다.\n", row);
			
			ResultSet rs = select.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("fruit_name") + " " + rs.getInt("fruit_size")+"\n");
			}
			
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}

}
