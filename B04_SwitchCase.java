
import java.util.Scanner;

/*
	# switch-case
	 - ()안의 값에 따라 실행할 코드를 결정하는 문법
	 - enum 타입도 가능
	 - boolean 안됨
	 - default == else 같은 기능
	 

*/
public class B04_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		num = input.nextInt();
		
		switch (num) {
		case 1: case 4:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("그외 숫자 아니되오..");
			break;
		}
	}

}
