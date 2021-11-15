
public class B01_Operator02 {
	
	public static void main(String[] args) {
		/*
			# 비교 연산자
			  - 두 값을 비교하여 참 또는 거짓의 결과를 내는 연산
			  - 비교 연산의 결과는 boolean 타입 값이다
			  - 산술 연산과 함께 사용하면 산술 연산을 먼저 계산한다.
			  - 부등호가 먼저 나와야한다. (ex. => x)
		*/
		
		
		int a=10, b=7;
		
		System.out.printf("a가 %d이고, b가 %d일때", a, b);
		System.out.println("a==b :" + (a==b));
		System.out.println("a!=b :" + (a!=b));
		System.out.println("a>b :" + (a>b));
		System.out.println("a<b :" + (a<b));
		System.out.println("a<=b :" + (a<=b));
		System.out.println("a>=b :" + (a>=b));
		
		/*
			# 논리 연산자
			  - boolean 타입 값으로 하는 연산
			  - 비교 연산과 논리 연산이 함께 있으면 비교 연산을 먼저 계산한다.
			  - &&(AND) 두 값이 true 일때 // ||(OR) 두 값 중 하나만 true 여도
			  - ! : NOT
		*/
		
		System.out.println(true && true);
		System.out.println(true && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
