

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	
	/*
		# Java I/O (Input/Output)
		
		 - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다.
		 - 프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다 (Input)
		 - 프로그램에서 계싼되어 나가는 데이터들을 출력이라고 부른다 (Output)
		 
		# Stream
		 
		 - 데이터들이 오가는 통로
		 - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다.
		 - 데이터들이 프로그램에서 목적지로 나가는 통로를 OutputStream이라고 부른다.
		 - 데이터를 Stream을 통해 전송하기 위해서는 byte타입으로 변환시켜야 한다.
	 */
	
	public static void main(String[] args) {
		try {
			//폴더가 붙으면 폴더를 만들 수 없기 때문에 찾을 수 없다 표현됨.
			FileOutputStream out = new FileOutputStream("practice/abc.txt");
			
			out.write(48);
			out.write(49);
			out.write(50);
			out.write(51);
			
			// String.getBytes() : 문자열을 전송하기 위해 byte[]로 변환하는 메서드
			out.write("가나다라마바사 아자타카타파하".getBytes());
			
			//닫는 타이밍을 사용자에게 줌.
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 읎음");
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 쓰기 도중 문제 발생.");
			System.exit(0);
		}
		
		System.out.println("작성완료");
	}
	
}
