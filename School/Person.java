package School;

import java.util.Arrays;

public class Person {
	char[] name;
	char[] number = new char[10];
	double avg;
	int sum=0;
	public int[] score;
	public String[][] typeName = {
			{"국어", "영어", "수학", "프로그래밍 언어", "운영체제", "자료구조"},
			{"국어", "영어","리눅스", "네트워크","CCNA"},
			{"국어", "영어", "수학","통계학","머신러닝"}};
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
			className = "프로그래밍";	
			typeScore(maxScore);
			break;
		case 2:
			className = "네트워크";
			typeScore(maxScore);
			break;
		case 3:
			className = "머신런닝";
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
		System.out.print("이름\t: ");
		for(i=0; i<name.length; i++) {
			System.out.print(name[i]);
		}
		System.out.println();
		System.out.print("학번\t: ");
		for(i=0; i<number.length; i++) {
			System.out.print(number[i]);
		}
		System.out.println();
		System.out.printf("%d반\t: %s\n", this.studentClass, className);
		System.out.printf("과목이름\t: %s\n", Arrays.toString(typeName[studentClass-1]));
		System.out.printf("점수\t: %4s\n", Arrays.toString(typeScore));
		System.out.printf("총 합계 : %d\t평균값 : %.2f\n", getSum(), getAvg());
		System.out.println("------------------------------------");
	}
}
