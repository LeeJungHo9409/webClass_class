package DB.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
	사용자로부터 이름을 입력받으면 해당 이름이 포함된 모든 사원을 조회해보세요.
	
	1. 대소문자 구분없이 모두 검색되어야 함
	
	2. first_name과 last_name을 모두 검색해야함.
*/
public class J01_SearchByName {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		//scanner 말고 다른 방식 / Scanner보다 빠름
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		String name = "";
		System.out.println("원하시는 사원의 이름을 작성해주세요 : ");
		try {
			System.out.print("키워드 > ");
			name = in.readLine();
		} catch (IOException e1) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		//String name = input.next();
		
		dbConnection(name);
		
		System.out.println("실행 완료 / 프로그램을 종료합니다.");
		
	}
	
	public static void dbConnection(String keyword) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc 연동 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 연동 실패");
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234"
					);
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			//System.out.printf("%d	%d\n", (int)'l', (int)'L');
			
			pstmt = conn.prepareStatement(
					"SELECT * FROM employees "
					+ "where lower(first_name) like lower('%" + keyword + "%') "
					+ "or lower(last_name) like lower('%" + keyword + "%')");
			
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.printf("first_name : %s",rs.getString("first_name"));
				
				if(rs.getString("first_name").length() < 3) {
					System.out.print("\t\t\t");
				}else if(rs.getString("first_name").length() < 10){
					System.out.print("\t\t");
				}else {
					System.out.print("\t");
				}
				
				System.out.printf("last_name : %s\n",rs.getString("last_name"));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("오라클 DB 서버 (hr) 연결 실패");		
		}
	}

}
