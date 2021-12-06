package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap {

	/*
		다음의 기능을 하는 메서드들을 정의해보세요
		
		1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
		
		2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렙션의 교집합을 Set으로 반환하는 메서드
		
		3. 두 컬렉션을 매개변수로 전달 받으면 두 컬레션의 차집합을 Set으로 반환하는 메서드 
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
		System.out.println("합집합 : " + sumOfSets(arrNumber1, arrNumber2));
		System.out.println("교집합 : " + interSection(arrNumber1, arrNumber2));
		System.out.println("차집합 : " + differesOfSets(arrNumber1, arrNumber2));	
	}
	
	
	//합집합
	static HashSet<Integer> sumOfSets(Collection<Integer> col1, Collection<Integer> col2){
		
		HashSet<Integer> sum = new HashSet<>();
		
		sum.addAll(col1);
		sum.addAll(col2);
		
		return sum;  
	}
	
	//교집합
	static Set<Integer> interSection(Collection<Integer> col1, Collection<Integer> col2){
		
		HashSet<Integer> sum = new HashSet<>();
	
		sum.addAll(col1);
		sum.retainAll(col2);
		
//		sum.addAll(sumOfSets(col1, col2));
//		sum.removeAll(differesOfSets(col1, col2));
		
		return sum;
	}
	
	//차집합
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
