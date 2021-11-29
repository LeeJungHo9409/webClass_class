/*
	# �߻� Ŭ����(abstract class)
	
	  - �޼����� ���¸� ����� ���� �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	  - ���� �Ǿ��ִ� �߻� �޼��尡 ���Ե� Ŭ����
	  
	# �߻� �޼���(abstract method)
	
	  - ���� �Ǿ� �ְ� ������ ���� �޼���
	  - abstract�� �پ� �ִ� �޼���� body�� ���� �߰��� �� ����.
	  - �ݵ�� ��ӹ��� �� �ڽ� Ŭ�������� �������̵��Ͽ� �����ؾ� �Ѵ�.
	  - abstract �޼ҵ带 �������� ���� Ŭ������ �ν��Ͻ�ȭ �� �� ����.
 */
public class C07_Abstract {
	
	public static void main(String[] args) {
		test(new Teemo());
		System.out.println();
		test(new Jinx());
		test(new SurfingSinged());
	}
	
	public static void test(Champion champion) {
		champion.q_skill();
		champion.w_skill();
		champion.e_skill();
		champion.r_skill();
	}

}

//�߻� Ŭ����
abstract class Champion{
	int ad;
	int ap;
	int def;
	int hp;
	int mp;
	
	abstract void q_skill();
	abstract void w_skill();
	abstract void e_skill();
	abstract void r_skill();
//	abstract void ctrl1();
//	abstract void ctrl2();
//	abstract void ctrl3();
//	abstract void ctrl4();
}


//�� �����ؾ� �ν��Ͻ�ȭ�� �����ϴ�.
abstract class Singed extends Champion{

	@Override
	void q_skill() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("��ʹ��� �׻׻�!");
	}	
}

class SurfingSinged extends Singed{

	@Override
	void w_skill() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�ʰ��� ������");
	}

	@Override
	void e_skill() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�����ѱ��");
	}

	@Override
	void r_skill() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("������ ����");
	}
	
}

class Jinx extends Champion{
	boolean weapon;
	void q_skill() {
		if(weapon) {
			System.out.println("�ָ��ָ�! ���߻���!");
		}else {
			System.out.println("�ָ��ָ�! ���� �밡��!");
		}
	}
	void w_skill() {
		System.out.println("����!");
	}
	void e_skill() {
		System.out.println("���ۿ��� ��!");
	}
	void r_skill() {
		System.out.println("�ʰ��� ����ȭ ����!");
	}
}

class Teemo extends Champion{
	void q_skill() {
		System.out.println("���� ���� �������?");
	}
	void w_skill() {
		System.out.println("������! ��������! ��ƺ�!");
	}
	void e_skill() {
		System.out.println("������!");
	}
	void r_skill() {
		System.out.println("���� ���� ���� �����̿���..");
	}
}
