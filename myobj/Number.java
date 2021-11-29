package myobj;

import java.util.Scanner;

public class Number {
	
	int num1, num2;
	int total=0;
	
	public Number() {}
	
	public Number(int total) {
		// TODO Auto-generated constructor stub
		Scanner input = new Scanner(System.in);
		System.out.print("1번 입력 >> ");
		num1 = input.nextInt();
		System.out.print("2번 입력 >> ");
		num2 = input.nextInt();
		
		this.total = total;
	}
	
	void info() {
		System.out.println("합계 : " + total);
	}
}
