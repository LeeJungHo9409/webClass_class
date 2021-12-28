package DB.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

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
			
			//------------------------강사님 코딩------------------------------
			int colSize = mata.getColumnCount();
			
			Column[] cols = new Column[colSize];
			for(int i = 0; i<colSize; ++i) {
				cols[i] = new Column(mata.getColumnName(i+1));
			}
			
			while(rs.next()) {
				for(int i = 0; i<colSize;++i) {
					cols[i].content.add(rs.getObject(i+1));
				}	
			}
			
			// 알맞은 columndisplaySize 계산
			for(int i = 0; i<colSize; ++i) {
			 	cols[i].update();
			}
			
			int rowsize = cols[0].content.size()+2;
			
			for(int i = 0; i< rowsize; ++i) {
				for(int j = 0; j<cols.length; ++j) {
					if(i==0) {
						System.out.printf("%-"+cols[j].columnDisplaySize+"s|",cols[j].columnName + "\t");
					}else if(i == 1){
						for(int cds = 0; cds <= cols[j].columnDisplaySize; ++cds) {
							if(cds == cols[j].columnDisplaySize) {
								System.out.print("┼");
							}else {
								System.out.print("─");
							}
							
						}
						
					}else{
						System.out.printf("%-"+cols[j].columnDisplaySize+"s|",cols[j].content.get(i-2) + "\t");
					}
				}
				
				System.out.println();
				
			}
			
			//-----------------------------------------------------------
			
			/*
			//------------------- 마이 코딩 ---------------------------
			for(int col = 1; col <= mata.getColumnCount(); col++) {	
				System.out.printf("%-20s|", mata.getColumnLabel(col));
			}
			
			System.out.println();
			
			while(rs.next()) {
				for(int col = 1; col <= mata.getColumnCount(); col++) {
					System.out.printf("%-20s|", rs.getString(mata.getColumnLabel(col)));
				}
				System.out.println();
			}*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Column {
	String columnName;
	ArrayList<Object> content;
	int columnDisplaySize;
	
	public Column(String columnName) {
		this.columnName = columnName;
		this.content = new ArrayList<>();
	}
	
	public void update() {
		int rowSize = content.size();
		
		for(int i = 0; i<content.size() + 1; ++i){
			int len = String.format("%s", content.get(i)).length();
			columnDisplaySize = columnDisplaySize < len ? len:columnDisplaySize;
		}
		
		int len = columnName.length();
		columnDisplaySize = columnDisplaySize < len ? len : columnDisplaySize;
	}
	
}
