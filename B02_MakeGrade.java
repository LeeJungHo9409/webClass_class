import java.util.Scanner;

public class B02_MakeGrade {
	
	public static void main(String[] args) {
		
		int point;
		char rank = 'F';
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		point = input.nextInt();
		
		if(point >= 0 && point <=100) {
			if(point >= 90) {
				rank = 'A';
			}else if(point >= 80) {
				rank = 'B';
			}else if(point >= 70) {
				rank = 'C';
			}else if(point >= 60) {
				rank = 'D';
			}else {
				rank = 'F';
			}
		}
		
		System.out.printf("�ش� ������ %d���̰� ����� ����� %c ����̴�.\n", point, rank);
	}

}
