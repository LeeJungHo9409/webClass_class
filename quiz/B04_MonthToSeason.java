package quiz;
import java.util.Scanner;

public class B04_MonthToSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է��غ�����~ : ");
		month = input.nextInt();
		
		switch (month) {
		case 2: case 3: case 4:
			System.out.println("��");
			break;
		case 5: case 6: case 7:
			System.out.println("����");
			break;
		case 8: case 9: case 10:
			System.out.println("����");
			break;
		case 1: case 11: case 12:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�츮 �޷��� 12������ ǥ���Ǿ� �ֽ��ϴ�~");
			break;
		}
		
	}

}
