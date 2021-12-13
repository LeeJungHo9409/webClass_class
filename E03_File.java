import java.io.File;
import java.io.IOException;

/*
 	# java.io.File
 	  - ���� �ý��ۿ� ����� �� ���� �Ǵ� ���丮�� ������ ���� Ŭ����
 	  - �ν��Ͻ��� ����ִ� ������ �������� �̹� �����ϴ� ������ ������ �� �ִ�.
 	  - ���ο� �ν��Ͻ��� �����Ͽ� ���ο� ���� �Ǵ� ���丮�� ���� �ý��ۿ� �߰��� ���� �ִ�.
 */

public class E03_File {
	public static void main(String[] args) {
		File f1 = new File("practice/abc.txt");
		File f2 = new File("exercise/day01/quiz03");
		
		// exists() : �ش� ��ο� ���� �Ǵ� ���丮�� �����ϴ��� �˻�
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		
		//canXXX() : ���� Ȯ��
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		//delete() : ���� ����
		
		//mkdir() : �ش� ��ο� ���丮 ���� / ���� ���� ������ �����߻��ǰų� �������� ����
		//createNewFile() : �ش� ��ο� ���� ����
		//mkdirs() : �ش� ��ο� ���� ���� 
		
		if(!f2.exists()) {
			//f2.mkdir();
			//f2.mkdirs();
		}
		
		//isDirectory() : �ش� ����� ������ ���丮���� �˻�
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		
		
	}
}
