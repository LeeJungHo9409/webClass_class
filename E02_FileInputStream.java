import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	
 */

public class E02_FileInputStream {
	public static void main(String[] args) {
		
		FileInputStream fileInput = null;
		FileInputStream fileInput2 = null;
		
		try {
			fileInput = new FileInputStream("practice/abc.txt");
			//read() = 1byte씩 읽어드림. 더 이상 읽을 것이 없다면 -1을 반환한다.
//			int data;
//			while ((data = fileInput.read())!=-1) {
//				System.out.println((char)data);
//			}
			
//			String allData = new String(fileInput.readAllBytes());
//			System.out.println(allData);
			
			/*
			byte[] buffer = new byte[20];
			System.out.println("1번");
			int len = fileInput.read(buffer);
			System.out.println(new String(buffer, 0, len));
			
			System.out.println("2번");
			len = fileInput.read(buffer);
			System.out.println(new String(buffer, 0, len));*/
			
			// 연습 : byte[] 방식으로 모든 파일의 내용을 출력할 수 있는 반복문 작성
			int len;
			byte[] buffer = new byte[20];
			while ((len = fileInput.read(buffer))!=-1) {
				System.out.print(new String(buffer, 0, len));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
