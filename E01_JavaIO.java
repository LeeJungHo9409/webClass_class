

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	
	/*
		# Java I/O (Input/Output)
		
		 - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ��/����� �ٷ��.
		 - ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ��� (Input)
		 - ���α׷����� ��ѵǾ� ������ �����͵��� ����̶�� �θ��� (Output)
		 
		# Stream
		 
		 - �����͵��� ������ ���
		 - �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���.
		 - �����͵��� ���α׷����� �������� ������ ��θ� OutputStream�̶�� �θ���.
		 - �����͸� Stream�� ���� �����ϱ� ���ؼ��� byteŸ������ ��ȯ���Ѿ� �Ѵ�.
	 */
	
	public static void main(String[] args) {
		try {
			//������ ������ ������ ���� �� ���� ������ ã�� �� ���� ǥ����.
			FileOutputStream out = new FileOutputStream("practice/abc.txt");
			
			out.write(48);
			out.write(49);
			out.write(50);
			out.write(51);
			
			// String.getBytes() : ���ڿ��� �����ϱ� ���� byte[]�� ��ȯ�ϴ� �޼���
			out.write("�����ٶ󸶹ٻ� ����ŸīŸ����".getBytes());
			
			//�ݴ� Ÿ�̹��� ����ڿ��� ��.
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� ���� ���� �߻�.");
			System.exit(0);
		}
		
		System.out.println("�ۼ��Ϸ�");
	}
	
}
