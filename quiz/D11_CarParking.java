package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

//과제 - 이 페이지를 객체 지향 답게 코딩하기
//Car class 만들어주고 클래스안에 데이터를 입력 해주고 출력도 해주기 공휴일처럼 객체지향적으로

public class D11_CarParking {
	
	//공휴일
	final static ArrayList<Calendar> holidays = new ArrayList<>();
	
	static {
		holidays.add(getHolidayInstance(1, 1));
		holidays.add(getHolidayInstance(3, 1));
		holidays.add(getHolidayInstance(8, 15));
		holidays.add(getHolidayInstance(12, 25));
	}
	
	private static Calendar getHolidayInstance(int month, int day) {
		Calendar hollday = Calendar.getInstance();
		hollday.set(Calendar.MONTH, month-1);
		hollday.set(Calendar.DATE, day);
		return hollday;
	}
	
	public static void main(String[] args) {
		
		/*
			2018년 3월 19일
			끝번호 차량 출입제한
			
			출입제한 끝번호
			1		 2       3        4       5
			월 1 6 / 화 2 7 / 수 3 8 / 목 4 9 / 금 5 0 / 공휴일_휴무일 적용제외
			
			제외차량
			장애인 유아동승 긴급
		 */
		
		D11_CarParking cp = new D11_CarParking();

		Calendar day = Calendar.getInstance();
		day.set(2021, 0 , 1);
		int num = Integer.valueOf(day.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat daySDF = new SimpleDateFormat("yyyy년 MM월 dd일 E요일입니다.");
		System.out.println(daySDF.format(day.getTime()));
		
		for(int i = 0 ; i<10; i++) {
			System.out.println();
			cp.rule(cp.randomCarNumber(), day);
		}
		
	}
	
	String randomCarNumber() {
		
		int CAR_NUM_SPACE = 4;
		int carNum = (int)(Math.random()*9999+1);
		String str = Integer.toString(carNum); 
		String totalStr = ""; 
		
		if(str.length() < CAR_NUM_SPACE) {
			for(int i = 0; i< CAR_NUM_SPACE - str.length(); i++) {
				totalStr += "0";
			}
			totalStr += str;
		}else {
			totalStr = str;
		}
		
		return totalStr;
	}
	
	void rule(String carNum, Calendar day) {
		
		Calendar week = Calendar.getInstance();
		System.out.printf("\n차번호 : %s\n", carNum);
		int lastNum = carNum.charAt(3)-'0';
		String type = " 어린이 태권도";
		lastNum = lastNum == 0 ? 10 : lastNum;
		
		if(day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
				day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			System.out.println("\n주말은 출입 제한이 없습니다.");
			return;
		}else {
			for(Calendar hollyday : holidays) {
				if(hollyday.get(Calendar.MONTH) == day.get(Calendar.MONTH) 
						&& hollyday.get(Calendar.DATE) == day.get(Calendar.DATE)){
					System.out.println(" 즐거운 공휴일은 제한을 하지 않습니다.");
					return;
				}
			}
		}
		
		if(type.contains("장애") || type.contains("유아") || type.contains("어린이") || type.contains("긴급")) {
			System.out.println(type + " 차량은 제한대상이 아닙니다.");
			return;
		}
		
		for(int i = 0; i<Calendar.DAY_OF_WEEK; i++) {
			week.set(Calendar.DAY_OF_WEEK, i);
			
			if(week.get(Calendar.DAY_OF_WEEK) == day.get(Calendar.DAY_OF_WEEK)) {
				if(lastNum == i-1 || lastNum == i+4) {
					if(i+4 == 10) {
						System.out.printf("[%d, %d] 출입이 불가합니다" , i-1, 0);
					}else {
						System.out.printf("[%d, %d] 출입이 불가합니다" , i-1, i+4);
					}
				}
			}
			
		}
		
		//System.out.println("주차 가능합니다.");
	}
}













