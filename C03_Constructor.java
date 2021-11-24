
/*
	# 클래스의 생성자 (Constructior)
		- 클래스의 이름과 똑같은 이름의 메서드
		- 메서드지만 리턴 타입을 정의하지 않는다.
		- 인스턴스를 생성할 때 new와 함께 호출한다.
		- 인스턴스 생성시 가장 먼저 호출되는 메서드이기 때문에
			주로 인스턴스 초기화에 많이 사용됨.
		- 생성자를 하나도 정의하지 않은 클래스에는 보이지 않는 기본 생성자가 존재한다.
		  (아무것도 하지 않음)
		- 따로 정의한 생성자가 존재하는 클래스는 기본 생성자를 자동으로 생성해주지 않는다.
		  (기본 생성자를 사용하고 싶다면 기본 생성자를 명시적으로 정의해야 한다)
 */

public class C03_Constructor {
	
	public static void main(String[] args) {
		Bannan b1 = new Bannan();
		Bannan b2 = new Bannan(8,"Sumifru");
		Bannan b3 = new Bannan();
		
		Bannan[] bannanBox = new Bannan[1500];
		
//		for(int i = 0; i<bannanBox.length; i++) {
//			bannanBox[i] = new Bannan(i, null);
//			bannanBox[i].info();
//		}
		
//		System.out.println(b1.qty);
//		System.out.println(b1.brand);
//		
//		System.out.println(b2.qty);
//		System.out.println(b2.brand);
		
		b1.info();
		b2.info();
		
		new Peach(true);
		new Peach(false);
	}
}

class Bannan{
	int qty;
	String brand;
	
	//디폴트 생성자
	Bannan() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("바나나가 생성되었습니다.");
		qty = 1;
		brand = "DelMonte";
	}
	
	//생성자 오버로딩
	Bannan(int qty, String brand){
		this.qty = qty;
		this.brand = brand;
	}
	
	void info() {
		System.out.println("= = 바나나 정보 = =");
		System.out.printf("개수 : %d\n브랜드명 : %s\n",this.qty, this.brand);
	}
	
}

class Peach{
	boolean white;
	
	//기본 생성자가 아닌 생성자가 존재한다면, 자동으로 생성되지 않는다.
	Peach() {
		white= true;
		};
	Peach(boolean white){
		if(this.white == white) {
			System.out.println("황도");
		}else {
			System.out.println("백도");
		}
		
	}
}