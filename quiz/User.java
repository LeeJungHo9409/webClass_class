package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	int round = 0, win=0, lose = 0, draw = 0;
	int answer;
	
	public User() {};
	
	void UserSet() {	
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("�ϳ��� �������ּ��� >> ");
			answer = input.nextInt()-1;
			if(answer < 0 || answer > 2) {
				answer = -1;
			}
		} catch (InputMismatchException e) {
			System.out.println("�߸��Է�");
			answer = -1;
		}
	}
	
	int getAnswer() {
		return answer;
	}
	
	
}
