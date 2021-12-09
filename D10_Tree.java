import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
	/*
		TreeSet, TreeMap
		  - 데이터를 추가할 때 추가하면서 자기 자리로 찾아가는 자료구조
		  - 미리 정렬이 되어 있기 때문에 추가로 정렬할 필요가 없다.
		  - 정렬 순으로 저장되어 있기 때문에 Hash를 쓰는 클래스와 다르게 인덱스를 사용할 수 있다.
		  - 추가/삭제시 즉시 정렬까지 해야하기 때문에 Hash보다는 느리다. 
	 */
	
	public static void main(String[] args) {	
		//기준이 정해져있다.
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
		});
		
		numbers.add(5);
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(17);
		numbers.add(35);
		
		System.out.println(numbers);
		
		// * TreeSet은 Set의 일부분을 리턴하는데에 특화되어 있다.
		
		// headSet(toElement) : Set의 맨 처음부터 기준점 미만까지의 Set을 반환한다.
		// tailSet(fromElement) : 기준점부터 Set의 맨 끝까지의 Set을 반환한다.
		System.out.println(numbers.headSet(30));
		System.out.println(numbers.tailSet(30));
		
		// subSet(from, to) : 범위 안의 요소들로 이루어진 Set을 반환한다.
		System.out.println(numbers.subSet(40, 5));
		
		// 원래 정렬 방향과 반대 방향인 Set을 반환한다.
		System.out.println(numbers.descendingSet());
		
		// first() : 첫 번째 값을 반환한다.
		System.out.println(numbers.first());
		
		// last() : 마지막 값을 반환한다.
		System.out.println(numbers.last());
		
		
		//----------------원본의 영향을 주는 코드--------------------//
		// pollFirst() : 첫 번째 값을 삭제하면서 꺼낸다.
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		
		// pollLast() : 마지막 값을 삭제하면서 꺼낸다.
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
		//----------------원본의 영향을 주는 코드--------------------//

		// TreeMap도 TreeSet처럼 키를 기준으로 정렬해서 넣는다. (값을 기준으로 할수는 없다.)
		TreeMap<String, Integer> tree_map = new TreeMap<>();
		
		// 키값으로 정렬
		tree_map.put("apple", 100);
		tree_map.put("airplan", 20);
		tree_map.put("cat", 77);
		tree_map.put("delay", 9999);
		tree_map.put("atm", 1234);
		
		System.out.println(tree_map);
		
		System.out.println(tree_map.headMap("c"));
		System.out.println(tree_map.tailMap("c"));
		
		System.out.println(tree_map.pollFirstEntry());
		System.out.println(tree_map);
	}
}













