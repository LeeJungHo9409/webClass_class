package myobj;

public class Add extends Number {
	
	int total = 30;
	
	public Add() { 
		total = num1 + num2;
	}
	
	void addInfo() {
		System.out.printf("���� : %d\n", this.total);
		System.out.printf("���� : %d\n", total);
	}
}
