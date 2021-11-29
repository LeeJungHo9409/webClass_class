package quiz.BlackJack;

import java.util.Scanner;

public class Player{
	
	Card[] card = new Card[10];
	Scanner input = new Scanner(System.in);
	
	//플레이어
	public Player() {
		System.out.println("플레이어");
		
		//생성되면 카드 두개 받습니다.
		card[0] = new Card();
		card[1] = new Card();
		
		//중복값 제거
		deDuplication(1);
		
		//카드 출력
		card[0].cardPrint();
		card[1].cardPrint();
		
		System.out.println(getNumberTotal());
	}
	
	//플레이어의 총합
	public int getNumberTotal() {
		int sum = 0;
		int number=0;
		for(int i=0; i<card.length; i++) {
			//카드값이 null값이면 굳이 할 필요 없으니 반복문을 벗어납니다.
			if(card[i] == null) {
				break;
			}
			
			//사용자가 A가 나왔을경우 1 or 11을 결정해주는 코드입니다.
			//간혹가다 카드출력보다 이 문구가 먼저 뜨는 경우가 있는데, 이유는 아직 찾지 못했습니다.
			if(card[i].number == 1) {
				System.out.println("1 or 11 결정해주세요");
				number = input.nextInt();
				if(number == 1 || number == 11) {
					card[i].number = number;
				}else {
					//만약 숫자값이 벗어났으면 뒤로 가서 다시하기입니다.
					i--;
					System.out.println("숫자값이 벗어났습니다. 다시 골라주세요!");
					continue;
				}
			}
			sum += card[i].number;
			if(number == 11) {
				card[i].number = 1;
			}
		}
		
		return sum;
	}
	
	//중복값 제거와 올려주신 게임을 진행했을때, 시작시에는 플레이어는 21이 넘은 적이 없어서 구현했습니다.  
	void deDuplication(int count) {
		while(true) {
			if((card[count].number == card[count-1].number &&
					card[count].shape == card[count-1].shape)|| getNumberTotal() > 21) {
				card[count].setDeta();
			}else {
				break;
			}
		}
	}
}
