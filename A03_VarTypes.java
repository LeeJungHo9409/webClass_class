import java.io.PrintStream;
import java.util.Scanner;

public class A03_VarTypes {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		/*
			# 정수 타입
			  - byte		1	byte	8	bit		-128 ~ 127
			  - short		2			16			-32768 ~ 32767
			  - char		2			16			문자코드는 음수 없다 0 ~ 65535
			  - int			4			32			-21억 ~ 21억
			  - long		8			64			무수히 많음....
		*/
		
		byte min_byte = -128;
		byte max_byte = 127;
		short min_short = -32768;
		short max_short = 32767;
		int min_int = Integer.MIN_VALUE;
		int max_int = Integer.MAX_VALUE;
		long min_long = Long.MIN_VALUE;
		long max_long = Long.MAX_VALUE;
		
		// 정수 리터럴은 기본 타입이 int 타입이다.
		// int의 범위를 벗어나는 정수 리터럴을 사용하고 싶다면 뒤에 L을 붙여야한다.
		long _long = 1000000000000000000L;
		
		System.out.println("min_int\t\t: " + min_int);
		System.out.println("max_int\t\t: " + max_int);
		System.out.println("min_long\t: " + min_long);
		System.out.println("max_long\t: " + max_long);
		
		//해당 타입 값을 원하는 진법 문자열로 바꾸기
		System.out.println(Integer.toString(min_int,8));
		System.out.println(Long.toString(_long,2));
		
		/*
			# 실수 타입
			  - float		4	byte
			  - double		8	byte
			  
			실수는 주로 그래픽 계싼에 사용되면 웹 분야에서는 거의 사용하지 않음.
			실수 리터널은 기본 타입은 double 타입이다.
		*/
		
		double _double = 123.1234;
		float _float = 12333.1234f;
		
		System.out.println(_double);
		System.out.println(_float);
		
		/*
			# 참 / 거짓 (boolean) 타입
			  - boolean 타입에 들어갈 수 있는 값은 true / false 밖에 없다.
		*/
		
		boolean male = true;
		boolean powerOn = true;
		boolean overEighteen = false;
		
		/*
			# 참조형 타입
			  - 대문자로 시작하는 모든 타입
			  - 위에서 배운 소문자로 시작하는 모든 타입들은 기본형 타입이라고 부른다.
			  - String 그외 모든 클래스 타입들을 참조형 타입이라 한다.
		*/
		
		String hello1 = "안녕하세요.";
		String hello2 = "반갑습니다.";
		
		PrintStream stream = System.out;
		stream.println("wow!");
		stream.println("oh!!");
		
		/*
		 * int[] arr = new int[99]; int[][] arrT= new int[10][10];
		 * 
		 * String a = "안녕하세요";
		 * 
		 * for(int i=0; i<arr.length; i++) { arr[i] = i; System.out.println(arr[i]); }
		 * 
		 * System.out.println(a);
		 * 
		 * for(int i=0; i<arrT.length; i++) { int[] inArr = arrT[i]; for(int j=0;
		 * j<inArr.length; j++) { arrT[i][j] = j; if(j) { System.out.print("*"); }else {
		 * System.out.print(arrT[i][j]); }
		 * 
		 * } System.out.println(); }
		 */
	}

}
