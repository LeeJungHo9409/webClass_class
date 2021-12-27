package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_MetaData {
	
	public static void main(String[] args) {
		String sql = "SELECT * FROM employees";
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			//쿼리 metaData : 해당 쿼리 실행 결과에 대한 정보를 담고 있는 데이터
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("쿼리 실행 결과의 컬럼 개수 : " 
					+ meta.getColumnCount());
			for(int col = 1; col<=meta.getColumnCount(); col++) {
				System.out.printf("%s", meta.getColumnLabel(col));
				for(int i = 0; i<meta.getColumnDisplaySize(col); i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		} catch (SQLException e) {
			System.out.println("연결 실패");
		}
	}

}
