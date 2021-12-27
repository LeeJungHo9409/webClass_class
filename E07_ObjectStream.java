import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class E07_ObjectStream {
	
	/*
 		# ObjectOutputStream, ObjectInputStream
 		 - ������ ������(�ν��Ͻ�)���� ������ �� �ִ� ��Ʈ��
 		 - Serializable �������̽��� �����Ǿ� �ִ� Ŭ������ �ν��Ͻ��� ������ �� �ִ�.
 		 - 
	 */
	
	public static void main(String[] args) {
		
		File f = new File("practice/object.txt");
		
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(f));){
			Apple_2 a =new Apple_2();
			a.size = 3136;
			out.writeObject(a);
		} catch (IOException e) {
			
		} {
			
		}
		
		System.out.println("�� ������?");
	}
}

class MyOos extends ObjectOutputStream implements Serializable{

	public MyOos(OutputStream out) throws IOException {
		super(out);
	}
	
}


class Apple_2 implements Serializable{
/*
	# �ν��Ͻ� ����
	  - Ŭ���� ���ο� ������ ����
	  - �� �ν��Ͻ����� ���� �ٸ� �� �ִ� ����
	  - aka. �ʵ�, �Ӽ�, ��� ����, ���, ����
*/
  
	int size;
	int calorie;
	int sweet;
	int price;
	char grade;
	MyOos out;
	
	
	void eat() {
		size--;
		calorie-=10;
	}
	
	@Override
	public String toString() {
		return "�� ����� ũ�Ⱑ " + size + "�Դϴ�";
	}
}