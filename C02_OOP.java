import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/*
	# ��ü���� ���α׷��� (Object Oriented Programming)
	  - ���� �����ϴ� ��� ��(��ü)���� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	  - ������ �Լ��� ���к��ϰ� ����ϴ� �ͺ��� ���ǿ� �����ϴ� ��ü ������ ���� ǥ���Ͽ�
	  	������ ȿ�������� ���� ����
	  - ��ü(Object) : ���� �����ϴ� ��� ����
	  - ��ü �޼���� �ش� ��ü�� ������ ��ȭ��Ű�� ��찡 ����.
	  
	ex) ���
	  - ����� ���� : ũ��, ����, �絵, Į�θ� ���..
	  - ����� �޼ҵ� (������ ��ȭ��Ű�� ��)
	  	�Դ´� �޼ҵ� : ũ��� Į�θ��� ���� ����� Į�θ���
	  	������ �޼ҵ� : ũ�⿡ ����� �������� ������.
	  	����� �����Ѵ� �޼ҵ� : ��������� õõ�� �����Ѵ�.
	  	
	# Ŭ����(Class)
	  - ������ ��ü�� ���α׷��� ���� ǥ���� ��
	  - Ŭ������ �ش� ��ü�� ���赵 ��Ȱ�� �Ѵ�.
	  - Ŭ������ ������ ���������� ��ü�� ����.
	  - Ŭ������ �̿��� �� ���� ��ü�� '�ν��Ͻ�(INSTANCE)'��� �Ѵ�.
	  - Ŭ������ �̿��� ���� ��ü�� ������ ���� NEW�� ����Ѵ�.
	  - ��� Ŭ������ ������ ���� Ÿ�Դϴ�.
	  
	  
	�� ���Ͽ� �ϳ��� �ۺ��� �־���Ѵ�.
	���ι��� �׻� public class �ȿ� �����ؾ��Ѵ�.
*/

public class C02_OOP {
	
	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		Scanner input = new Scanner(System.in);
		
		
		//Ŭ���� ����
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
		//���� �� ���� ����
//		a1.size = 10;
//		a2.size = 5;
//		a3.size = 9;
//		
//		a1.calorie = 100;
//		a2.calorie = 110;
//		a3.calorie = 90;
//		
//		System.out.println("a1"+a1.size + "ũ��" + a1.calorie + "kal");
//		System.out.println("a2"+a2.size + "ũ��" + a2.calorie + "kal");
//		System.out.println("a3"+a3.size + "ũ��" + a3.calorie + "kal");
//		
//		a1.eat();
//		
//		System.out.println();
//		System.out.println("a1"+a1.size + "ũ��" + a1.calorie + "kal");
//		System.out.println("a2"+a2.size + "ũ��" + a2.calorie + "kal");
//		System.out.println("a3"+a3.size + "ũ��" + a3.calorie + "kal");
//		
//		System.out.println();
		
		String[] hyundaiType = {"smart","modon","modon+","flux"};
		
		HyundaiCarSolid venue = new HyundaiCarSolid();
		
		int num=0, type=0;
		
		while(true) {
			System.out.print("���� ���� ����(num) > ");
			
			venue.gasMileage = 13.3;
			venue.fuelType = "���ָ�";
			
			System.out.println("�޴�");
			for(int i=0; i<4; i++) {
				System.out.println((i+1)+"�� : "+hyundaiType[i]);
			}
			System.out.print("�ɼ��� �������ּ���. > ");
			num = input.nextInt();
			if(num <=0 || num>4) {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				continue;
			}
			
			switch(num) {
			case 1:
				System.out.println("smart ���� �Դϴ�.");
				venue.price = 17200000;
				System.out.print("������ �Է����ּ���.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			case 2:
				System.out.println("modon ���� �Դϴ�.");
				venue.price = 19200000;
				System.out.print("������ �Է����ּ���.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			case 3:
				System.out.println("modon+ ���� �Դϴ�.");
				venue.price = 20800000;
				System.out.print("������ �Է����ּ���.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			case 4:
				System.out.println("flux ���� �Դϴ�.");
				venue.price = 22780000;
				System.out.print("������ �Է����ּ���.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			}
			
			
			
			venue.printVenue();
			
			break;
		}
	}

}


class HyundaiCarSolid{
	int price;
	double gasMileage;
	String fuelType, color;
	String[] option = new String[3];
	
	void optionType(int type) {
		switch(type) {
		//smart ����
		case 1:
			option[0] = "����������";
			option[1] = "���� �ߵ� ���� ����";
			option[2] = "��Ż����Ʈ �λ��̵� ���� �ڵ�";
			break;
		//modern
		case 2:
			option[0] = "�Ϲ� ����� �ý���(6����Ŀ)";
			option[1] = "����ƮŰ";
			option[2] = "��ư�õ�";
			break;
		//modern+
		case 3:
			option[0] = "Ǯ���� ������";
			option[1] = "�����н� �ý���";
			option[2] = "���¼� ��ǳ��Ʈ";

			break;
		//flux
		case 4:
			option[0] = "������ �浹 ���";
			option[1] = "�Ĺ� ���� �浹 ���";
			option[2] = "�������� ���� ����";
			break;
		default:
			System.out.println("���߸����� �˸���");
			break;
		}
	}
	
	void sale(int type) {	
		switch(type) {
		case 1:
			//����ī��� ������ 2.7% ����
			price -= (int)(price*0.0027);
			break;
		case 2:
			//������� ����Ʈ �� ���� -250,000 ����
			price -= 250000;
			break;
		case 3:
			//������ ���Ž� -200,000 ����
			price -= 200000;
			break;
			
		default:
			System.out.println("��'���� ����'�� �˸���");
			break;
		}
	}
	
	void printVenue() {
		System.out.printf("���� : %d, ���� : %f, ���� : %s, ���� : %s\n",price,gasMileage,fuelType,color);
		System.out.println("�ɼ� : ");
		for(int i=0; i<option.length;i++) {
			System.out.println(option[i]);
		}
	}
}



