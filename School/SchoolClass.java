package School;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClass extends Person{
	
	int maxStudent = (int)(Math.random()*35+25)-10;
	Person[] student = new Person[maxStudent];
	int rank = 1;
	int[] arrRank = new int[maxStudent];
	
	public SchoolClass(int num) {
		
		int i ;
		System.out.println(num+"반은 총 "+maxStudent+"명 입니다.");
		
		for(i = 0; i<maxStudent; i++) {
			student[i] = new Person();
			if(student[i].studentClass == num) {
				if(deDuplication(i)) {
					continue;
				}
			}else {
				i--;
			}
		}
		
		rank();
		
		
	}
	
	
	boolean deDuplication(int max) {
		for(int i=0; i<max; i++) {
			if(student[max-1].number == student[i].number) {
					return false;
			}
		} 		
		return true;
	}
	
	void rank() {
		for(int i=0; i<student.length; i++) {
			for(int j=0; j<student.length; j++) {
				if(student[i].getAvg() < student[j].getAvg()) {
					rank++;
				}
			}
			arrRank[i] = rank;
			rank=1;
		}
	}
	
	void ClassPrint() {
		for(int i = 0; i<student.length; i++) {
			student[i].studentPrint();
			System.out.printf("%s학생은 %d 등입니다.\n", student[i].getName(), arrRank[i]);
		}
	}
}
