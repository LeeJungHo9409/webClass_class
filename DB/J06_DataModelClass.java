package DB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class J06_DataModelClass {
	public static void main(String[] args) {
		
		//DB에서 꺼내온 데이터는 데이터 모델 클르스에 넣어두는 것이 좋다
		ArrayList<Fruit> fruitArr = new ArrayList<>();
		ArrayList<Origin> originArr = new ArrayList<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String sql = "";
		
		System.out.println("SQL 구문 >> ");
		try {
			 sql = in.readLine();
		}catch (IOException e1) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		
		
		String table1="", table2 = "";
		String[] sqlStr = sql.split(" ");
		
		for(int i=0; i<sqlStr.length; i++) {
			if(sqlStr[i].contains("from")) {
				table1 = sqlStr[i+1];
			}else if(sqlStr[i].contains("join")) {
				table2 = sqlStr[i+1];
			}
		}
		
		String selectSql1 = "select * from " + table1;
		String selectSql2 = "select * from " + table2;
		System.out.println(table1 + " " + table2);
		
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
				
			ResultSet selectRs1 = pstmt.executeQuery();
			ResultSet selectRs2 = pstmt.executeQuery();
		){
			ResultSetMetaData meta = rs.getMetaData();
			
			//System.out.println(meta.get));;
			
			while(rs.next()) {		
				
				Object[] objs = new Object[meta.getColumnCount()];
				
				for(int col = 1; col<=meta.getColumnCount(); col++) {
					if(rs.getString(meta.getColumnName(col)) != null) {
						objs[col - 1] = rs.getObject(meta.getColumnName(col));	
					}else {
						objs[col - 1] = "null";
					}
					
					//System.out.print(rs.getObject(meta.getColumnName(col)).toString() + " ");
				}
				//System.out.println();
				
				fruitArr.add(new Fruit(objs));
				
				/*
				Origin origin = new Origin(rs.getInt(1), rs.getString(6), rs.getString(7), rs.getInt(8));
				originArr.add(origin);
				fruitArr.add(new Fruit(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(1), origin));
				*/
			}
			
			System.out.println(fruitArr.toString());
			System.out.println(originArr.toString());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

// Data Model
class Fruit{
	Object[] objs;
	
	public Fruit(Object[] objs) {
		this.objs = objs;
	}
	
	@Override
	public String toString() {
		String str = " ";
		
		for(Object obj : objs) {
			str += obj.toString() + " ";
		}
		
		return String.format("[%s]\n", str);
	}
	
}

class Origin{
	Integer code;
	String kor;
	String eng;
	Integer weater;
	
	public Origin(Integer code, String kor, String eng, Integer weater) {
		this.code = code;
		this.kor = kor;
		this.eng = eng;
		this.weater = weater;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %s, %s, %d]\n", code, kor, eng, weater);
	}
}


/*
 * class Fruit{
	Integer fid;
	String fname;
	String grade;
	Integer fsize;
	
	Integer code;
	Origin origin;
	
	public Fruit(Integer fid, String fname, String grade, Integer fsize, Integer code, Origin origin) {
		this.fid = fid;
		this.fname = fname;
		this.grade = grade;
		this.fsize = fsize;
		this.code = code;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %s, %s, %d, %d]\n", fid, fname, grade, fsize, code);
	}
	
}

class Origin{
	Integer code;
	String kor;
	String eng;
	Integer weater;
	
	public Origin(Integer code, String kor, String eng, Integer weater) {
		this.code = code;
		this.kor = kor;
		this.eng = eng;
		this.weater = weater;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %s, %s, %d]\n", code, kor, eng, weater);
	}
}
 */
