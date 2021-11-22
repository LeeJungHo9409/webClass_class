
/*
	#변수 : 값을 미리 정의해두고 나중에 가져다 쓰는 것
	
	#함수 function
	  - 기능을 미리 정의해두고 나중에 가져다 쓰는 것
	  - 자바에서 함수는 반드시 클래스 내부에 선언해야 한다.
	  	(클래스 내부에 선언된 함수는 보통 메서드라고 부른다.)
	  	
	#함수 매개변수 (argument)
	  - 함수를 호출할 때 ()안에 전달하는 값을 인자라고 한다.
	  - 함수를 정의할 때 ()안에 인자값을 받을 수 있는 변수들을 매게변수라고 한다.

 */

public class C01_Method {
	
	public static void printRabbit() {
		System.out.println("=======================");
		System.out.println("\t /)/)");
		System.out.println("\t( ..)");
		System.out.println("\t( >♡");
		System.out.println("   Have a Good Time.");
		System.out.println("=======================");
	}
	
	public static void printSum(int sum, int x) {
		sum += x;
		System.out.println(sum);
	}
	
	public static int appleQuiz(int apple) {
		if(apple<0) {
			return -1;
		}
		int need = apple%10 == 0 ? apple/10 : apple/10+1;
		return need;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int need = appleQuiz(-123);
		System.out.println(need);
		
		for(int i=0;i<3;i++) {
			printRabbit();
		}
		
		int sum = 0;
		for(int i=0;i<3;i++) {
			printSum(sum, i);
		}
		
	}

}
