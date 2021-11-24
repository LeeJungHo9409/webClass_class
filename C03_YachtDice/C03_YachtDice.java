package C03_YachtDice;

import java.util.Arrays;

/*
	# Yacht Dice를 만들어보세요
		
		Class DiceSeting - playerDice[5]
		1. 플레이어는 자기 차례에 다섯 개의 주사위를 던진다.(주사위 눈은 1~6)
		
		Class DiceRule
		2. 다섯 개의 주사위의 결과를 통해 다음을 구분해야한다.
			
			- game win rule -
			(1) 풀하우스 (같은 눈이 2개 or 3개)
			(2) 스몰 스트레이트 (4개가 순서대로 ex. 1234 / 2345)
			(3) 라지 스트레이트 (5개가 순서대로 ex. 12345 / 23456)
			(4) 4 다이스 (같은 숫자 4개)
			(5) Yacht (같은 숫자 5개)
			
			- info -
			(6) 아무것도 만족하지 못한 경우 주사위 눈 합으로 점수를 낸다.
		
		3. 플레이어는 다시 던지고 싶은 주사위를 골라서 다시 던질 수 있다.
 */

public class C03_YachtDice {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i = 0;
		while(i<10) {
			C03_DiceSeting diceSet1 = new C03_DiceSeting();
			C03_DiceSeting diceSet2 = new C03_DiceSeting();
			C03_DiceRule rule1 = new C03_DiceRule(diceSet1.diceRuleSetting());
			C03_DiceRule rule2 = new C03_DiceRule(diceSet2.diceRuleSetting());
			
			if(rule1.vs() > rule2.vs()){
				System.out.println("1번 Player Win");
			}else if(rule1.vs() == rule2.vs()){
				System.out.println("비겼네요!");
			}else{
				System.out.println("2번 Player Win");
			}
			i++;
			System.out.println();
		}

	}

}
