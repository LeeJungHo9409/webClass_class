package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때까지 계속 입력받는 프로그램을 만들어보세요.
	(다른 타입 값이 입력되어도 프로그램이 강제종료 되지 않아야합니다.)
 */

public class C13_InputRightThing {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);;
		
		while(true) {
			
			try {
				System.out.print("입력 : ");
				num = input.nextInt();
				//Scanner의 특징은 찌꺼기가 남기에 찌꺼기 제거해야됨
				System.out.println("받은 값 : " + num);
				break;
			}catch(Exception e){
				System.out.println("숫자가 아닌데요?");
				System.out.println("스캐너 걸려 있던 값 : " + input.nextLine());
				e.printStackTrace();
			}
		}
		
		
	}
}
