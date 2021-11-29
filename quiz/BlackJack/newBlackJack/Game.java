package quiz.BlackJack.newBlackJack;

import java.util.Scanner;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	Deck deck = new Deck();
	
	private Card[] player = new Card[10];
	private Card[] dealer = new Card[10];
	
	private int p_index = 0;
	private int d_index = 0;

	private boolean stand = false;
	
	public Game() {
		
	}
	
	private void p_draw() {
		player[p_index++] = deck.draw(); 
	}
	
	private void d_draw() {
		dealer[d_index++] = deck.draw();
	}
	
	private int valueCheck(Card[] cards) {
		int sum = 0; 
		int ace_count = 0;
		for(int i =0; cards[i] != null; i++) {
			int temp = cards[i].rankVaule();
			if(temp == 11) {
				ace_count++;
			}
			sum+=temp;
		}
		
		while(ace_count > 0 && sum > 21) {
			//System.out.println("A 하나를 1로 사용함.");
			sum -= 10;
			ace_count--;
		}
		
		return sum;
//		
//		if(sum>21) {
//			System.out.println("BUST >> " + sum);
//			return true;
//		}else {
//			System.out.printf("총합 >> %d\n", sum);
//			return false;
//		}
	}
	
	private void print() {
		
		System.out.println("DEALER : " + (stand ? valueCheck(dealer) : "??"));
		cardPrint(dealer, !stand);
		System.out.println("PLAYER : " + valueCheck(player));
		cardPrint(player, false);
	}
	
	private void cardPrint(Card[] cards, boolean hide) {
		//딜러
		for(int line = 0; line<7; line++) {
			for(int i=0; cards[i] != null; i++) {
				Card card = cards[i];
				switch (line) {
					case 0:
						System.out.print("┌───────────┐");
					break;
					case 1:
						if(hide && i == 0) {
							System.out.printf("│        xx │");
						}else {
							System.out.printf("│        %2c │", card.getSuit());
						}
						break;
					case 2:
						System.out.print("│           │");
						break;
					case 3:
						System.out.print("│           │");
						break;
					case 4:
						if(hide && i == 0) {
							System.out.printf("│     xx    │");
						}else {
							System.out.printf("│    %2s     │", card.getRank());
						}
						break;
					case 5:
						System.out.print("│           │");
						break;
					case 6:
						System.out.print("└───────────┘");
						break;
				}
			}
			System.out.println();	
		}
	}
	
	public void play() {
		
		d_draw();
		d_draw();
		p_draw();
		p_draw();
		
		int playerValue = 0;
		int dealerValue = 0;
		
		print();
		
		while(true) {
			
			System.out.print("1. hit\t2.stand\n>>");
			int select = sc.nextInt();
			
			if(select == 1) {
				p_draw();
				playerValue = valueCheck(player);
				stand = playerValue > 21;
			}else {
				stand = true;
			}
			
			if(stand) {
				System.out.println("플레이어의 선택 끝!");
				break;
			}
			print();
			
		}
		while((dealerValue = valueCheck(dealer)) < 17) {
			d_draw();
		}
		
		print();
		
		if(playerValue > 21) {
			System.out.println("버스트..");
			return;
		}
		
		if(dealerValue > 21 || playerValue>dealerValue) {
			System.out.println("플레이어 승");
		}else if(playerValue<dealerValue) {
			System.out.println("딜러 승");
		}else {
			System.out.println("무승부");
		}
	}

}
