package quiz;
import java.util.Scanner;

public class B09_31Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 31 ������ ��������.
		// ó������ ������� �������� ���� �Է� 
		// ���� �÷��̾ �����ư��鼭 ���ڸ� ���� (�� 1~3�� �Է� ����)
		// ���� ������ �������� ����
		// �������� 31 �̻��� ���ڸ� �Է��ϴ� �÷��̾ �й�.
		
		//(turn % player) = ���� �÷��̾� �ѹ�
		
		int random;
		int i=0, playerMax, player = 1, playerValue, temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��        BASKINROBBINS 31           ��");
		System.out.println("��              GAME                 ��");
		System.out.println("��������������������������������������������������������������������������");
		
		while(i<31) {
			System.out.print("\tPlayer ���� �Է����ּ��� > ");
			playerMax = input.nextInt();
//			if(playerMax > 5 || playerMax <= 1) {
//			(�ִ��ο� : 5��)
//				System.out.println("Game Play �� ���� ���� ������ ������ �ֽʽÿ�");
//				System.out.println("2�� �̻��̸� 5�� �����̾�� �մϴ�.");
//				continue;
//			}
			
			if(playerMax <= 1) {
				System.out.println("Game Play �� ���� ���� ������ ������ �ֽʽÿ�");
				System.out.println("\t  2�� �̻��̾�� �մϴ�.");
				continue;
			}
			
			System.out.println("�ءءءءءءءءءء�Game Start�ءءءءءءءءءء�");
			random = (int)(Math.random()*playerMax)+1;
			
			while(true) {
				
				temp = random;
				
//				else if(player >= playerMax+1) {
//					player = 1;
//				}
				
//				System.out.printf("Player%d > ", (turn % player) +1);
				System.out.printf("\t%d player �� �Է��ּ��� > ", random);
				playerValue = input.nextInt();
				
				i+=playerValue;
				
				if(playerValue > 3 || playerValue < 0) {
					i-=playerValue;
//					player--;
					System.out.println("\t��1~3 ���̷� �Է����ּ���.��");
					continue;
				}else {
					System.out.printf("\t  %d player�� %d �Դϴ�.\n", random, i);
				}
//				player++;
				
				random = (int)(Math.random()*playerMax)+1;
				
				if(i >= 31) {
					System.out.printf("\t%d Player���� �й��Ͽ����ϴ�.\n", temp);
					break;
				}
			}			
			System.out.println("�ءءءءءءءءءء�Game End�ءءءءءءءءءء�");
		}
	}
}