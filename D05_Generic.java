import java.util.ArrayList;

/*
	# Generic
	
	 - 클래스 내부 자원의 타입을 외부에서 나중에 지정할 수 있게 만드는 문법
	 - 개발자가 인스턴스 생성시 제네릭을 지정할 수 있다.
	 - 여러개 지정할 수도 있다.
	 - 제네릭에는 기본 타입을 사용할 수 없기 때문에 Wrapper 클래스를 사용해야 한다.
	 
	# Static Generic
	
	 - 스태틱 메서드에 제네릭을 사용할 때는 리턴타입 앞에 제네릭을 추가해준다.
	 - 클래스명.<T>메서드명() 으로 사용할 수 있다.
 */

public class D05_Generic {

	public static void main(String[] args) {
		Box<Integer> numberBox = new Box<>();
		numberBox.items = new Integer[20];
		
		Box2<Integer, Character, String> strBox = new Box2<>();
	}
	
}

class Box<Type> {
	
	//제네릭은 배열메서드로 만들 수 없다.
	Type[] items;
	
}

class Box2<Type1, Type2, Type3>{
	ArrayList<Type1> items1 = new ArrayList<>();
	ArrayList<Type2> items2 = new ArrayList<>();
	ArrayList<Type3> items3 = new ArrayList<>();
}
