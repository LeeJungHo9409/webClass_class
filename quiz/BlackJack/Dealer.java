package quiz.BlackJack;

import java.util.Scanner;

//딜러 npc
public class Dealer{
	//할지 않할지 응답관련 랜덤값 받아 결정하는 변수
	int progress;
	Scanner input = new Scanner(System.in);
	
	//객체배열 생성했고 몇개까지 생성될지 감이 안와 10개로 설정해뒀습니다.
	//원래는 카드를 상속받아서 하려고 했는데 객체배열 쓸꺼라 굳이 할 필요가 없다 생각해서 상속 해제했습니다.
	Card[] card = new Card[10];
	
	public Dealer() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("딜러");
		
		//올려주신 게임을 진행했을때 딜러도 hit을 하는걸 봐서 구현해봤습니다.
		for(int i=0;i<card.length;i++) {
			card[i] = new Card();
			
			//0~1 둘중 하나가 나오면 1일 경우 hit 아닐경우 stand
			progress = (int)(Math.random()*2);
			if(i!=0 && progress == 1) {
				
				//중복제거 구현했는데 같은 넘버만 구현됐습니다...
				//모양까지 할라니까 복잡해져서.. ㅎㅎ;;
				deDuplication(i);
				break;
			}
		}
		
		//딜러는 처음 카드 한장을 오픈하므로..
		card[0].cardPrint();
		cardPrint();
	}
	
	//오픈하지 않는 카드 표현
	public void cardPrint(){
		System.out.println("┌───────────┐");
		System.out.println("│           │");
		System.out.println("│           │");
		System.out.println("│     X     │");
		System.out.println("│           │");
		System.out.println("│           │");
		System.out.println("│           │");
		System.out.println("└───────────┘");
	}
	
	
	//딜러의 총값을 구하는 메소드
	public int getNumberTotal() {
		int sum=0;
		int temp=0;
		for(int i=0; i<card.length;i++) {
			if(card[i] == null) {
				break;
			}
			if(card[i].number == 1) {
				
				//스페이스 1일 경우 딜러가 11을 할지 1을 할지 결정하는 코드입니다.
				progress = (int)(Math.random()*2);
				if(progress == 0) {
					card[i].number = 1;
				}else {
					temp = 11;
					card[i].number = 11;
				}
			}
			
			sum += card[i].number;
			if(temp == 11) {
				card[i].number = 1;
			}
		}
		return sum;
	}
	
	//중복제거 메소드
	void deDuplication(int count) {
		while(true) {
			if((card[count].number == card[count-1].number &&
					card[count].shape == card[count-1].shape)) {
				card[count].setDeta();
				
			}else {
				break;
			}
		}
	}
	
	//카드 출력
	public void dealerCardPrint() {
		System.out.println("DEALER");
		for(int i=0; i<card.length;i++) {
			if(card[i] == null) {
				break;
			}
			card[i].cardPrint();
		}
	}
}
