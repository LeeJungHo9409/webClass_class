package quiz;
import java.util.Scanner;

public class B02_AppleQuiz {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����

		int appleTemp, apple;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����ϰ� ���� ��� ������ �������� : ");
		apple = input.nextInt();		
		
		appleTemp = (apple/10);
		
		if(apple <= 0) {
			System.out.println("�ּ����� �������� �۽��ϴ�. �ٽ� �õ����ּ���");
		}else if(apple >= 100){
			System.out.println("100�� �̻��̽ó׿�? �ڽ��� �������ּ���!");
		}else if(apple%10 == 0) {
			System.out.printf("����� %d�� �̹Ƿ� �ٱ��ϴ� %d ���� ����մϴ�.\n", apple, appleTemp);
		}else{
			System.out.printf("����� %d�� �̹Ƿ� �ٱ��ϴ� %d ���� ����մϴ�.\n", apple, appleTemp+1);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
