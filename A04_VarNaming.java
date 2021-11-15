
public class A04_VarNaming {
	public static void main(String[] args) {
		/*
			# 우리가 변수를 사용하는 이유
			  
			  1. 값을 한번에 변경할 수 있다.
			    - 같은 의미를 지닌 값을 일일이 찾아다니면서 여러번 수정할 필요가 없어진다.
			    
			  2. 값에 의미를 부여 가능
			  	- 변수의 이름을 잘 지어두면 해당 변수의 용도 쉽고 빠르게 파악 가능
		*/
		
		int apple_conunt = 5;
		int apple_price = 833;
		int apple_calorie = 90;
		
		System.out.println("사과 "+apple_conunt+", "+ apple_price+ ", "+ apple_calorie);
		System.out.println("총 가격\t: " + apple_conunt*apple_price + " 원");
		System.out.println("총 칼로리\t: " + apple_calorie * apple_conunt + " kcal");
		
		/*
			# 변수의 작명 규칙 (권장 사항)
			  (1) 두 단어 이상을 이어붙인 변수명을 사용할때 언더바 사용 (snake_case)
			  (2) 두 단어 이상을 이어붙인 사용할 때 대문자를 활용 (camelCase)
			  (3) 변수명을 첫 글자는 소문자를 사용한다.
			  (4) 클래스명의 첫 글자는 대문자를 사용한다. (참조형 변수)
			  (5) 프로그램 실행 도중 값이 변하지 않는 변수(상수) 모두 대문자를 사용한다. (영원히 변하지 않지는 않다. pi 제외)
			  	ex : MAX_VALUE, BASKET_SIZE, MAX_SCORE, PI, APPLE_CALORIE
			  (6) 변수의 용도를 파악할 수 있도록 이름을 잘 지어야한다.
			  
			# 변수의 작명 규칙2 (필수)
			  (1) 변수의 첫 번째 글자는 숫자가 될 수 없다. 컴퓨터는 리터럴로 생각함.
			  (2) 변수명 사이에는 공백을 사용할 수 있다.
			  (3) 특수문자는 _와 $만 사용 가능
			  (4) 이미 해당 언어에서 사용중인 키워드는 변수명으로 사용할 수 없다.(Eclipse의 경우 보라색으로 표시된다.)
		*/
		
	}
}
