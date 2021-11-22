package quiz;
import java.util.Scanner;

public class B02_AppleQuiz {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		int appleTemp, apple;
		Scanner input = new Scanner(System.in);
		
		System.out.print("구매하고 싶은 사과 개수를 적으세요 : ");
		apple = input.nextInt();		
		
		appleTemp = (apple/10);
		
		if(apple <= 0) {
			System.out.println("최소한의 개수보다 작습니다. 다시 시도해주세요");
		}else if(apple >= 100){
			System.out.println("100개 이상이시네요? 박스로 구매해주세요!");
		}else if(apple%10 == 0) {
			System.out.printf("사과의 %d개 이므로 바구니는 %d 개면 충분합니다.\n", apple, appleTemp);
		}else{
			System.out.printf("사과의 %d개 이므로 바구니는 %d 개면 충분합니다.\n", apple, appleTemp+1);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
