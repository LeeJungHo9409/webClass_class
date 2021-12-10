package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
//객체지향이니까 자기 자신을 불러올 수 있다는 것도 알아야한다.
public class D11_DiscountDay {
	public static void main(String[] arge) {
		/*
			어떤 가게에서 할인 행사를 홀수번째 목요일에만 진행한다고 한다.
			년도와 월을 입력하면 해당 달의 모든 할인 날짜를 출력해주는 프로그램을 만들어 보세요.
		 */
		int year, mon;
		Scanner input = new Scanner(System.in);
		System.out.println("년 / 월 을 입력 바랍니다.");
		System.out.print("년도 >> ");
		year = input.nextInt();
		System.out.print("월 >> ");
		mon = input.nextInt();	
		System.out.println(sale(year, mon));
	}	
	static ArrayList<String> sale(int year, int mon) {
		ArrayList<String> dayPrint = new ArrayList<>();
		System.out.println(year + "." + mon);
		Calendar saleDay = Calendar.getInstance();
		saleDay.set(Calendar.YEAR, year);
		saleDay.set(Calendar.MONDAY, mon-1);
		SimpleDateFormat saleDaySDF = new SimpleDateFormat("MM월 dd일 E(F)");
		saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
		System.out.println(saleDaySDF.format(saleDay.getTime()));
		 
		for(int week = 1, weekDay = Calendar.THURSDAY; week<=saleDay.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH); week+=2) {
			saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, week);
			saleDay.set(Calendar.DAY_OF_WEEK, weekDay);
			dayPrint.add(saleDaySDF.format(saleDay.getTime()));
		}
		
		
//		for(int i = 1; i<saleDay.getActualMaximum(Calendar.DATE); i++) {
//			saleDay.set(Calendar.DATE, i);
//			//System.out.println(saleDay.get(Calendar.DAY_OF_WEEK));
//			if(saleDay.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1 && saleDay.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
//				dayPrint.add(saleDaySDF.format(saleDay.getTime()));
//			}
//		}
		return dayPrint;
	}
}