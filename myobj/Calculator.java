package myobj;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¼ýÀÚ¸¸ ÀÔ·Â¹Þ±â");
		Number cal = new Number();
		cal.info();
		//up Ä³½ºÆÃ
		System.out.println("¾÷Ä³½ºÆÃ");
		Number cal2 = new Add();
		cal2.info();
		
		System.out.println("µ¡¼À");
		Add add = new Add();
		add.addInfo();
		
		System.out.println("³ª´°¼À");
		Division div = new Division();
		div.info();
		
		System.out.println("°ö¼À");
		Multiplication mul = new Multiplication();
		mul.info();
		
		
	}

}
