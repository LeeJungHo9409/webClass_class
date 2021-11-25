package myobj;

public class Division extends Number{
	int total=0;
	public Division() { 
		total = this.num1/this.num2;
	}
	
	@Override
	void info() {
		System.out.println("±Ÿµ• ≥™¥∞º¿¿Ã ¿ÃªÛ«ÿ!");
		System.out.printf("√—«’ : %d\n",total);
	}

}
