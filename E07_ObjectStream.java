import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class E07_ObjectStream {
	
	/*
 		# ObjectOutputStream, ObjectInputStream
 		 - 참조형 데이터(인스턴스)들을 전송할 수 있는 스트림
 		 - Serializable 인터페이스가 구현되어 있는 클래스의 인스턴스만 전송할 수 있다.
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
		
		System.out.println("잘 들어갔나요?");
	}
}

class MyOos extends ObjectOutputStream implements Serializable{

	public MyOos(OutputStream out) throws IOException {
		super(out);
	}
	
}


class Apple_2 implements Serializable{
/*
	# 인스턴스 변수
	  - 클래스 내부에 선언한 변수
	  - 각 인스턴스마다 값이 다를 수 있는 변수
	  - aka. 필드, 속성, 멤버 변수, 멤버, 상태
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
		return "이 사과는 크기가 " + size + "입니다";
	}
}