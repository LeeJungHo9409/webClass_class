package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

//기존에 만들었던 집합 메서드들을 제네릭을 적용하여 모든 타입에 대응 할 수 있도록 메서드로 만들어보세요.

public class D03_JiphapAllType {
	
	public static void main(String[] args) {
		
		JiphapAllType<Integer> jipInt = new JiphapAllType();
		JiphapAllType<Double> jipDou = new JiphapAllType();
		JiphapAllType<Character> jipChar = new JiphapAllType();
		
		for(int i = 0; i<(int)(Math.random()*10+1); i++) {
			jipInt.arrNumber1.add((int)(Math.random()*100+1));
			jipDou.arrNumber1.add(Math.random()*100+1);
			jipChar.arrNumber1.add((char)((int)(Math.random()*25+97)));
		}
		for(int i = 0; i<(int)(Math.random()*100+1); i++) {
			jipInt.arrNumber2.add(i);
			jipDou.arrNumber2.add(Math.random()*100+1);
			jipChar.arrNumber2.add((char)((int)(Math.random()*25+97)));
		}
		
		System.out.println("int");
		jipInt.shuffle();
		jipInt.printValue();
		
		System.out.println();
		System.out.println("double");
		jipDou.shuffle();
		jipDou.printValue();
		
		System.out.println();
		System.out.println("character");
		jipChar.shuffle();
		jipChar.printValue();
		
	}
}

class JiphapAllType<Type>{
	
	ArrayList<Type> arrNumber1 = new ArrayList<>();
	ArrayList<Type> arrNumber2 = new ArrayList<>();
	
	public void shuffle() {
		
		Collections.shuffle(arrNumber1);
		Collections.shuffle(arrNumber2);
		
		System.out.println(arrNumber1);
		System.out.println(arrNumber2);
	}
	
	//Static Generic 새로 생김.... 이런..
	static<Type> HashSet<Type> sumOfSets(Collection<Type> col1, Collection<Type> col2){
		HashSet<Type> sum = new HashSet<>();
		
		sum.addAll(col1);
		sum.addAll(col2);
		
		return sum;
	}
	
	HashSet<Type> interSection(Collection<Type> col1, Collection<Type> col2){
		HashSet<Type> sum = new HashSet<>();
		
		sum.addAll(col1);
		sum.retainAll(col2);
		
		return sum;
	}
	
	HashSet<Type> differesOfSets(Collection<Type> col1, Collection<Type> col2){
		HashSet<Type> sum = new HashSet<>();
		
		sum.addAll(col1);
		sum.removeAll(col2);
		
		return sum;
	}
	
	public void printValue() {
		System.out.println("합집합 : " + sumOfSets(arrNumber1, arrNumber2));
		System.out.println("교집합 : " + interSection(arrNumber1, arrNumber2));
		System.out.println("차집합 : " + differesOfSets(arrNumber1, arrNumber2));	
	}
}
