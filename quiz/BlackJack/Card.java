package quiz.BlackJack;

import java.util.Arrays;


//Card는 공통적으로 카드를 드롭하는 클래스
public class Card {
	int shape;						//트럼프카드 모양
	int number;						//트럼프카드 숫자
	
	public Card() {
		shape = (int)(Math.random()*4+1);		//트럼프 모양은 4가지이므로
		number = (int)(Math.random()*13+1);		//K=13, Q=12, J=11, A=1 포함 13개
	}
	
	//카드출력
	public void cardPrint() {
		System.out.println("┌───────────┐");
		switch(shape) {
		case 1:
			System.out.println( "│         ♣ │");
			break;
		case 2:
			System.out.println( "│         ♥ │");
			break;
		case 3:
			System.out.println( "│         ♠ │");
			break;
		case 4:
			System.out.println( "│         ◆ │");
			break;
		}
		System.out.println("│           │");
		System.out.println("│           │");
		
		switch(number) {
		case 1:
			System.out.println( "│     A     │");
			break;
		case 11:
			System.out.println( "│     J     │");
			break;
		case 12:
			System.out.println( "│     Q     │");
			break;
		case 13:
			System.out.println( "│     K     │");
			break;
		default:
			System.out.printf( "│    %2d     │\n", number);
			break;
		}
		
		
		System.out.println("│           │");
		System.out.println("│           │");
		System.out.println("└───────────┘");
	}
	
	//새 데이터 받아오기
	public void setDeta() {
		shape = (int)(Math.random()*4+1);
		number = (int)(Math.random()*13+1);
	}
}
