
/*
	# �͸� ���� Ŭ����
	  - Ŭ������ �޼��� ���ο��� �������ڸ��� �̸��� ���� �ʰ� �ٷ� ����ع����� ���
	  - �ٽ� ��� �Ұ�
	  - �ش� Ŭ������ �����ڸ� ȣ�����ڸ��� �ٷ� ����� ������ �� �ִ�.
 */

public class C11_AnonymousInnerClass {
	
	public static void main(String[] args) {
		test(new Fruit() {
			void printName() {
				System.out.println("�߻�Ŭ����");
			}
			void makeJuice() {
				System.out.println("�߻��̰� Ŭ����");
			}
		});
	}
	
	public static void test(Fruit fruit) {
		fruit.makeJuice();
		fruit.printName();
	}
}
