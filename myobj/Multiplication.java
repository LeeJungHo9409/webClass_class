package myobj;

public class Multiplication extends Number{
	
	int total;
	
	public Multiplication() { 
		total = num1*num2;
	}
	
	void info() {
		System.out.printf("รัวี : %d\n",total);
	}
}
