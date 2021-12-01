

/*
	# ���ϴ� ���� ���� ���� ����ϱ�
	  - Exception�� ��� ������ �ݵ�� ó���ؾ� �ϴ� ����
	  - RuntimeException�� ��ӹ����� ó������ �ʾƵ� �Ǵ� ����
 */

public class C15_CustomException {
	public static void main(String[] args) {
		//test(11);
		try {
			test2(new DanceBeginner());
		} catch (NotSwimmerException e) {
			System.out.println("Swimmer �������̽� �ƴ�");
		}
	}
	
	public static boolean test(int num){
		if(num %2 == 0) {
			return true;
		}else {
			throw new NotEvenException();
		}
	}
	
	//�����ϴ� ��� Ÿ���� �θ� Object �Դϴ�. (��ĳ����)
	public static void test2(Object obj) throws NotSwimmerException{
		if(obj instanceof Swimmer) {
			//�ٿ�ĳ����
			((Swimmer)obj).swim();
			throw new NotSwimmerException();
		}
	}
}

class NotSwimmerException extends Exception{
	public NotSwimmerException() {
		super("���� ����!");
	}
}

//���״�� Ŀ�����ؼ� ����ϴ� ��
class NotEvenException extends RuntimeException{
	public NotEvenException() {
		super("Ȧ��������");
	}
	public NotEvenException(String msg) {
		super("msg");
	}
}