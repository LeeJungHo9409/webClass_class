package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

//������ ������� ���� �޼������ ���׸��� �����Ͽ� ��� Ÿ�Կ� ���� �� �� �ֵ��� �޼���� ��������.

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
	
	//Static Generic ���� ����.... �̷�..
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
		System.out.println("������ : " + sumOfSets(arrNumber1, arrNumber2));
		System.out.println("������ : " + interSection(arrNumber1, arrNumber2));
		System.out.println("������ : " + differesOfSets(arrNumber1, arrNumber2));	
	}
}
