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
			//���� metaData : �ش� ���� ���� ����� ���� ������ ��� �ִ� ������
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("���� ���� ����� �÷� ���� : " 
					+ meta.getColumnCount());
			for(int col = 1; col<=meta.getColumnCount(); col++) {
				System.out.printf("%s", meta.getColumnLabel(col));
				for(int i = 0; i<meta.getColumnDisplaySize(col); i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		} catch (SQLException e) {
			System.out.println("���� ����");
		}
	}

}
