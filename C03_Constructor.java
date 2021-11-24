
/*
	# Ŭ������ ������ (Constructior)
		- Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
		- �޼������� ���� Ÿ���� �������� �ʴ´�.
		- �ν��Ͻ��� ������ �� new�� �Բ� ȣ���Ѵ�.
		- �ν��Ͻ� ������ ���� ���� ȣ��Ǵ� �޼����̱� ������
			�ַ� �ν��Ͻ� �ʱ�ȭ�� ���� ����.
		- �����ڸ� �ϳ��� �������� ���� Ŭ�������� ������ �ʴ� �⺻ �����ڰ� �����Ѵ�.
		  (�ƹ��͵� ���� ����)
		- ���� ������ �����ڰ� �����ϴ� Ŭ������ �⺻ �����ڸ� �ڵ����� ���������� �ʴ´�.
		  (�⺻ �����ڸ� ����ϰ� �ʹٸ� �⺻ �����ڸ� ��������� �����ؾ� �Ѵ�)
 */

public class C03_Constructor {
	
	public static void main(String[] args) {
		Bannan b1 = new Bannan();
		Bannan b2 = new Bannan(8,"Sumifru");
		Bannan b3 = new Bannan();
		
		Bannan[] bannanBox = new Bannan[1500];
		
//		for(int i = 0; i<bannanBox.length; i++) {
//			bannanBox[i] = new Bannan(i, null);
//			bannanBox[i].info();
//		}
		
//		System.out.println(b1.qty);
//		System.out.println(b1.brand);
//		
//		System.out.println(b2.qty);
//		System.out.println(b2.brand);
		
		b1.info();
		b2.info();
		
		new Peach(true);
		new Peach(false);
	}
}

class Bannan{
	int qty;
	String brand;
	
	//����Ʈ ������
	Bannan() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("�ٳ����� �����Ǿ����ϴ�.");
		qty = 1;
		brand = "DelMonte";
	}
	
	//������ �����ε�
	Bannan(int qty, String brand){
		this.qty = qty;
		this.brand = brand;
	}
	
	void info() {
		System.out.println("= = �ٳ��� ���� = =");
		System.out.printf("���� : %d\n�귣��� : %s\n",this.qty, this.brand);
	}
	
}

class Peach{
	boolean white;
	
	//�⺻ �����ڰ� �ƴ� �����ڰ� �����Ѵٸ�, �ڵ����� �������� �ʴ´�.
	Peach() {
		white= true;
		};
	Peach(boolean white){
		if(this.white == white) {
			System.out.println("Ȳ��");
		}else {
			System.out.println("�鵵");
		}
		
	}
}