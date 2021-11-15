public class A02_Variable {
	/*
	 * # 변수 (Variable) - 데이터를 담을 수 있는 공간 (변할 수 있는 수) - 변수는 반드시 먼저 사용하겠다고 선언한 뒤에 사용해야
	 * 한다. - 같은 {} 내부에서 같은 이름의 변수는 다시 선언할 수 없다. - 변수는 선언한 {}를 벗어나면 죽는다 (변수의 생명주기)
	 */
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		// '=' 대입연산
		// 변수 선언시에는 그 변수에 저장할 데이터의 타입을 정해줘야한다.
		
		int x = 1234321;
		char sp = 65;
		double y = 123.3211232143435643653435;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(sp);
		
		/*
			# 변수의 선언 (declare, declaration)
			  - 변수를 선언할 때는 앞에 타입을 적고 뒤에 변수명을 적는다.
			  - 선언 후에 해당 변수에 처음으로 값을 넣는 것을 초기화라고 한다.
			  - 선언 후에 초기화 하지 않은 변수는 사용할 수 없다
			  - 선언과 동시에 초기화 할 수도 있고 나중에 초기화할 수도 있다.
		*/	
		
		int sum;
		int apple;
		int banana;
		
		apple = 'a';
		banana = 'b';
		
		System.out.println(apple * banana);
		
		/*
			2.선언과 동시에 초기화하기
		*/
		int a=3, b=2, c=1;
		int peach = 500;
		int grape = 1200;
		
		System.out.println(peach = peach * a);
		System.out.println(peach = peach * b);
		
		System.out.println(peach);
		

	}

}
