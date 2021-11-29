
/*
	# ���� ���� Ŭ����
	  - �޼��� ���ο� ������ Ŭ����
	  - �ش� �޼��尡 ������ ������ ���ϴ� Ŭ����
	  - �ش� �޼��� �ٱ������� ������ �� ����.
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
				// TODO �ڵ� ������ �޼ҵ� ����
				System.out.println("�ٳ����Դϴ�.");
			}
			
			void makeJuice() {
				System.out.println("�ٳ����꽺!");
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