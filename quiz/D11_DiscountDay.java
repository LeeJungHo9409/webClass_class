package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
//��ü�����̴ϱ� �ڱ� �ڽ��� �ҷ��� �� �ִٴ� �͵� �˾ƾ��Ѵ�.
public class D11_DiscountDay {
	public static void main(String[] arge) {
		/*
			� ���Կ��� ���� ��縦 Ȧ����° ����Ͽ��� �����Ѵٰ� �Ѵ�.
			�⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� ���α׷��� ����� ������.
		 */
		int year, mon;
		Scanner input = new Scanner(System.in);
		System.out.println("�� / �� �� �Է� �ٶ��ϴ�.");
		System.out.print("�⵵ >> ");
		year = input.nextInt();
		System.out.print("�� >> ");
		mon = input.nextInt();	
		System.out.println(sale(year, mon));
	}	
	static ArrayList<String> sale(int year, int mon) {
		ArrayList<String> dayPrint = new ArrayList<>();
		System.out.println(year + "." + mon);
		Calendar saleDay = Calendar.getInstance();
		saleDay.set(Calendar.YEAR, year);
		saleDay.set(Calendar.MONDAY, mon-1);
		SimpleDateFormat saleDaySDF = new SimpleDateFormat("MM�� dd�� E(F)");
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