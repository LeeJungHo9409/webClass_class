
import java.util.Scanner;

/*
	# switch-case
	 - ()���� ���� ���� ������ �ڵ带 �����ϴ� ����
	 - enum Ÿ�Ե� ����
	 - boolean �ȵ�
	 - default == else ���� ���
	 

*/
public class B04_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		num = input.nextInt();
		
		switch (num) {
		case 1: case 4:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("�׿� ���� �ƴϵǿ�..");
			break;
		}
	}

}
