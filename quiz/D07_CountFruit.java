package quiz;

import java.util.ArrayList;
import java.util.HashMap;

/*
	�迭�� ������ �������� 1000�� �߰��� �Ŀ� �� ������ �� �� �� �����ߴ��� �������.
 */

public class D07_CountFruit {
	
	public static void main(String[] args) {
		ArrayList<Fruit> fruits = new ArrayList<>();
		HashMap<String, Integer> count = new HashMap<>();
		int[] countNumber = new int[6];
		int name;
		
		for(int i = 0; i<(int)(Math.random()*1000+1); i++) {
			name = (int)(Math.random()*6);
			
			fruits.add(new Fruit(name));
			count.put(fruits.get(i).getName(), countNumber[name]++);
		}
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("��� : " + count.get("���"));
		System.out.println("���� : " + count.get("����"));
		System.out.println("���� : " + count.get("����"));
		System.out.println("�ڸ� : " + count.get("�ڸ�"));
		System.out.println("��   : " + count.get("��"));
		System.out.println("�ٳ��� : " + count.get("�ٳ���"));
		
	}
}

class Fruit{
	
	int name;
	
	String[] FRUIT_NAME = {"���", "����", "����", "�ڸ�", "��", "�ٳ���"};
	
	public Fruit(int name) {
		this.name = name;
	}
	
	public int getNameNum() {
		return name;
	}
	
	public String getName() {
		return FRUIT_NAME[name];
	}

	@Override
	public String toString() {
		return String.format("�̸� : [%s]", FRUIT_NAME[name]);
	}
}
