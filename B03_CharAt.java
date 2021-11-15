
public class B03_CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			# "문자열".charAt(index);
			  - 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내는 함수
			  - 첫 번째 문자는 0번 인덱스에 있다.
			  
			# "문자열".length();
			  - 해당 문자열이 몇 개의 문자로 이루어져있는지 int타입으로 반환한다.
			  - 문자열 길이 - 1은 마지막 글자의 인덱스다.
			  
			# Scanner.next()
			  - 입력받은 문자열을 공백, 탭, 줄바꿈으로 구분하여 하나씩 꺼낸다.
			  
			# Scanner.nextLine()
			  - 입력받은 문자열을 줄바꿈으로 구분하여 하나씩 꺼낸다
		 */
		
		int len = "Hello, Everyone!!".length();
		
		System.out.println("Hello, Everyone!!".charAt(8));
		System.out.println("Hello, Everyone!!".charAt(5));
		System.out.println("Hello, Everyone!!".charAt(2));
		System.out.println("Hello, Everyone!!".charAt(3));
		System.out.println("Hello, Everyone!!".charAt(9));
		System.out.println("Hello, Everyone!!".charAt(len-1));
		System.out.println("Hello, Everyone!!".length());
		
	}

}
