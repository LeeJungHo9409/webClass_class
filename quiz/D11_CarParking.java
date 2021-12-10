package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

//���� - �� �������� ��ü ���� ��� �ڵ��ϱ�
//Car class ������ְ� Ŭ�����ȿ� �����͸� �Է� ���ְ� ��µ� ���ֱ� ������ó�� ��ü����������

public class D11_CarParking {
	
	//������
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
			2018�� 3�� 19��
			����ȣ ���� ��������
			
			�������� ����ȣ
			1		 2       3        4       5
			�� 1 6 / ȭ 2 7 / �� 3 8 / �� 4 9 / �� 5 0 / ������_�޹��� ��������
			
			��������
			����� ���Ƶ��� ���
		 */
		
		D11_CarParking cp = new D11_CarParking();

		Calendar day = Calendar.getInstance();
		day.set(2021, 0 , 1);
		int num = Integer.valueOf(day.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat daySDF = new SimpleDateFormat("yyyy�� MM�� dd�� E�����Դϴ�.");
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
		System.out.printf("\n����ȣ : %s\n", carNum);
		int lastNum = carNum.charAt(3)-'0';
		String type = " ��� �±ǵ�";
		lastNum = lastNum == 0 ? 10 : lastNum;
		
		if(day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
				day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			System.out.println("\n�ָ��� ���� ������ �����ϴ�.");
			return;
		}else {
			for(Calendar hollyday : holidays) {
				if(hollyday.get(Calendar.MONTH) == day.get(Calendar.MONTH) 
						&& hollyday.get(Calendar.DATE) == day.get(Calendar.DATE)){
					System.out.println(" ��ſ� �������� ������ ���� �ʽ��ϴ�.");
					return;
				}
			}
		}
		
		if(type.contains("���") || type.contains("����") || type.contains("���") || type.contains("���")) {
			System.out.println(type + " ������ ���Ѵ���� �ƴմϴ�.");
			return;
		}
		
		for(int i = 0; i<Calendar.DAY_OF_WEEK; i++) {
			week.set(Calendar.DAY_OF_WEEK, i);
			
			if(week.get(Calendar.DAY_OF_WEEK) == day.get(Calendar.DAY_OF_WEEK)) {
				if(lastNum == i-1 || lastNum == i+4) {
					if(i+4 == 10) {
						System.out.printf("[%d, %d] ������ �Ұ��մϴ�" , i-1, 0);
					}else {
						System.out.printf("[%d, %d] ������ �Ұ��մϴ�" , i-1, i+4);
					}
				}
			}
			
		}
		
		//System.out.println("���� �����մϴ�.");
	}
}













