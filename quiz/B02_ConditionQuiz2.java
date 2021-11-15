package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		//문자끼리 크기 비교해보기
//			- char 타입 데이터는 실체로 정수값을 지니고 있기 때문에 문자끼리의 크기 비교가 가능
		
		char a,b,c,d,e,f, h;
		String g;
		Scanner input = new Scanner(System.in);
		
		a = 'q';
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		b = 'a';
		System.out.println("2. " + (b != (char)32 || b != (char)9));
		c = 'F';
		System.out.println("3. " + (c >= 48 && c <= 57));
		d = 'i';
		System.out.println("4. " + ((d >= 65 && d <= 90)||(d >= 97 && d <= 122)));
		e = '쎊';
		System.out.println("5. " + (e >= 0xAC00 && e <= 0xD7AF));
		h = 'ㅇ';
		System.out.println("5-1. " + ((h>=0x3131 && h<=0x318E) || (h>=0xAC00 && h<=0xD7AF)));
		f = 'か';
		System.out.println("6. " + (f >= 0x3040 && f <= 0x31FF));
		
		
		System.out.print("나가시려면 'exit' 를 입력하세요. ");
		g = input.next();
		System.out.println("7. " + g.equals("exit"));
		
		
		
		
		
		
//		while(true) {
//			System.out.print("나가시려면 'exit' 를 입력하세요. ");
//			g = input.next();
//			if(g.equals("exit")) {
//				System.out.println("7. " + g.equals("exit"));
//				break;
//			}else {
//				System.out.println("false");
//			}
//		}
		
		
		
		
		
//		System.out.println('A' < 'T');
//		System.out.println('가' < '나');
//		
////		유니코드의 16진수를 활용하기
//		System.out.printf("%s\n", Integer.toString(0xAC00,2));
//		System.out.printf("%o\n", 0xAC00);
//		System.out.printf("%d\n", 0xAC00);
//		System.out.printf("%x\n", 0xAC00);
//		System.out.printf("%c\n", 0xAC00);
	}

}
