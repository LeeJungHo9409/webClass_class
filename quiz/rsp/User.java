package quiz.rsp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	int round = 0, win=0, lose = 0, draw = 0;
	int answer;
	
	public User() {};
	public User(String round, String win, String lose, String draw) {
		this.round = Integer.valueOf(round);
		this.round = Integer.valueOf(win);
		this.round = Integer.valueOf(lose);
		this.round = Integer.valueOf(draw);
	};
	
	void UserSet() {	
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("하나를 선택해주세요 >> ");
			answer = input.nextInt()-1;
			if(answer < 0 || answer > 2) {
				answer = -1;
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못입력");
			answer = -1;
		}
	}
	
	int getAnswer() {
		return answer;
	}
	
	
}
