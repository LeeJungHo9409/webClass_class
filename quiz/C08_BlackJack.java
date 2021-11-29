package quiz;

import quiz.BlackJack.Dealer;
import quiz.BlackJack.Rule;

/*
	# 블랙잭을 만들어보세요
	  1. 컴퓨터(딜러)와 사람(플레리어)이 카드를 뽑는다.
	  2. 처음에는 둘 모두 2장씩 받는다. 이때 딜러의 카드는 한장 가려놓는다.
	  3. 플레이어는 상황을 보고 더 뽑을지(hit) 여기서 멈출지를(stand) 결정한다.
	  4. 플레이어가 멈추면 딜러가 가려져 있던 카드를 오픈하고 규칙에 따라 카드를 뽑는다.
	    (딜러는 반드시 카드 합이 16 이하일때 무조건 뽑고, 17이상이면 무조건 멈춰야 한다.)
	  5. 플레이어의 카드 숫자들의 합이 딜러보다 높거나 정확하게 21이라면 승리한다.
	     플레이어의 카드 숫자들의 합이 21보다 크면 패배한다. (A~K)
	  6. A는 1로 쓸 수도 있고 11로 쓸 수도 있다.
	  
	  www.247blackjack.com
 */

public class C08_BlackJack {
	
	public static void main(String[] args) {
		
		Dealer d1 = new Dealer();
		Rule rule = new Rule();
		
		//결과값을 출력하기 위해 작성된 코드입니다.
		System.out.println("=======================");
		d1.dealerCardPrint(); 					//딜러 카드 총 출력
		rule.playerCardPrint();					//플레이어 카드 총 출력
		rule.result(rule.getNumberTotal(), d1.getNumberTotal()); //결과값 출력
	}
}
