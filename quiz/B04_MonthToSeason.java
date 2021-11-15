package quiz;
import java.util.Scanner;

public class B04_MonthToSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month;
		Scanner input = new Scanner(System.in);
		
		System.out.print("월을 입력해보세요~ : ");
		month = input.nextInt();
		
		switch (month) {
		case 2: case 3: case 4:
			System.out.println("봄");
			break;
		case 5: case 6: case 7:
			System.out.println("여름");
			break;
		case 8: case 9: case 10:
			System.out.println("가을");
			break;
		case 1: case 11: case 12:
			System.out.println("겨울");
			break;
		default:
			System.out.println("우리 달력은 12월까지 표현되어 있습니다~");
			break;
		}
		
	}

}
