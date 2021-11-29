
/*
	# 지역 내부 클래스
	  - 메서드 내부에 정의한 클래스
	  - 해당 메서드가 끝나면 수명이 다하는 클래스
	  - 해당 메서드 바깥에서는 접근할 수 없다.
*/

public class C10_LocalInnerClass {
	
	public static void main(String[] args) {
		class Apple{
			int price;
			int size;
			
			public Apple(int size, int price) {
				this.size = size;
				this.price = price;
			}
		}
		
		
		Apple apple = new Apple(10,12);
		System.out.println(apple.size);
		System.out.println(apple.price);
		
		Fruit something = test();
		something.printName();
		something.makeJuice();
		
	}
	
	public static Fruit test() {
		
		class Banana extends Fruit{
			@Override
			void printName() {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("바나나입니다.");
			}
			
			void makeJuice() {
				System.out.println("바나나쥬스!");
			}
		}
		
		return new Banana();
	}
	
}

abstract class Fruit{
	String name;
	abstract void printName();
	abstract void makeJuice();
	
}