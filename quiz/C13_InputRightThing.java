package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� ��������.
	(�ٸ� Ÿ�� ���� �ԷµǾ ���α׷��� �������� ���� �ʾƾ��մϴ�.)
 */

public class C13_InputRightThing {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);;
		
		while(true) {
			
			try {
				System.out.print("�Է� : ");
				num = input.nextInt();
				//Scanner�� Ư¡�� ��Ⱑ ���⿡ ��� �����ؾߵ�
				System.out.println("���� �� : " + num);
				break;
			}catch(Exception e){
				System.out.println("���ڰ� �ƴѵ���?");
				System.out.println("��ĳ�� �ɷ� �ִ� �� : " + input.nextLine());
				e.printStackTrace();
			}
		}
		
		
	}
}
