
public class A06_Operator01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		/*
			# 연산자 (Operator)
			  - 계산할 때 사용하는 것
			  - +, -, *, / ...
			  
			# 산술 연산자
			  - +, -, *, /, %
			  
		*/
		
		int a=10, b=7;
		double c=7.0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
//		정수끼리 나누면 몫만 구한다.
		System.out.println(a/b);
//		연산에 실수가 포함되어 있으면 정확한 계산을 한다.
		System.out.println(a/c);
		
		System.out.println(a%b);
		
//		제곱 아님 비트연산임 Math.pow(a,b) 이게 제곱임
		System.out.println(a^b);
		double result = Math.pow(2, 4);
		System.out.println(result);
		System.out.println(Math.pow(2, 5));
		
//		Math.sqrt(a) : a의 제곱근을 구해서 반환한다.
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(50));
		
//		Math.abs(a) : a의 절대값을 구해서 반환한다.
		System.out.println(Math.abs(-55));
		
//		Math.round(a) : a를소수 첫째 자리에서 반올림한 결과를 반환
		System.out.println(Math.round(123.6));
		System.out.println(Math.round(523.1));
		
//		Math.round()로 원하는 자리에 반올림하기..
		double value =333.3456789;
		value*=10000;
		System.out.println(Math.round(value)/10000.0);
	}

}
