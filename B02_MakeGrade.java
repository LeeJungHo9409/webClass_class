import java.util.Scanner;

public class B02_MakeGrade {
	
	public static void main(String[] args) {
		
		int point;
		char rank = 'F';
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
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
		
		System.out.printf("해당 점수는 %d점이고 당신의 등급은 %c 등급이다.\n", point, rank);
	}

}
