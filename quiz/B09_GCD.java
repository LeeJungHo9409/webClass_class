package quiz;

import java.util.Scanner;

public class B09_GCD {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����

		//�� ���ڸ� �Է¹����� �� ������ �ִ� ������� ���غ�����.
		
		int i, num_1, num_2, max_num1 = 0, max_num2 = 0, max = 0, x=0, y=0
				;
		String str1 = "", str2 = "";
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("����1 > ");
			num_1 = input.nextInt();
			System.out.print("����2 > ");
			num_2 = input.nextInt();
			
			if(num_1 < 0 || num_2 < 0) {
				System.out.println("�ٽ��Է����ּ���.");
			}else {
				break;
			}
		}
		
		for(i=1; i<=num_1 || i<=num_2; i++) {
			if(num_1%i == 0) {
				x = i;
				str1 += Integer.toString(i) + " ";
				
				if(max_num1 < i) {
					max_num1 = i;
				}
			}
			
			if(num_2%i == 0) {
				y = i;
				str2 += Integer.toString(i) + " ";
				
				if(max_num2 < i) {
					max_num2 = i;
				}
			}
			
			if(max_num1 == max_num2 && x <= y) {
				max = max_num2;
			}
		}
		
		System.out.println(str1 + " " + "�� �� �ִ����� : " + max);
		System.out.println(str2 + " " + "�� �� �ִ����� : " + max);
	
	}

}
