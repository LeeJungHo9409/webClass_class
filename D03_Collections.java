

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class D03_Collections {

	/*
		# java.util.Arrays
		  - �迭�� ���ϰ� �ٷ� �� �ִ� ��� Ŭ����
		  
		# java.util.Collections
		  - �÷����� ���ϰ� �ٷ� �� �ִ� ��ɵ��� ���ִ� Ŭ����
		  
		  ���ؿ����÷ο� (stack overflow)
	 */
	
	//Collections Ŭ������ �żҵ���� ���� ã�Ƽ� �����ϰ� �����غ�����.
	
	public static void main(String[] args) {
		
		//addAll() : ������ �÷��ǿ� �ѹ��� �������� ���� �߰��� �� ����Ѵ�.
		Collection<String> flavors = new HashSet<>();
		
		Collections.addAll(flavors, "Peaches'n Plutotium", "Rocky Racoon", "�����");
		System.out.println(flavors);
		
		//fill() : ������ ����Ʈ�� ���ϴ� ������ ä�� �� �ִ�.
		ArrayList<String> address = new ArrayList<>();
		
		for(int i = 0; i<26; i++) {
			char alp = 'a';
			alp = (char)((int)alp + i);
			address.add(Character.toString(alp));
		}
		
		//Collections.fill(address, "�⺻�����");
		System.out.println(address);
		
		
		//frequency() : �ش� �÷��ǿ� ���ϴ� ���� � ����ִ��� �˾Ƴ��� ��ȯ�Ѵ�.
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("�ٳ���");
		fruits.add("����");
		fruits.add("��");
		fruits.add("������");
		fruits.add("��ġ");
		fruits.add("���ڳ�");
		fruits.add("����");
		fruits.add("���");
		fruits.add("���");
		fruits.add("���");
		
		System.out.println("��� ��� : " + Collections.frequency(fruits, "���"));
		
		//indexOfSubList : �տ��� �ε��� ��ġ ã��, ���� �������� -1 ��ȯ(�׷��� �ε����� ���� ������ -1�� ��ȯ���ش�.)
		ArrayList<String> sub_fruits = new ArrayList<>();
		sub_fruits.add("Apple");
//		sub_fruits.add("�ٳ���");
//		sub_fruits.add("����");
		
		System.out.println("�κ� ������ ��ġ : " + Collections.indexOfSubList(fruits, sub_fruits));
		
		//LastIndexOfSubList : �ڿ��� �ε��� ��ġ�� ã�´�.
		System.out.println("�޺κ� ������ ��ġ : " + Collections.lastIndexOfSubList(fruits, sub_fruits));
		
		//�ִ� : Collections.max(list) / �ּ� : Collections.min(list)
		//nCopies() : ������ ���� ���ϴ� ��ŭ ������ ����Ʈ�� ����� ��ȯ�Ѵ�.
		List<Integer> copies = Collections.nCopies(15,12345);
		List<Apple> copies2 = Collections.nCopies(15,new Apple()); //�ּҰ� �����̹Ƿ� �ٲٸ� �� �ٲ�, ����Ʈ ũ�� Ű�ﶧ ������!
		
		System.out.println(copies);
		
		// rotate() : ���ϴ� ��ŭ ��ȯ ���� (���� -1, ������ +1)
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
		
		//sort() : �ش� ����Ʈ�� �������ش�. (set�� ������ ��� ���� �Ұ�)
		//�⺻�� ��������
		Collections.sort(numbers);
		System.out.println(numbers);
		//�������� ���� ���� ��������
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		//swap() : ���ϴ� �� ��Ҹ� ��ü�Ѵ�.
		Collections.swap(numbers, 3, 7);
		System.out.println(numbers);
	}
}
class Apple{
	
}


















