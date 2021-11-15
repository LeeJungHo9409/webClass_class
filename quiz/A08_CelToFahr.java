package quiz;
import java.util.Scanner;

public class A08_CelToFahr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//섭씨 celsius, 화씨 fahrenheit
		double cel, fah;
		
		System.out.print(" '℃' 를 입력해주세요 : ");
		cel = input.nextDouble();
		System.out.printf("입력하신 '℃' : %.1f℃ 입니다.\n", cel);
		
		//구글 공식 : (섭씨*1.8)+32
		fah = (cel*1.8)+32;
		
		System.out.printf("변환화여 '℉'는 %.1f℉ 입니다.\n", fah);
		
	}
}
