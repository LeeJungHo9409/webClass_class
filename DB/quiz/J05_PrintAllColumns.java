package DB.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import DB.DBConnector;

public class J05_PrintAllColumns {

	// employees의 모든 컬럼 내용을 콘솔에 출력해보세요.
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String sql = "";
		System.out.println("SQL 구문 >> ");
		try {
			 sql = in.readLine();
		}catch (IOException e1) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		//String sql = "SELECT * FROM employees order by last_name";
		
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			ResultSetMetaData mata = rs.getMetaData();
			
			int len;
			
			for(int col = 1; col <= mata.getColumnCount(); col++) {
				len = mata.getColumnDisplaySize(col);
				//System.out.print(len + " ");
				System.out.printf("%"+ mata.getColumnDisplaySize(col) +"s|", mata.getColumnLabel(col));
				System.out.printf("%d", len - mata.getColumnLabel(col).length());
			}
			
			System.out.println();
			
			while(rs.next()) {
				for(int col = 1; col <= mata.getColumnCount(); col++) {
					len = mata.getColumnDisplaySize(col);
					//int len = Math.abs(mata.getColumnDisplaySize(col) - rs.getString(mata.getColumnLabel(col)).length());
					//System.out.println((mata.getColumnDisplaySize(col)+len));
					System.out.printf("%"+ (len- mata.getColumnLabel(col).length()) +"s|", rs.getString(mata.getColumnLabel(col)));
					//System.out.printf("%d",);
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
