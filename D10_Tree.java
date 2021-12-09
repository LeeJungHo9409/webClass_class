import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
	/*
		TreeSet, TreeMap
		  - �����͸� �߰��� �� �߰��ϸ鼭 �ڱ� �ڸ��� ã�ư��� �ڷᱸ��
		  - �̸� ������ �Ǿ� �ֱ� ������ �߰��� ������ �ʿ䰡 ����.
		  - ���� ������ ����Ǿ� �ֱ� ������ Hash�� ���� Ŭ������ �ٸ��� �ε����� ����� �� �ִ�.
		  - �߰�/������ ��� ���ı��� �ؾ��ϱ� ������ Hash���ٴ� ������. 
	 */
	
	public static void main(String[] args) {	
		//������ �������ִ�.
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
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�Ǿ� �ִ�.
		
		// headSet(toElement) : Set�� �� ó������ ������ �̸������� Set�� ��ȯ�Ѵ�.
		// tailSet(fromElement) : ���������� Set�� �� �������� Set�� ��ȯ�Ѵ�.
		System.out.println(numbers.headSet(30));
		System.out.println(numbers.tailSet(30));
		
		// subSet(from, to) : ���� ���� ��ҵ�� �̷���� Set�� ��ȯ�Ѵ�.
		System.out.println(numbers.subSet(40, 5));
		
		// ���� ���� ����� �ݴ� ������ Set�� ��ȯ�Ѵ�.
		System.out.println(numbers.descendingSet());
		
		// first() : ù ��° ���� ��ȯ�Ѵ�.
		System.out.println(numbers.first());
		
		// last() : ������ ���� ��ȯ�Ѵ�.
		System.out.println(numbers.last());
		
		
		//----------------������ ������ �ִ� �ڵ�--------------------//
		// pollFirst() : ù ��° ���� �����ϸ鼭 ������.
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		
		// pollLast() : ������ ���� �����ϸ鼭 ������.
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
		//----------------������ ������ �ִ� �ڵ�--------------------//

		// TreeMap�� TreeSetó�� Ű�� �������� �����ؼ� �ִ´�. (���� �������� �Ҽ��� ����.)
		TreeMap<String, Integer> tree_map = new TreeMap<>();
		
		// Ű������ ����
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













