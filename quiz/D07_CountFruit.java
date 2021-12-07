package quiz;

import java.util.ArrayList;
import java.util.HashMap;

/*
	배열에 과일을 랜덤으로 1000개 추가한 후에 각 과일이 몇 번 씩 등장했는지 세어보세요.
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
		
		System.out.println("사과 : " + count.get("사과"));
		System.out.println("딸기 : " + count.get("딸기"));
		System.out.println("레몬 : " + count.get("레몬"));
		System.out.println("자몽 : " + count.get("자몽"));
		System.out.println("귤   : " + count.get("귤"));
		System.out.println("바나나 : " + count.get("바나나"));
		
	}
}

class Fruit{
	
	int name;
	
	String[] FRUIT_NAME = {"사과", "딸기", "레몬", "자몽", "귤", "바나나"};
	
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
		return String.format("이름 : [%s]", FRUIT_NAME[name]);
	}
}
