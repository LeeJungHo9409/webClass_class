package myobj;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է¹ޱ�");
		Number cal = new Number();
		cal.info();
		//up ĳ����
		System.out.println("��ĳ����");
		Number cal2 = new Add();
		cal2.info();
		
		System.out.println("����");
		Add add = new Add();
		add.addInfo();
		
		System.out.println("������");
		Division div = new Division();
		div.info();
		
		System.out.println("����");
		Multiplication mul = new Multiplication();
		mul.info();
		
		
	}

}
