

import java.util.ArrayList;
import java.util.HashSet;

public class D02_HashSet {

	/*
		# Set
		 - 집합을 구현해놓은 클래스
		 - 요소로 같은 값이 들어오는 것을 허용하지 않는다.
		 
		# Hash
		 - 같은 값을 넣으면 항상 일정한 값이 나오는 알고리즘
		 - 결과값으로 원래의 값을 유추할 수 없어야 한다.
		 - 중복 체크시에 아주 뛰어난 성능을 보인다.
		 - Hash 알고리즘으로 구현된 클래스들은 순서가 존재하지 않는다
		 
		 
	 */
	
	public static void main(String[] args) {
		HashSet<String> animals = new HashSet<>();
		
		// add : List와 Set모두 컬렉션 인터페이스의 구현체이기 때문에 비슷한 메서드를 가지고 있다.
		// 내부의 순서를 알수없다! 단, 저장될때 순서를 섞는거기 때문에 저장이 끝난 시점의 상태에선 알수있다.

		animals.add("cat");
		animals.add("dog");
		animals.add("snake");
		animals.add("frog");
		animals.add("pig");
		animals.add("black cow");
		animals.add("yellow cow");
		animals.add("cash cow");
		
		System.out.println(animals);
		
		// HashSet은 index가 없기 때문에 forEach만 사용할 수 있다.
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		// HashSet은 index가 없기 때문에 값으로만 삭제할 수 있다.		
		animals.remove("snake");
		System.out.println(animals);
		
		// HashSet에는 중복되는 값을 추가할 수 없다.
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		
		System.out.println(animals);
		
		// 컬렉션은 다른 컬렉션으로의 변환이 자유롭다.
		ArrayList<String> animal_list = new ArrayList<>(animals);
		
		animal_list.add("cat");
		animal_list.add("cat");
		animal_list.add("cat");
		animal_list.add("cat");
		animal_list.add("cat");
		System.out.println(animal_list);
		
	}
}
