

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class D03_Collections {

	/*
		# java.util.Arrays
		  - 배열을 편하게 다룰 수 있는 기능 클래스
		  
		# java.util.Collections
		  - 컬렉션을 편하게 다룰 수 있는 기능들이 모여있는 클래스
		  
		  스텍오버플로우 (stack overflow)
	 */
	
	//Collections 클래스의 매소드들을 직접 찾아서 공부하고 정리해보세요.
	
	public static void main(String[] args) {
		
		//addAll() : 전달한 컬렉션에 한번에 여러개의 값을 추가할 때 사용한다.
		Collection<String> flavors = new HashSet<>();
		
		Collections.addAll(flavors, "Peaches'n Plutotium", "Rocky Racoon", "딸기맛");
		System.out.println(flavors);
		
		//fill() : 전달한 리스트를 원하는 값으로 채울 수 있다.
		ArrayList<String> address = new ArrayList<>();
		
		for(int i = 0; i<26; i++) {
			char alp = 'a';
			alp = (char)((int)alp + i);
			address.add(Character.toString(alp));
		}
		
		//Collections.fill(address, "기본배송지");
		System.out.println(address);
		
		
		//frequency() : 해당 컬렉션에 원하는 값이 몇개 들어있는지 알아내서 반환한다.
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("배");
		fruits.add("복숭아");
		fruits.add("리치");
		fruits.add("코코넛");
		fruits.add("망고");
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println("사과 계수 : " + Collections.frequency(fruits, "사과"));
		
		//indexOfSubList : 앞에서 인덱스 위치 찾기, 값이 여러개면 -1 반환(그러한 인덱스가 값이 없으면 -1을 반환해준다.)
		ArrayList<String> sub_fruits = new ArrayList<>();
		sub_fruits.add("Apple");
//		sub_fruits.add("바나나");
//		sub_fruits.add("망고");
		
		System.out.println("부분 집합의 위치 : " + Collections.indexOfSubList(fruits, sub_fruits));
		
		//LastIndexOfSubList : 뒤에서 인덱스 위치를 찾는다.
		System.out.println("뒷부분 집합의 위치 : " + Collections.lastIndexOfSubList(fruits, sub_fruits));
		
		//최대 : Collections.max(list) / 최소 : Collections.min(list)
		//nCopies() : 전달한 값을 원하는 만큼 복사한 리스트를 만들어 반환한다.
		List<Integer> copies = Collections.nCopies(15,12345);
		List<Apple> copies2 = Collections.nCopies(15,new Apple()); //주소값 저장이므로 바꾸면 다 바뀜, 리스트 크기 키울때 쓰세요!
		
		System.out.println(copies);
		
		// rotate() : 원하는 만큼 순환 느낌 (왼쪽 -1, 오른쪽 +1)
		List<Integer> numbers = new ArrayList<>();
		for(int index = 0; index<10;index++) {
			numbers.add(index);
		}
		while(true) {
			//new Scanner(System.in).nextLine();
			Collections.rotate(numbers, -1);
			System.out.println(numbers);
			if(numbers.get(0) == 0) {
				break;
			}
		}
		
		// shuffle()
		System.out.println();
		Collections.shuffle(numbers);
		System.out.println(numbers);
		
		//sort() : 해당 리스트를 정렬해준다. (set은 순서가 없어서 정렬 불가)
		//기본이 내림차순
		Collections.sort(numbers);
		System.out.println(numbers);
		//리버스를 같이 쓰면 오름차순
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		//swap() : 원하는 두 요소를 교체한다.
		Collections.swap(numbers, 3, 7);
		System.out.println(numbers);
	}
}
class Apple{
	
}


















