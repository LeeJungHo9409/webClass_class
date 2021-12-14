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
			//read() = 1byte�� �о�帲. �� �̻� ���� ���� ���ٸ� -1�� ��ȯ�Ѵ�.
//			int data;
//			while ((data = fileInput.read())!=-1) {
//				System.out.println((char)data);
//			}
			
//			String allData = new String(fileInput.readAllBytes());
//			System.out.println(allData);
			
			/*
			byte[] buffer = new byte[20];
			System.out.println("1��");
			int len = fileInput.read(buffer);
			System.out.println(new String(buffer, 0, len));
			
			System.out.println("2��");
			len = fileInput.read(buffer);
			System.out.println(new String(buffer, 0, len));*/
			
			// ���� : byte[] ������� ��� ������ ������ ����� �� �ִ� �ݺ��� �ۼ�
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
