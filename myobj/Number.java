package myobj;

import java.util.Scanner;

public class Number {
	
	int num1, num2;
	int total=0;
	
	public Number() {
		// TODO Auto-generated constructor stub
		Scanner input = new Scanner(System.in);
		System.out.print("1�� �Է� >> ");
		num1 = input.nextInt();
		System.out.print("2�� �Է� >> ");
		num2 = input.nextInt();
	}
	
	void info() {
		System.out.println("�հ� : " + total);
	}
}
