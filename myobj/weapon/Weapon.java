package myobj.weapon;

//�� Ŭ������ ��ӹ��� ���⸦ 3���� �̻� ����� ������.
//�� ����� ��ȭ Ȯ�� �� ���ݷ��� �޶�� �մϴ�.
//�� Ŭ������ ���� �׽�Ʈ�� quiz.C11_UseWeapon Ŭ������ �����ϸ� ����˴ϴ�.

abstract public class Weapon {
	
	protected String name;
	protected int attack;
	protected int level;
	
	//final�� ���� �޼���� �������̵尡 �Ұ���������.
	final public void attack() {
		System.out.printf("'%s'�� ����ƺ� ������\n", name);
		System.out.printf("'%d'�� �������� �������ϴ�.\n", attack);
	}
	
	abstract public void upgrade();
	
}
