package myobj;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%f", (double)(50/8));
		System.out.println("숫자만 입력받기");
		Number cal = new Number(0);
		//up 캐스팅
		System.out.println("업캐스팅 태스트");
		Number cal2 = new Add();
		cal2.info();
		//down 캐스팅
		System.out.println("다운캐스팅 태스트");
		cal2 = new Number(0);
		
		System.out.println("덧셈");
		Add add = new Add();
		add.info();
		
		System.out.println("나눗셈");
		Division div = new Division();
		div.info();
		
		System.out.println("곱셈");
		Multiplication mul = new Multiplication();
		mul.info();
		
		
	}

}
