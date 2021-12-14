import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E04_CharacterStream {
	
	/*
		# InputStream / OutputStream
		
		 - byte������ �����͸� ����
		 
		# Reader / Writer
		 
		 - char������ �����͸� ����
		 - 2byte �̻��� �����͸� �����ҋ��� � ���(Charset, ��������)���� �ɰ��� ��ĥ�������� ���ؾ��Ѵ�.
		  								� ����Set�� ������� ���ؾ� �Ѵ�.
		
		# Charset
		 - ASCII�ڵ� ������ ��� ���ڼ��� ���������� �� ������ ���� �ڵ� �� ȸ�簡 ���������� �������.
		 - MS949	: ����ũ�μ���Ʈ�� ���ڼ�
		 - EUC-KR	: ��Ŭ������ �����ϴ� ���ڼ�
		 - UTF-8	: ���� ǥ���� �Ǵ� ���ڼ�
		 
		# incoding -> 0,1 -> decoding -> �츮�� �˼��ִ�...
	 */
	
	public static void main(String[] args) {
		File testFile = new File("practice/char.txt");
		
		//���ڴ����� ���۰���
		try (FileWriter out = new FileWriter(testFile, Charset.forName("UTF-8"));
		){
			//���� �Է�
			//�߰��� �����͸� ��Ƴ��´�.
			
			for(int i = 0; i<10; i++) {
				out.append("Hello, World (�ȳ�, �����)\n");
			}
			
			// flush() : �߰��� �����͵��� ���Ϸ� ��������.
			// close()�ÿ� �ڵ����� flush()�� ����ȴ�.
			//out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileReader in = new FileReader(testFile, Charset.forName("UTF-8"));) {
			
			int len;
			char[] buffer = new char[20];
			
			while ((len = in.read(buffer))!=-1) {
				System.out.print(new String(buffer, 0, len));
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
