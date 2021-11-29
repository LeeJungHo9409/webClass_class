package myobj;

public class Division extends Number{
	double total;
	
	public Division() {
		if(num1 < num2) {
			this.total = (double)(num2/num1);
		}else {
			this.total = (double)(num1/num2);
		}
	}
	
	@Override
	void info() {
		// TODO 자동 생성된 메소드 스텁
		System.out.printf("%.2f\n", this.total);
	}

}
