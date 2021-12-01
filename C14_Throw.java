

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

/*
	# throw
	 - ��� ���ϴ� ���ܸ� �߻���Ų��.
	 
	# throws
	 - �ش� �޼��忡�� �߻��� �� �ִ� ���ܿ� ���� ó���� �޼��带 ȣ���� ������ �̷� �� �ִ�.
	 
	# �� ó������ �ʾƵ� �Ǵ� ����
	 - RuntimeException Ŭ������ ��� ���� ���ܵ��� �ݵ�� ó������ �ʾƵ� �ȴ�.
	 - ���� ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ���.
	 
	# �ʼ��� ó���ؾߵǴ� ����
	 - Exception Ŭ������ ��ӹ��� ���ܵ��� ó������ ������ �������� �Ұ����ϴ�.
	 - �ݵ�� try - catch�� ó�� �Ǿ�� ������ ���� ����
 */

public class C14_Throw {
	
	
	//���ο� �ֵ��� �ʼ������� ó���ؾߵȴ�! ��� �����ϸ� ����. ����ó���� ����, �̷�� ����!
	public static int awesomeMothod2() throws FileNotFoundException, IOException {
		switch ((int)(Math.random()*10)) {
		case 0:
			throw new IOException("IOExecption 11111111111111111");
		case 1:
			throw new FileNotFoundException("1��");
		case 2:
			throw new IOException("IOExecption 22222222222222222");
		default:
			throw new IllegalArgumentException("���");
		}
	}
	
	public static int awesomeMothod() {

		try {
			switch ((int)(Math.random()*10)) {
			case 0:
				throw new IOException("IOExecption 11111111111111111");
			case 1:
				throw new FileNotFoundException("1��");
			case 2:
				throw new IOException("IOExecption 22222222222222222");
			default:
				throw new IllegalArgumentException();
			}
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public static void main(String[] args) {

		try {
			awesomeMothod2();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
