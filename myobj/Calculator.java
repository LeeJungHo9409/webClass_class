package myobj;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%f", (double)(50/8));
		System.out.println("���ڸ� �Է¹ޱ�");
		Number cal = new Number(0);
		//up ĳ����
		System.out.println("��ĳ���� �½�Ʈ");
		Number cal2 = new Add();
		cal2.info();
		//down ĳ����
		System.out.println("�ٿ�ĳ���� �½�Ʈ");
		cal2 = new Number(0);
		
		System.out.println("����");
		Add add = new Add();
		add.info();
		
		System.out.println("������");
		Division div = new Division();
		div.info();
		
		System.out.println("����");
		Multiplication mul = new Multiplication();
		mul.info();
		
		
	}

}
