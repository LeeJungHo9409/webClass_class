

import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
		# JAVA Documentation
		  - 자바는 오라클사에서 주기적으로 업데이트를 및 관리를 하는 언어
		  - 모든 자바 문법은 오라클의 문서에 자세히 설명되어 있다.
		  -  https://docs.oracle.com/en/java/javase/17/docs/api/index.html
		  
		# JAVA Collection Interface
		  - Collection은 자바에서 제공하는 자료구조 인터페이스이다.
		  - Collection끼리는 언제든지 다른 Collection으로 변환이 가능하다.
		  - Collection 인터페이스를 구현한 클래스는 List,  Set 등이 가능하다.
		  
		# java.util.ArrayList
		  - 배열과 유사하지만 크기가 자동으로 조절되는 자료구조를 구현한 클래스
		  - 배열처럼 데이터를 순차적으로 저장한다.
		  - 모든 데이터를 순서대로 읽어야 할 때 가장 성능이 좋은 컬렉션이다.
	 */
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		// add(item) : 리스트의 맨 뒤에 원하는 데이터를 추가한다.
		// 추가하는 데이터의 타입은 <>에 지정한다.
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Grape");
		fruits.add("Melon");
		
		System.out.println(fruits);
		
		//add(index, item) : 원하는 위치에 넣을 수 있음
		
		try {
			fruits.add(2, "Melon");
			fruits.add(-1, "Melon");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("이상한 인덱스에 넣습니다.");
		}finally {
			System.out.println(fruits);
		}
		
		//get(index) : 리스트에서 해당 인덱스의 데이터를 하나 반환한다.
		System.out.println(fruits.get(0));
		//해당 ArrayList의 사이즈
		System.out.println(fruits.size());
		
		//기존에 썼던 방식말고 이런식으로도 가능하다. foreach 문이라고 한다.
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//remove(index) : 해당 번째의 데이터를 삭제한다. 방금 삭제한 데이터를 반환한다.
		for(int i=0; i<5; i++) {
			System.out.println("삭제된 데잍터: "+fruits.remove(0));
		}
		System.out.println("삭제후 모습 : " + fruits);
		
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		
		System.out.println("복구 후 모습 : " + fruits);
		
		//remove(item) : 해당 데이터가 존재한다면 삭제한다. 삭제 성공 여부 반환한다.
		for(int i = 0; i<7; i++) {
			System.out.println(fruits);
			System.out.println("삭제 성공 여부 : " + fruits.remove("Orange"));
		}
		
		
	}
}


