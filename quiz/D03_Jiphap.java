package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap {

	/*
		������ ����� �ϴ� �޼������ �����غ�����
		
		1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		
		2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		
		3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrNumber1 = new ArrayList<>();
		ArrayList<Integer> arrNumber2 = new ArrayList<>();
		
		for(int i = 0; i<(int)(Math.random()*100+1); i++) {
			arrNumber1.add(i);
		}
		for(int i = 0; i<(int)(Math.random()*100+1); i++) {
			arrNumber2.add(i);
		}
		
		Collections.shuffle(arrNumber1);
		Collections.shuffle(arrNumber2);
		
		System.out.println(arrNumber1);
		System.out.println(arrNumber2);
		
		System.out.println();
		System.out.println("������ : " + sumOfSets(arrNumber1, arrNumber2));
		System.out.println("������ : " + interSection(arrNumber1, arrNumber2));
		System.out.println("������ : " + differesOfSets(arrNumber1, arrNumber2));	
	}
	
	
	//������
	static HashSet<Integer> sumOfSets(Collection<Integer> col1, Collection<Integer> col2){
		
		HashSet<Integer> sum = new HashSet<>();
		
		sum.addAll(col1);
		sum.addAll(col2);
		
		return sum;  
	}
	
	//������
	static Set<Integer> interSection(Collection<Integer> col1, Collection<Integer> col2){
		
		HashSet<Integer> sum = new HashSet<>();
	
		sum.addAll(col1);
		sum.retainAll(col2);
		
//		sum.addAll(sumOfSets(col1, col2));
//		sum.removeAll(differesOfSets(col1, col2));
		
		return sum;
	}
	
	//������
	static HashSet<Integer> differesOfSets(Collection<Integer> col1, Collection<Integer> col2){
		
		HashSet<Integer> sum = new HashSet<>();
		
//		Collection<Integer> temp = new ArrayList<>();
		
//		if(col1.size() < col2.size()) {
//			temp.addAll(col2);
//			temp.removeAll(col1);
//			sum.addAll(temp);
//		}else {
//			temp.addAll(col1);
//			temp.removeAll(col2);
//			sum.addAll(temp);
//		}
		
		sum.addAll(col1);
		sum.removeAll(col2);
		
		return sum;
	}
}
