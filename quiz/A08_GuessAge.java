package quiz;

import java.time.LocalDate;
import java.util.*;

public class A08_GuessAge {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int year, age;
		Scanner input = new Scanner(System.in);
		LocalDate today_year = LocalDate.now();
		
		System.out.printf("올해 년도를 작성해주세요 (ex. 20XX) : %d\n", today_year.getYear());
		
		//today_year = input.nextInt();
		System.out.print("몇년생입니까? (ex.19XX) : ");
		year = input.nextInt();
		
		age = (today_year.getYear() - year)+1;
		
		System.out.printf("현재 %d 년도이고 당신은 %d 년도에 태어났으며, 현 나이는 %d 세 입니다. \n", today_year.getYear(), year, age);
	}

}
