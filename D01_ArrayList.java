

import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
		# JAVA Documentation
		  - �ڹٴ� ����Ŭ�翡�� �ֱ������� ������Ʈ�� �� ������ �ϴ� ���
		  - ��� �ڹ� ������ ����Ŭ�� ������ �ڼ��� ����Ǿ� �ִ�.
		  -  https://docs.oracle.com/en/java/javase/17/docs/api/index.html
		  
		# JAVA Collection Interface
		  - Collection�� �ڹٿ��� �����ϴ� �ڷᱸ�� �������̽��̴�.
		  - Collection������ �������� �ٸ� Collection���� ��ȯ�� �����ϴ�.
		  - Collection �������̽��� ������ Ŭ������ List,  Set ���� �����ϴ�.
		  
		# java.util.ArrayList
		  - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ���� ������ Ŭ����
		  - �迭ó�� �����͸� ���������� �����Ѵ�.
		  - ��� �����͸� ������� �о�� �� �� ���� ������ ���� �÷����̴�.
	 */
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		// add(item) : ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�.
		// �߰��ϴ� �������� Ÿ���� <>�� �����Ѵ�.
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Grape");
		fruits.add("Melon");
		
		System.out.println(fruits);
		
		//add(index, item) : ���ϴ� ��ġ�� ���� �� ����
		
		try {
			fruits.add(2, "Melon");
			fruits.add(-1, "Melon");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("�̻��� �ε����� �ֽ��ϴ�.");
		}finally {
			System.out.println(fruits);
		}
		
		//get(index) : ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ��ȯ�Ѵ�.
		System.out.println(fruits.get(0));
		//�ش� ArrayList�� ������
		System.out.println(fruits.size());
		
		//������ ��� ��ĸ��� �̷������ε� �����ϴ�. foreach ���̶�� �Ѵ�.
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//remove(index) : �ش� ��°�� �����͸� �����Ѵ�. ��� ������ �����͸� ��ȯ�Ѵ�.
		for(int i=0; i<5; i++) {
			System.out.println("������ ������: "+fruits.remove(0));
		}
		System.out.println("������ ��� : " + fruits);
		
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		
		System.out.println("���� �� ��� : " + fruits);
		
		//remove(item) : �ش� �����Ͱ� �����Ѵٸ� �����Ѵ�. ���� ���� ���� ��ȯ�Ѵ�.
		for(int i = 0; i<7; i++) {
			System.out.println(fruits);
			System.out.println("���� ���� ���� : " + fruits.remove("Orange"));
		}
		
		
	}
}


