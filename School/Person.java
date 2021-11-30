package School;

import java.util.Arrays;

public class Person {
	char[] name;
	char[] number = new char[10];
	double avg;
	int sum=0;
	public int[] score;
	public String[][] typeName = {
			{"����", "����", "����", "���α׷��� ���", "�ü��", "�ڷᱸ��"},
			{"����", "����","������", "��Ʈ��ũ","CCNA"},
			{"����", "����", "����","�����","�ӽŷ���"}};
	public int[] typeScore;
	
	int maxScore;
	int studentClass;
	String className;
	
	public Person() {	
		
		int i;
		
		name = new char[(int)(Math.random()*6+3)];
		studentClass = (int)(Math.random()*3+1);
		
		maxScore = typeName[studentClass-1].length;
		typeScore = new int[maxScore];
		
		for(i = 0; i<name.length; i++) {
			if(i==0) {
				name[i] = (char)(((int)(Math.random()*25)+65));
			}else {
				name[i] = (char)(((int)(Math.random()*25)+97));
			}
		}
		
		for(i = 0; i<number.length; i++) {
			number[i] = (char)((int)(Math.random()*9)+48);
			if(i==0 && number[i] == '0') {
				number[i] = '1';
			}else if(i==5) {
				number[i] = '-';
			}	
		}
		
		switch (studentClass) {
		case 1:
			className = "���α׷���";	
			typeScore(maxScore);
			break;
		case 2:
			className = "��Ʈ��ũ";
			typeScore(maxScore);
			break;
		case 3:
			className = "�ӽŷ���";
			typeScore(maxScore);
			break;
		}	
		
		sum(maxScore);
		avg(sum,maxScore);
		
	}
	
	String getName() {
		String name="";
		for(int i = 0; i<this.name.length; i++) {
			name += this.name[i];
		}
		return name;
	}
	
	char[] getNumber() {
		return number;
	}
	
	int getSum() {
		return sum;
	}
	
	double getAvg() {
		return avg;
	}
	
	
	void sum(int max) {
		for(int i = 0; i<max; i++) {
			sum+=typeScore[i];
		}
	}
	
	void avg(int sum, int maxScore) {
		avg = (double)sum/(double)maxScore;
	}
	
	void typeScore(int max){
		for(int i = 0; i<max; i++) {
			typeScore[i] = (int)(Math.random()*100+1);
		}
	}
	
	void studentPrint() {
		int i;
		System.out.println("------------------------------------");
		System.out.print("�̸�\t: ");
		for(i=0; i<name.length; i++) {
			System.out.print(name[i]);
		}
		System.out.println();
		System.out.print("�й�\t: ");
		for(i=0; i<number.length; i++) {
			System.out.print(number[i]);
		}
		System.out.println();
		System.out.printf("%d��\t: %s\n", this.studentClass, className);
		System.out.printf("�����̸�\t: %s\n", Arrays.toString(typeName[studentClass-1]));
		System.out.printf("����\t: %4s\n", Arrays.toString(typeScore));
		System.out.printf("�� �հ� : %d\t��հ� : %.2f\n", getSum(), getAvg());
		System.out.println("------------------------------------");
	}
}
