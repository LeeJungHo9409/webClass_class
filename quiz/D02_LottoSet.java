package quiz;

import java.util.HashSet;

public class D02_LottoSet {
	/*
		HashSet�� �̿��� �ߺ����� 7���� ���� ���ڸ� �����غ�����. (1~45)
	 */
	
	public static void main(String[] args) {
		HashSet<Integer> random = new HashSet<>();
		
		for(int i=0;i<7;i++) {
			random.add((int)(Math.random()*45+1));
		}
		
		System.out.println(random);
	}
}
