package quiz.BlackJack;

import java.util.Scanner;

public class Rule extends Player{
	
	
	Scanner input = new Scanner(System.in);
	int count=1;
	
	//게임룰만 따로 만들어 뒀습니다. 
	//Player 클래스를 상속받은 이유는 대부분 플레이어 위주로 짜서 많이 활용되기에 상속받았습니다.
	public Rule() {
		
		String answer;
		
		//받기 싫거나 21이 넘기전까지 계속 돌리기 위한 반복문입니다.
		while(true) {
			System.out.println("한장 더 받으시겠습니까?");
			System.out.print("받으실꺼면 'hit'를 멈출꺼면 'stand'를 입력해주세요 >> ");
			
			answer = input.next();

			//대답에 따라 겜을 끝냅니다.
			if(goStop(answer) == false) {
				System.out.println("Game Over");
				break;
			}
			
			//하지만 플레이어가 hit를 했음에도 점수가 넘었을땐 굳이 할 필요가 없기에 반복문을 종료합니다.
			if(getNumberTotal() > 21) {
				break;
			}
		}
		
	}
	
	//hit / stand 메소드를 작성했습니다.
	boolean goStop(String answer) {
		
		System.out.println(answer);
		
		if(answer.equals("stand") || answer.equals("STAND")) {
			return false;
		}else {
			//hit 했을 경우 새로운 카드를 받습니다.
			count++;
			System.out.println("현재 카드수 >> "+ (count+1));
			card[count] = new Card();
			card[count].cardPrint();;
			System.out.println(getNumberTotal());
			return true;
		}
	}
	
	//결과 출력 메소드 입니다.
	//딜러의 총합과 플레이어의 총합을 받아와 결정합니다.
	public void result(int pTotal, int dTotal) {
		
		System.out.printf("PLAYER >> %d\n", pTotal);
		System.out.printf("DEALER >> %d\n", dTotal);
		
		if(pTotal > 21) {
			System.out.println("DEALER WIN!");
		}else if(dTotal > 21){
			System.out.println("PLAYER WIN!");
		}else if(pTotal < dTotal) {
			System.out.println("DEALER WIN!");
		}else if(pTotal == dTotal){
			System.out.println("DRAW!");
		}else if(pTotal > dTotal){
			System.out.println("PLAYER WIN!");
		}
	}
	
	//플레이어의 카드를 Player 클래스에서 불러옵니다.
	public void playerCardPrint() {
		System.out.println("PLAYER");
		for(int i=0; i<card.length;i++) {
			if(card[i] == null) {
				break;
			}
			card[i].cardPrint();
		}
	}
}
