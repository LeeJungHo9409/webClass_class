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
	����ڷκ��� �̸��� �Է¹����� �ش� �̸��� ���Ե� ��� ����� ��ȸ�غ�����.
	
	1. ��ҹ��� ���о��� ��� �˻��Ǿ�� ��
	
	2. first_name�� last_name�� ��� �˻��ؾ���.
*/
public class J01_SearchByName {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		//scanner ���� �ٸ� ��� / Scanner���� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		String name = "";
		System.out.println("���Ͻô� ����� �̸��� �ۼ����ּ��� : ");
		try {
			System.out.print("Ű���� > ");
			name = in.readLine();
		} catch (IOException e1) {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
		//String name = input.next();
		
		dbConnection(name);
		
		System.out.println("���� �Ϸ� / ���α׷��� �����մϴ�.");
		
	}
	
	public static void dbConnection(String keyword) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc ���� ����");
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
			System.out.println("����Ŭ DB ���� (hr) ���� ����");		
		}
	}

}
