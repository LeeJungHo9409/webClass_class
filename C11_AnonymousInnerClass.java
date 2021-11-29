
/*
	# 익명 내부 클래스
	  - 클래스를 메서드 내부에서 정의하자마자 이름도 짓지 않고 바로 사용해버리는 방식
	  - 다시 사용 불가
	  - 해당 클래스의 생성자를 호출하자마자 바로 상속을 구현할 수 있다.
 */

public class C11_AnonymousInnerClass {
	
	public static void main(String[] args) {
		test(new Fruit() {
			void printName() {
				System.out.println("추상클래스");
			}
			void makeJuice() {
				System.out.println("추상이가 클래스");
			}
		});
	}
	
	public static void test(Fruit fruit) {
		fruit.makeJuice();
		fruit.printName();
	}
}
