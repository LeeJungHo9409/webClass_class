/*
	# Ŭ���� ��� (Ȯ��)
	  - ������ ����� �ξ��� Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
	  - �������� �Ŀ��� �θ�Ŭ������ �ִ� ����� �״�� ����ϰų�,
	  	������� ���� ��� ���� (�������̵�)
	  - �ڽ� Ŭ�������� �θ� Ŭ������ ���� ���ο� ����� �߰��� ���� �ִ�.
	
	# ����� ����
	  - class Ŭ������ extends �θ�Ŭ������
	  - �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ ������(super())�� ȣ���ؾ� �Ѵ�.
	    (�����Ѵٸ� �θ��� �⺻ �����ڸ� ����Ѵ�)
	  - �θ�Ŭ������ �ڽ�Ŭ������ �Ȱ��� �̸��� �ڿ�(�ڿ�,�޼ҵ�)�� �ִٸ�
	    super�� this�� ��Ȯ�ϰ� ������ �� �ִ�.
*/
public class C05_Extend {
	public static void main(String[] args) {
		Person p1 = new Person("mag", 10);
		Person p2 = new Person("gg", 17);
		FireFighter f1 = new FireFighter("wa", 30);
		Police popo1 = new Police();
		Police popo2 = new Police("�ڰ���", 40);
		
		//�θ�Ÿ���� �䱸�ϴ� �ڸ��� �ڽ� Ÿ�� �ν��Ͻ��� �� �� �ִ�.
		popo1.arrest(p1);
		popo1.arrest(p2);
		popo1.arrest(f1);
		popo1.arrest(popo1);
		
		//�ڽ�Ÿ���� �䱸�ϴ� �ڸ��� �θ� Ÿ�� �ν��Ͻ��� �� �� ����.
		popo2.duo(popo1);
	
		//up / down ĳ����
		/*		
			# �� ĳ���� : �ڽ� Ŭ������ �θ� Ŭ������ Ÿ�� ĳ���õǴ� ��
			# �ٿ� ĳ���� : �θ� Ŭ������ �ڽ� Ŭ������ Ÿ�� ĳ���� �Ǵ� ��	
				
		*/
		
		//Police popo3 = new Person("�̼���",21); //�Ϲ����� ��� �ٿ�ĳ������ �Ұ����Ѵ�.
		
		//�ڽ� Ŭ������ �θ� Ŭ������ ��ĳ���� �� �� ������ ��ĳ���� �� ���¿����� ���� ����� �ؾ������.
		Person p3 = new FireFighter("��ҹ�", 31); // �� ĳ���� (��������) 
		
		//��ĳ���� �Ǿ��� �ڽ� Ŭ������ �ٽ� ���� �ڽ��� Ŭ������ �ٿ�ĳ���� ����
		FireFighter f3 = (FireFighter) p3; // �ٿ� ĳ���� (����)
		f3.dispatch("�ڰ�ġ����");
		
		
		p1.sayHi();
		p2.sayHi();
		
		f1.sayHi();
		f1.dispatch("������ǻ���п�");
		
		popo1.sayHi();
	}
}

//�θ�Ŭ����
class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("�ȳ� ���� "+name+"�̰�, ���̴� " + age + "�� �̾� ");
	}
}

//�ڽ�Ŭ����
class FireFighter extends Person{
	
	public FireFighter(String name, int age) { super(name,age); } //super�� �θ����� �����ִ� ���
	
	//�θ� ���� ���ο� ��� �߰�
	void dispatch(String buildding) {
		System.out.println("�ҹ�� " + name + " ���� " + buildding + "���� �⵿�߽��ϴ�.");
	}
}

class Police extends Person{
	public Police() { super("�����", 25); }
	public Police(String name, int age) { super(name, age); }
	
	@Override
	void sayHi() { System.out.println("���� ���Խ��ϴ�."); }
	
	public void arrest(Person supect) {
		//this�� ���� Ŭ���� �ȿ� this�� ����Ű�� ������ ���� ��� �θ��� ������ ����Ű�Ե�.
		System.out.printf("%s �������� ������ %s ���� ü���߽��ϴ�.\n",this.name, supect.name);
	}
	public void duo(Police police) {
		System.out.printf("%s �������� %s �������� �Բ� ���縦 �����߽��ϴ�.\n",name, police.name);
	}
}