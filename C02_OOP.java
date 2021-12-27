import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/*
	# 객체지향 프로그래밍 (Object Oriented Programming)
	  - 세상에 존재하는 모든 것(객체)들을 변수와 함수로 표현하려는 프로그래밍 방법론
	  - 변수와 함수를 무분별하게 사용하는 것보다 현실에 존재하는 객체 단위로 묶어 표현하여
	  	개발을 효율적으로 진행 가능
	  - 객체(Object) : 세상에 존재하는 모든 개념
	  - 객체 메서드는 해당 객체의 변수를 변화시키는 경우가 많다.
	  
	ex) 사과
	  - 사과의 변수 : 크기, 색깔, 당도, 칼로리 등등..
	  - 사과의 메소드 (변수를 변화시키는 것)
	  	먹는다 메소드 : 크기↓ 칼로리↓ 먹은 사람의 칼로리↑
	  	던진다 메소드 : 크기에 비례한 데미지를 입힌다.
	  	냉장고 보관한다 메소드 : 유통기한이 천천히 감소한다.
	  	
	# 클래스(Class)
	  - 현실의 객체를 프로그래밍 언어로 표현한 것
	  - 클래스는 해당 객체의 설계도 역활을 한다.
	  - 클래스는 정의한 시점에서는 실체가 없다.
	  - 클래스를 이용해 찍어낸 실제 객체를 '인스턴스(INSTANCE)'라고 한다.
	  - 클래스를 이용해 실제 객체를 생성할 때는 NEW를 사용한다.
	  - 모든 클래슨느 참조현 변수 타입니다.
	  
	  
	한 파일에 하나의 퍼블릭만 있어야한다.
	메인문은 항상 public class 안에 존재해야한다.
*/

public class C02_OOP {
	
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner input = new Scanner(System.in);
		
		
		//클래스 생성
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
		//각자 값 적용 가능
//		a1.size = 10;
//		a2.size = 5;
//		a3.size = 9;
//		
//		a1.calorie = 100;
//		a2.calorie = 110;
//		a3.calorie = 90;
//		
//		System.out.println("a1"+a1.size + "크기" + a1.calorie + "kal");
//		System.out.println("a2"+a2.size + "크기" + a2.calorie + "kal");
//		System.out.println("a3"+a3.size + "크기" + a3.calorie + "kal");
//		
//		a1.eat();
//		
//		System.out.println();
//		System.out.println("a1"+a1.size + "크기" + a1.calorie + "kal");
//		System.out.println("a2"+a2.size + "크기" + a2.calorie + "kal");
//		System.out.println("a3"+a3.size + "크기" + a3.calorie + "kal");
//		
//		System.out.println();
		
		String[] hyundaiType = {"smart","modon","modon+","flux"};
		
		HyundaiCarSolid venue = new HyundaiCarSolid();
		
		int num=0, type=0;
		
		while(true) {
			System.out.print("베뉴 차량 구매(num) > ");
			
			venue.gasMileage = 13.3;
			venue.fuelType = "가솔린";
			
			System.out.println("메뉴");
			for(int i=0; i<4; i++) {
				System.out.println((i+1)+"번 : "+hyundaiType[i]);
			}
			System.out.print("옵션을 선택해주세요. > ");
			num = input.nextInt();
			if(num <=0 || num>4) {
				System.out.println("잘못 기입하셨습니다.");
				continue;
			}
			
			switch(num) {
			case 1:
				System.out.println("smart 버전 입니다.");
				venue.price = 17200000;
				System.out.print("색상을 입력해주세요.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			case 2:
				System.out.println("modon 버전 입니다.");
				venue.price = 19200000;
				System.out.print("색상을 입력해주세요.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			case 3:
				System.out.println("modon+ 버전 입니다.");
				venue.price = 20800000;
				System.out.print("색상을 입력해주세요.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			case 4:
				System.out.println("flux 버전 입니다.");
				venue.price = 22780000;
				System.out.print("색상을 입력해주세요.>");
				venue.color = input.next();
				venue.optionType(num);
				break;
			}
			
			
			
			venue.printVenue();
			
			break;
		}
	}

}


class HyundaiCarSolid{
	int price;
	double gasMileage;
	String fuelType, color;
	String[] option = new String[3];
	
	void optionType(int type) {
		switch(type) {
		//smart 버전
		case 1:
			option[0] = "통합주행모드";
			option[1] = "전방 추돌 방지 센서";
			option[2] = "메탈페인트 인사이드 도어 핸들";
			break;
		//modern
		case 2:
			option[0] = "일반 오디어 시스템(6스피커)";
			option[1] = "스마트키";
			option[2] = "버튼시동";
			break;
		//modern+
		case 3:
			option[0] = "풀오토 에어컨";
			option[1] = "하이패스 시스템";
			option[2] = "동승석 통풍시트";

			break;
		//flux
		case 4:
			option[0] = "후측방 충돌 경고";
			option[1] = "후방 교차 충돌 경고";
			option[2] = "인조가죽 적용 내장";
			break;
		default:
			System.out.println("※잘못기입 알림※");
			break;
		}
	}
	
	void sale(int type) {	
		switch(type) {
		case 1:
			//현대카드로 결제시 2.7% 할인
			price -= (int)(price*0.0027);
			break;
		case 2:
			//블루멤버스 포인트 선 사용시 -250,000 할인
			price -= 250000;
			break;
		case 3:
			//전시차 구매시 -200,000 할인
			price -= 200000;
			break;
			
		default:
			System.out.println("※'할인 없음'을 알림※");
			break;
		}
	}
	
	void printVenue() {
		System.out.printf("가격 : %d, 연비 : %f, 연료 : %s, 색상 : %s\n",price,gasMileage,fuelType,color);
		System.out.println("옵션 : ");
		for(int i=0; i<option.length;i++) {
			System.out.println(option[i]);
		}
	}
}



