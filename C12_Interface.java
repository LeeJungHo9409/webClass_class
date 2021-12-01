
/*
	# �������̽� (Interface)
	
	  - �ڹٴ� Ŭ���� ����� ������ ���� �� ����
	  - �������̽��� �ش� Ŭ������ �������� ����(��ĳ����)�� �ο��ϱ� ���ؼ��� �������̽��� ����ؾ� �Ѵ�.
	  - �������̽� ������ �޼���� �⺻������ abstract public �޼��尡 �ȴ�.
	  - ��� ���� ������ �Ұ��ϴ�.
	  - �������̽� ������ ������ �⺻�׾�� final static�� �ȴ�.
	  - �޼��� �տ� default�� ���̸� �������̵� ���� �ʾ��� ���� �⺻ ������ ������ �� �ִ�.
 */

public class C12_Interface {
	public static void main(String[] args) {
		Runner run = new DanceExpert();
		Swimmer swim = new DanceExpert();
		Dancer dance = new DanceExpert();
		Human human = new DanceExpert();
	}
	
}

//���赵
interface Clickable{
	void click();
}

interface Kickable{
	void kick();
}

class AppleTree implements Clickable, Kickable{
	@Override  //(���վƸ� ����)
	public void click() { System.out.println("��������� Ŭ���ؼ� ����� ��Ȯ");}
	@Override
	public void kick() { System.out.println("������� �ٷ� ���� �� ���� ����� ��Ȯ");}
}

//interface�� abstract public ��������.
interface Runner{
	//interface ���� ������ final static �����ִ�.
	int num = 10; 
	//�������̽��� �ν��Ͻ�ȭ�� �Ұ��ϴ�. �� �ҷ��� �� ����.
	default void run() { System.out.println("�⺻ �޸��� �ɷ� ¿��"); }
	void walk();
}
interface Dancer{
	abstract void dance();
}


abstract class Swimmer{
	abstract void swim();
}

class Salmon extends Swimmer{
	public Salmon() { swim(); }
	@Override
	void swim() { System.out.println("��������"); }
}

abstract class Human extends Swimmer implements Runner, Dancer{
	
	public Human() {
		swim();
		run();
		walk();
	}
	
	@Override
	void swim() { System.out.println("�չ�"); }
	
	@Override
	public void run() { System.out.println("����� �޸���"); }
	
	@Override
	public void walk() { System.out.println("����� �ȴ´�"); }
	
	@Override
	public void dance() {System.out.println("���� �ߴ�");}
}

class DanceExpert extends Human{
	@Override
	public void dance() {System.out.println("�� �� �ߴµ�?");}
}

class DanceBeginner extends Human{
	@Override
	public void dance() {System.out.println("�㿡 ���� ������ ��ġ�� ��?");}
}