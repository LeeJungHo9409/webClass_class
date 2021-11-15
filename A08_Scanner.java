import java.util.Scanner;
public class A08_Scanner {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num;
		double weight;
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = input.nextInt();
		System.out.printf("입력한 정수 : %d\n", num);
		
		System.out.printf("Apple 구매할 계수? : ");
		num = input.nextInt();
		System.out.println("구매개수는 " + num + "개 입니다.");
		
		System.out.print("화물의 무게 입력 : ");
		weight = input.nextDouble();
		System.out.printf("화물의 무게 : %.2fkg\n", weight);
	}

}
