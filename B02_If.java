
public class B02_If {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int num = 30;
		if(num % 10 == 0) {
			System.out.println("num ���� 10�� ����Դϴ�.");
		}else if(num % 3 == 0){
			System.out.println("num ���� 10����� �ƴ� 3�� ����Դϴ�.");
		}else if(num % 4 == 0) {
			System.out.println("num ���� 10���, 3����� �ƴ� 4�� ����Դϴ�.");
		}else {
			System.out.println("num ���� ���� �ƴմϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}
